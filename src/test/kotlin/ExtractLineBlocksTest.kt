
import org.junit.jupiter.api.Test
import textractObjectBuilders.JsonStringToTextractResponse


class ExtractLineBlocksTest{
    private val textractResponseTestDataClass = JsonStringToTextractResponse()
//    private val extractLineBlocks = ExtractLineBlocks()
    private val textractResponse = textractResponseTestDataClass.documentTextDetectionResponse

    @Test
    fun testtest(){
//        textractResponse.blocks().forEach {
//            println(it.text())
//        }
        println(textractResponse)
    }
}