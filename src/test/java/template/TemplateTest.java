package template;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;


public class TemplateTest {

    @Test
    public void testT() {
        assertEquals(new T("Hello {who}!").add("who", "Java").render(), "Hello Java!");
    }
    
    @Test
    public void testMultiple() {
        assertEquals(new T("Hello {who}! It's {time} ms since epoch. Yay {who}")
                             .add("who", "Java")
                             .add("time", "17-Mar-2010")
                             .render(), "Hello Java! It's 17-Mar-2010 ms since epoch. Yay Java");
    }

    @Test
    public void testMultipleMap() {
        Map<String, Object> map = new HashMap<>();
        map.put("who", "Java");
        map.put("time", "17-Mar-2010");

        assertEquals(new T("Hello {who}! It's {time} ms since epoch. Yay {who}")
                             .add(map)
                             .render(), "Hello Java! It's 17-Mar-2010 ms since epoch. Yay Java");
    }

    @Test
    public void testMultipleMapWithSingle() {
        Map<String, Object> map = new HashMap<>();
        map.put("who", "Java");
        map.put("time", "17-Mar-2010");

        assertEquals(new T("Hello {who}! It's {time} ms since epoch. Yay {who}. My name is {name}")
                             .add("name", "ferron")
                             .add(map)
                            .render(), "Hello Java! It's 17-Mar-2010 ms since epoch. Yay Java. My name is ferron");
    }

}
