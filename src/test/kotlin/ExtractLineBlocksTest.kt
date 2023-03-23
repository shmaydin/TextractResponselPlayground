import data.StringToTextractResponse
import org.junit.jupiter.api.Test

class ExtractLineBlocksTest{
    private val textractResponseTestData = StringToTextractResponse()
    private val playground = ExtractLineBlocks()
//    private val page12JsonString = TextractResponses().page12JsonString
    private val textractResponse = textractResponseTestData.textractResponse

    @Test
    fun testtest(){
//        playground.extract(page12JsonString)
        println(textractResponse)
    }
}