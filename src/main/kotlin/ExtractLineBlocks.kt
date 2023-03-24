import textractObjectBuilders.JsonStringToTextractResponse

class ExtractLineBlocks {
    fun extract(documentBuilderString: String) {
        // object mapper -> from string to GetDocumentTextDetectionResponse.Builder
        // Convert that builder into a GetDocumentTextDetectionResponse
        // Data class for page block - one attribute is an ordered list of data class for line blocks
        // more to do here
        val getDocumentTextDetectionResponse = JsonStringToTextractResponse().documentTextDetectionResponse


    }

    fun getBasicDatabaseKeys() {
        // home team, away team, and date
    }
}