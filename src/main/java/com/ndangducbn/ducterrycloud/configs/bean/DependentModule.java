package com.ndangducbn.ducterrycloud.configs.bean;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class DependentModule {
    private final List<Modul> moduls = new ArrayList<>();
}
