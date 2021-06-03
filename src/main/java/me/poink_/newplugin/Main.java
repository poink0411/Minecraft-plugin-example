package me.poink_.newplugin;

import org.bukkit.plugin.java.JavaPlugin;
import java.io.BufferedInputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.awt.Desktop;
import java.io.File;

public final class Main extends JavaPlugin {

    public static void open(String targetFilePath) throws IOException
    {
        Desktop desktop = Desktop.getDesktop();

        desktop.open(new File(targetFilePath));
    }

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.printf("Plugin success!");
        getServer().getPluginManager().registerEvents(new ChargedCreeper(), this);
    }

    @Override
    public void onDisable() {
        System.out.printf("closing the plugin...");
    }
}
