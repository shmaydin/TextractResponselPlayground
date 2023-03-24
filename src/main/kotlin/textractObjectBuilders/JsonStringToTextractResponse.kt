package textractObjectBuilders

import data.TextractResponseString
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.floatOrNull
import kotlinx.serialization.json.jsonArray
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive
import software.amazon.awssdk.services.textract.model.Block
import software.amazon.awssdk.services.textract.model.BoundingBox
import software.amazon.awssdk.services.textract.model.DocumentMetadata
import software.amazon.awssdk.services.textract.model.Geometry
import software.amazon.awssdk.services.textract.model.GetDocumentTextDetectionResponse
import software.amazon.awssdk.services.textract.model.Point
import software.amazon.awssdk.services.textract.model.Relationship

/**
 * This class converts a GetDocumentTextDetectionResponse.toBuilder() Json Object into the GetDocumentTextDetectionResponse object to be used in local testing
 * The GetDocumentTextDetectionResponse object can be accessed by instantiating this class and using StringToTextractResponse().documentTextDetectionResponse
 */
class JsonStringToTextractResponse {
    private val textractResponseBuilderString = TextractResponseString.textractFirstTwoPages
    private val textractResponseBuilderJson = Json.parseToJsonElement(textractResponseBuilderString).jsonObject
    val documentTextDetectionResponse: GetDocumentTextDetectionResponse = buildGetDocumentTextDetectionResponse()

    private fun buildGetDocumentTextDetectionResponse(): GetDocumentTextDetectionResponse {
        val responseBuilder = GetDocumentTextDetectionResponse.builder()

        responseBuilder.documentMetadata(buildMetadata())
        responseBuilder.jobStatus(textractResponseBuilderJson["jobStatus"]!!.jsonPrimitive.content)
        responseBuilder.nextToken(textractResponseBuilderJson["nextToken"]!!.jsonPrimitive.content)
        responseBuilder.blocks(buildBlockList())
//        responseBuilder.warnings(textractResponseBuilderJson["warnings"]) // skip because irrelevant
        responseBuilder.statusMessage(textractResponseBuilderJson["statusMessage"]!!.jsonPrimitive.content)
        responseBuilder.detectDocumentTextModelVersion(textractResponseBuilderJson["detectDocumentTextModelVersion"]!!.jsonPrimitive.content)

        return responseBuilder.build()
    }

    private fun buildMetadata(): DocumentMetadata {
        val metadata = DocumentMetadata.builder()
        metadata.pages(
            textractResponseBuilderJson["documentMetadata"]!!.jsonObject["pages"]!!.jsonPrimitive.content.toIntOrNull()
        )

        return metadata.build()
    }

    private fun buildBlockList(): List<Block> {
        val blocksJson = textractResponseBuilderJson["blocks"]!!.jsonArray
        val blocks = blocksJson.map {
            val blockJson = it.jsonObject

            // Skipped entityTypes, selectionStatus, query because they're always null for text detection
            val block = Block.builder()
            block.blockType(blockJson["blockType"]!!.jsonPrimitive.content)
            block.confidence(blockJson["confidence"]!!.jsonPrimitive.content.toFloatOrNull())
            block.text(blockJson["text"]!!.jsonPrimitive.content)
            block.textType(blockJson["textType"]!!.jsonPrimitive.content)
            block.rowIndex(blockJson["rowIndex"]!!.jsonPrimitive.content.toIntOrNull())
            block.columnIndex(blockJson["columnIndex"]!!.jsonPrimitive.content.toIntOrNull())
            block.rowSpan(blockJson["rowSpan"]!!.jsonPrimitive.content.toIntOrNull())
            block.columnSpan(blockJson["columnSpan"]!!.jsonPrimitive.content.toIntOrNull())
            block.geometry(buildBlockGeometry(blockJson["geometry"]!!.jsonObject))
            block.id(blockJson["id"]!!.jsonPrimitive.content)
            block.relationships(buildBlockRelationships(blockJson["relationships"]!!))
            block.page(blockJson["page"]!!.jsonPrimitive.content.toIntOrNull())
            block.build()
        }.toList()

        return blocks
    }

    private fun buildBlockGeometry(geometryJson: JsonObject): Geometry {
        val geometry = Geometry.builder()

        // add bounding box to geometry
        val boundingBox = BoundingBox.builder()
        val boundingBoxJson = geometryJson["boundingBox"]!!.jsonObject

        boundingBox.width(boundingBoxJson["width"]!!.jsonPrimitive.floatOrNull)
        boundingBox.height(boundingBoxJson["height"]!!.jsonPrimitive.floatOrNull)
        boundingBox.left(boundingBoxJson["left"]!!.jsonPrimitive.floatOrNull)
        boundingBox.top(boundingBoxJson["top"]!!.jsonPrimitive.floatOrNull)

        geometry.boundingBox(boundingBox.build())

        // add polygon to geometry
        val polygonJson = geometryJson["polygon"]!!.jsonArray
        val pointList = polygonJson.map {
            val point = Point.builder()
            point.x(it.jsonObject["x"]!!.jsonPrimitive.floatOrNull)
            point.y(it.jsonObject["y"]!!.jsonPrimitive.floatOrNull)

            point.build()
        }

        geometry.polygon(pointList)

        return geometry.build()
    }

    private fun buildBlockRelationships(input: JsonElement): Relationship {
        val relationships = Relationship.builder()

        if (input == JsonNull) return relationships.build()
        val relationshipsJson = input.jsonArray

        val relationshipIds = relationshipsJson[0].jsonObject["ids"]!!.jsonArray.map {
            it.jsonPrimitive.content
        }
        relationships.type(relationshipsJson[0].jsonObject["type"]!!.jsonPrimitive.content)
        relationships.ids(relationshipIds)

        return relationships.build()
    }
}