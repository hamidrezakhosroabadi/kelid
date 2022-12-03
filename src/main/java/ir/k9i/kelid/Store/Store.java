package ir.k9i.kelid.Store;

import java.util.HashMap;

public class Store {
    private static HashMap<String, String> strings = new HashMap<>();
    private static HashMap<String, Integer> integers = new HashMap<>();

    public static void set(String key, String value) {
        Store.strings.put(key, value);
    }

    public static void set(String key, Integer value) {
        Store.integers.put(key, value);
    }

    public static String get(String key) {
        return Store.strings.get(key);
    }
}
