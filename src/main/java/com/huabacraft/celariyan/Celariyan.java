package com.huabacraft.celariyan;

import com.huabacraft.celariyan.factions.FactionManager;
import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;

public final class Celariyan extends JavaPlugin {

    @Getter private FactionManager factionManager;

    @Override
    public void onEnable() {
        loadManagers();

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public void loadManagers(){
        factionManager = new FactionManager();
    }
}
