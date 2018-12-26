package Bell;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.management.remote.rmi._RMIConnection_Stub;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class RunTest {
    @Before
    public void printBefore(){
        System.out.println("Before");
    }

    @Test
    public void printTest(){
        System.out.println("Test");
        String s1 = "Строка";
        String s2 = "Строка";

        assertEquals(s1, s2);
    }

    @Test
    public void falseTest(){
        System.out.println("falseTest");
        String s1 = "Строка";
        String s2 = "Строка_которая_отличается";
        assertEquals(s1, s2);
    }
    // тесты не по заданию
    @Test
    public void falseTest2(){
        System.out.println("falseTest2");
        String s1 = "";
        assertNull(s1);
    }

    @After
    public void printAfter(){
        System.out.println("After");
    }
}
