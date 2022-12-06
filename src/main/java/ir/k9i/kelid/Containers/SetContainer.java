package ir.k9i.kelid.Containers;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class SetContainer<Type> {
    private HashMap<String, HashSet<Type>> container = new HashMap<>();

    public void push(String key, Type value) {
        this.container.getOrDefault(key, new HashSet<>()).add(value);
    }

    public Set<Type> pull(String key) {
        return this.container.get(key);
    }

    public void remove(String key, Type value) {
        this.container.get(key).remove(value);
    }

    public boolean contains(String key, Type value) {
        return this.container.get(key).contains(value);
    }

    public void flush(String key) {
        this.container.remove(key);
    }
}
