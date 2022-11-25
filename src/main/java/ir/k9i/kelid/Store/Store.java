package ir.k9i.kelid.Store;

import java.util.HashMap;

public class Store {
    private static HashMap<String, String> container;

    public static void set(String key, String value) {
        Store.container.put(key, value);
    }

    public static String get(String key) {
        return Store.container.get(key);
    }
}
