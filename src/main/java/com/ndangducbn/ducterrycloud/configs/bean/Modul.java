package com.ndangducbn.ducterrycloud.configs.bean;

import java.util.ArrayList;
import java.util.List;

class Modul {

    private String name;
    private List<String> functions = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getFunctions() {
        return functions;
    }

    public void setFunctions(List<String> functions) {
        this.functions = functions;
    }
}