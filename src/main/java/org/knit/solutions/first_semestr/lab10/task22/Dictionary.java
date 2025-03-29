package org.knit.first_semestr.lab10.task22;

import org.knit.first_semestr.lab10.task18.Pair;

import java.util.ArrayList;
import java.util.List;

public class Dictionary<K, V> {
    private List<Pair<K, V>> dictionary;

    // Конструктор
    public Dictionary() {
        dictionary = new ArrayList<>();
    }

    public V getValue(K key) {
        for (Pair<K, V> pair : dictionary) {
            if (pair.getKey().equals(key)) {
                return pair.getValue();
            }
        }
        return null;
    }

    public void put(K key, V value) {
        dictionary.add(new Pair<>(key, value));
    }

    public boolean containsKey(K key) {
        for (Pair<K, V> pair : dictionary) {
            if (pair.getKey().equals(key)) {
                return true;
            }
        }
        return false;
    }

    public boolean containsValue(V value) {
        for (Pair<K, V> pair : dictionary) {
            if (pair.getValue().equals(value)) {
                return true;
            }
        }
        return false;
    }

    public Iterable<K> keys() {
        List<K> keys = new ArrayList<>();
        for (Pair<K, V> pair : dictionary) {
            keys.add(pair.getKey());
        }
        return keys;
    }

    // Получить все значения
    public Iterable<V> values() {
        List<V> values = new ArrayList<>();
        for (Pair<K, V> pair : dictionary) {
            values.add(pair.getValue());
        }
        return values;
    }

    public void remove(K key) {
        dictionary.removeIf(pair -> pair.getKey().equals(key));
    }
}
