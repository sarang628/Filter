
import com.sarang.torang.di.repository.data.Distances
import junit.framework.TestCase.assertEquals
import org.junit.Test

class DistanceTest {
    @Test
    fun test(){
        println("DistanceTest")

        println("${Distances.valueOf(Distances._100M.name)}")

        assertEquals(Distances._100M.name, Distances.findByString("100m").name)
    }
}