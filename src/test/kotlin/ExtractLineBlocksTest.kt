
import org.junit.jupiter.api.Test
import textractObjectBuilders.StringToTextractResponse

class ExtractLineBlocksTest{
    private val textractResponseTestData = StringToTextractResponse()
//    private val extractLineBlocks = ExtractLineBlocks()
    private val textractResponse = textractResponseTestData.documentTextDetectionResponse

    @Test
    fun testtest(){
        println(textractResponse)
    }
}