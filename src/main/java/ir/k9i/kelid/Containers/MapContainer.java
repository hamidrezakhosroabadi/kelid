package ir.k9i.kelid.Containers;

import java.util.HashMap;

public class MapContainer<Type> {
    private HashMap<String, Type> container = new HashMap<>();

    public void push(String key, Type value) {
        this.container.put(key, value);
    }

    public Type pull(String key) {
        return this.container.get(key);
    }

    public void remove(String key) {
        this.container.remove(key);
    }

    public boolean contains(String key) {
        return this.container.containsKey(key);
    }

    public void flush(String key) {
        this.container.remove(key);
    }
}
