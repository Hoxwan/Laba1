import com.example.Main;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testFizzBuzz() {
        assert "fizz".equals(Main.FizzBuzz.fizzBuzz(5));
        assert "buzz".equals(Main.FizzBuzz.fizzBuzz(7));
        assert "fizzbuzz".equals(Main.FizzBuzz.fizzBuzz(35));
        assert "1".equals(Main.FizzBuzz.fizzBuzz(1));

    }
    @Test
    void testReverseString() {
        assert "llatsni ekam".equals(Main.ReverseString.reverseString("make install"));
        assert "54321".equals(Main.ReverseString.reverseString("12345"));
    }

    @Test
    void testQuadraticEquation() {
        double[] roots = Main.findRoots(1, -3, 2);
        assertNotNull(roots);
        assertEquals(2, roots.length);
        assertEquals(2.0, roots[0], 0.0);
        assertEquals(1.0, roots[1], 0.0);

        assertNull(Main.findRoots(1, 0, 1));
    }

    @Test
    void testSeriesSum() {
        double sum = Main.SeriesSum.calculateSeriesSum();
        assertTrue(sum > 0, "Sum should be positive"); // Проверка, что сумма положительна
    }

    @Test
    void testPalindromeChecker() {
        assertTrue(Main.PalindromeChecker.isPalindrome("madam"));
        assertFalse(Main.PalindromeChecker.isPalindrome("hello"));
    }
}

