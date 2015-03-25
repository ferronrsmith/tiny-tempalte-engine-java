package template;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class TemplateTest {

    @Test
    public void testT() {
        assertEquals(new T("Hello {who}!").add("who", "Java").render(), "Hello Java!");
    }
    
    @Test
    public void testMultiple() {
        assertEquals(new T("Hello {who}! It's {time} ms since epoch. Yay {who}").add("who", "Java").add("time", "17-Mar-2010").render(), "Hello Java! It's 17-Mar-2010 ms since epoch. Yay Java");
    }

}
