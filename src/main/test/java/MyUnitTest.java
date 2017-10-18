
import com.github.alexv2018.superclass.ChildClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by vendin on 18.10.2017.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:Beans.xml"})
public class MyUnitTest {


    @Autowired
    private ChildClass defaultInterface;

    @Test
    public void testConcatenate() {
        assertEquals("Test string", defaultInterface.getStr());
    }
}
