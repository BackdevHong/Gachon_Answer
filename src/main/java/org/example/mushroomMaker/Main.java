package org.example.mushroomMaker;

import org.bukkit.NamespacedKey;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {
    private static Main instance;
    private static NamespacedKey key;

    public static Main getInstance() { return instance; }
    public static NamespacedKey getKey() { return key; }

    @Override
    public void onEnable() {
        // Plugin startup logic
        instance = this;
        key = new NamespacedKey(this, "box");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
