package com.huabacraft.celariyan.factions;

import com.huabacraft.celariyan.factions.type.Elves;
import com.huabacraft.celariyan.factions.type.Human;
import com.huabacraft.celariyan.factions.type.Mages;

import java.util.ArrayList;
import java.util.List;

public class FactionManager {

    private static List<Faction> factions = new ArrayList<>();

    public FactionManager() {
        factions.add(new Human());
        factions.add(new Elves());
        factions.add(new Mages());
    }
}
