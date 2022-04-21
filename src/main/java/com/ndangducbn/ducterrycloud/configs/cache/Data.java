package com.ndangducbn.ducterrycloud.configs.cache;

public  class Data<V> {
    private V data;
    private long expiredTime;

    public Data(V data, long expiredTime) {
        this.data = data;
        this.expiredTime = expiredTime;
    }

    public V getData() {
        return data;
    }

    public void setData(V data) {
        this.data = data;
    }

    long getExpiredTime() {
        return expiredTime;
    }

}