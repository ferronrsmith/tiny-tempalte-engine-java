package template;

import java.util.HashMap;
import java.util.Map;

public class T {

    String template;
    Map<String, Object> options = new HashMap<>();

    public T (String template) {
        this.template = template;
    }

    public T add (String key, Object value) {
        options.put(key, value);
        return this;
    }

    public T add (Map<String, Object> map) {
        options.putAll(map);
        return this;
    }

    public String render() {
        for (Map.Entry<String, Object> entry : options.entrySet()) {
            template = template.replaceAll(String.format("\\{%s\\}", entry.getKey()), entry.getValue().toString());
        }
        return template;
    }
}
