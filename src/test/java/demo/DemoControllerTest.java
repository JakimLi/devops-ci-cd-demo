package demo;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DemoControllerTest {


    @Test
    public void should_get_resources() throws Exception {
        DemoController demoController = new DemoController();

        String resource = demoController.resource();

        assertEquals(resource, "resources");
    }
}