package ir.k9i.kelid.Containers;

import java.util.HashMap;

public class Container<Type> implements IContainer<Type> {

    private HashMap<String, Type> container = new HashMap<>();

    public void push(String key, Type value) {
        this.container.put(key, value);
    }

    public Type pull(String key) {
        return this.container.get(key);
    }

    public boolean containsKey(String key) {
        return this.container.containsKey(key);
    }

    public boolean containsValue(String key, Type value) {
        return this.container.containsValue(value);
    }

    public void remove(String key) {
        this.container.remove(key);
    }

}
