package com.ndangducbn.ducterrycloud.configs.cache;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.HashMap;


public abstract class FCache<K, V> {

    public HashMap<K, Data<V>> data;
    protected int size;

    public V get(K key) {
        if (!this.data.containsKey(key)) {
            return null;
        }
        Data<V> d = this.data.get(key);
        if (d == null ||
              d.getData() == null ||
              d.getExpiredTime() < ZonedDateTime.now(ZoneOffset.UTC).toInstant().toEpochMilli()) {
            if (d != null) {
                this.data.remove(key);
            }
            return null;
        }
        return d.getData();
    }

    public void put(K key, V value, long expired) {
        if (this.data.size() == this.size) {
            this.data.clear();
        }
        this.data.put(key, new Data<>(value, expired));
    }

    public void clear() {
        this.data.clear();
    }
}
