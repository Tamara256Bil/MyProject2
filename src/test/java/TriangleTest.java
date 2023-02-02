import org.example.DZ4.MyException;
import org.example.DZ4.Triangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TriangleTest{

    @Test
    void test() {
        Triangle triangleClass= new Triangle();
    }


    @Test
    void Triangle()  {
        Triangle triangleClass = new Triangle();
       Assertions.assertThrows(MyException.class,()->triangleClass.Pl(10,20,30));
    }

    @ParameterizedTest
    @CsvSource({ "10,20,40,"})
   void testTriangleCsvSource(int a, int b, int c) throws MyException {
       Triangle triangleClass = new Triangle();
        Assertions.assertTrue(a>0|| b>0 || c>0);
    }


    @ParameterizedTest
    @CsvSource({ "-10,20,30","-100, 200,300","1,-2,3"})
    void testTriangleCsvSourceN(int a, int b, int c) throws MyException {
        Triangle triangleClass = new Triangle();
        Assertions.assertThrows(MyException.class,()-> triangleClass.Pl(a,b,c));

    }
}


