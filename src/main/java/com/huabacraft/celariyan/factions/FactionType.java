package com.huabacraft.celariyan.factions;

import lombok.Getter;

@Getter
public enum FactionType {
    HUMANS("Humans"),
    MAGES("Mages"),
    ELVES("Elves");

    private String name;

    FactionType(String name) {
        this.name = name;
    }
}
