import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.registerKotlinModule
import software.amazon.awssdk.services.textract.model.GetDocumentTextDetectionResponse

class ExtractLineBlocks {
    fun extract(documentBuilderString: String) {
        // object mapper -> from string to GetDocumentTextDetectionResponse.Builder
        // Convert that builder into a GetDocumentTextDetectionResponse
        // Data class for page block - one attribute is an ordered list of data class for line blocks
        // more to do here

        val objectMapper = ObjectMapper().registerKotlinModule()

        val temp: GetDocumentTextDetectionResponse

    }
}