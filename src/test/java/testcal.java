import org.junit.Assert;
import org.junit.Test;

//import static org.junit.Assert.assertEquals;

public class testcal {

    Calculator calculator = new Calculator();
        @Test
        public void testadd(){

            int result= calculator.add(2,5);
            Assert.assertEquals(7,result);
        }




        @Test
        public void testSub(){

            int result= calculator.sub(10,5);
            Assert.assertEquals(5,result);
        }
        @Test
        public void testmultiply(){

            int result= calculator.product(10,5);
            Assert.assertEquals(5,result);
        }
        @Test
        public void testdivision(){

            int result= calculator.division  (10,5);
            Assert.assertEquals(5,result);
        }
}
