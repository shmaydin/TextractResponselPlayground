package data

import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.jsonArray
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive
import software.amazon.awssdk.services.textract.model.Block
import software.amazon.awssdk.services.textract.model.Geometry
import software.amazon.awssdk.services.textract.model.GetDocumentTextDetectionResponse
import software.amazon.awssdk.services.textract.model.Relationship

class StringToTextractResponse() {
    // convert string to JSON, for loop through blocks and use builder to create ordered list of block objects
    // then use the builder to build the textract model
    val textractResponseBuilderString = TextractResponseString.textractFirstTwoPages
    val textractResponseBuilderJson = Json.parseToJsonElement(textractResponseBuilderString).jsonObject
    val textractResponse = buildGetDocumentTextDetectionResponse()

    private fun extractBlocksFromJsonObject(): MutableList<Block> {
        val blocks = mutableListOf<Block>()

        val blocksJson = textractResponseBuilderJson["blocks"]!!.jsonArray
        blocksJson.forEach {
            val blockJson = it.jsonObject

            // Skipped entityTypes, selectionStatus, query because theyre always null for text detection
            val block = Block.builder()
            block.blockType(blockJson["blockType"]!!.jsonPrimitive.content)
            block.confidence(blockJson["confidence"]!!.jsonPrimitive.content.toFloatOrNull())
            block.text(blockJson["text"]!!.jsonPrimitive.content)
            block.textType(blockJson["textType"]!!.jsonPrimitive.content)
            block.rowIndex(blockJson["rowIndex"]!!.jsonPrimitive.content.toIntOrNull())
            block.columnIndex(blockJson["columnIndex"]!!.jsonPrimitive.content.toIntOrNull())
            block.rowSpan(blockJson["rowSpan"]!!.jsonPrimitive.content.toIntOrNull())
            block.columnSpan(blockJson["columnSpan"]!!.jsonPrimitive.content.toIntOrNull())
            block.geometry(buildBlockGeometry(blockJson["geometry"]!!))
            block.id(blockJson["id"]!!.jsonPrimitive.content)
            block.relationships(buildBlockRelationships(blockJson["relationships"]!!))
            block.page(blockJson["page"]!!.jsonPrimitive.content.toIntOrNull())

            println(block.build())
        }

        return blocks
    }

    private fun buildGetDocumentTextDetectionResponse(): GetDocumentTextDetectionResponse {
//        val metaData = DocumentMetadata.builder()
//                .pages(textractResponseBuilderJson["documentMetadata"]!!.jsonE.content.toInt()).build()

        val responseBuilder = GetDocumentTextDetectionResponse.builder()

        // TODO: need to build metadata object
//        responseBuilder.documentMetadata(metaData)
        responseBuilder.jobStatus(textractResponseBuilderJson["jobStatus"]!!.jsonPrimitive.content)
        responseBuilder.nextToken(textractResponseBuilderJson["nextToken"]!!.jsonPrimitive.content)
        responseBuilder.blocks(extractBlocksFromJsonObject())
//        responseBuilder.warnings(textractResponseBuilderJson["warnings"]) // skip because irrelevant
        responseBuilder.statusMessage(textractResponseBuilderJson["statusMessage"]!!.jsonPrimitive.content)
        responseBuilder.detectDocumentTextModelVersion(textractResponseBuilderJson["detectDocumentTextModelVersion"]!!.jsonPrimitive.content)

        return responseBuilder.build()
    }

    private fun buildBlockGeometry(geometryJson: JsonElement): Geometry {
        val geometry = Geometry.builder()
        // TODO: Need to build bounding box and polygon objects

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
