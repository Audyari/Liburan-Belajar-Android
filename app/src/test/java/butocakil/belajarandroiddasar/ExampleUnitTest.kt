package butocakil.belajarandroiddasar

import butocakil.belajarandroiddasar.ui.theme.Hello
import org.junit.Assert
import org.junit.Test


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        val result = 2 + 2
        Assert.assertEquals(4, result)
        println("2 + 2 = $result")
    }

    @Test
    fun hello_test() {
        val result = Hello.sayHello("Audyari W")
        Assert.assertEquals("Hello, Audyari W!", result)
        
        println("Hello, Audyari W!")
    }
}