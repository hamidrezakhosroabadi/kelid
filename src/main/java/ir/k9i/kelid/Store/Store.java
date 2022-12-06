package ir.k9i.kelid.Store;

import java.util.HashMap;
import java.util.HashSet;

public class Store {
    private static HashMap<String, String> strings = new HashMap<>();
    private static HashMap<String, Integer> integers = new HashMap<>();

    private static HashMap<String, HashSet<Integer>> sets = new HashMap<>();

    public static void set(String key, String value) {
        Store.strings.put(key, value);
    }

    public static void set(String key, Integer value) {
        Store.integers.put(key, value);
    }

    public static String get(String key, String tmp) {
        return Store.strings.get(key);
    }

    public static Integer get(String key, Integer tmp) {
        return Store.integers.get(key);
    }
}
