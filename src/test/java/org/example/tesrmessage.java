

import org.junit.Assert;
import org.junit.Test;


public class tesrmessage {

    message m= new message();
    @Test
    public void test1(){

        Assert.assertTrue(m.sendMessage("e","","j"));
    }
    @Test
    public void test2(){

        Assert.assertTrue(m.sendMessage("e","k","j"));
    }
}
