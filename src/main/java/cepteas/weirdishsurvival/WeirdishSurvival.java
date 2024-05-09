package cepteas.weirdishsurvival;

import cepteas.weirdishsurvival.commands.ItemCommand;
import cepteas.weirdishsurvival.item.ItemManager;
import cepteas.weirdishsurvival.tweak.TweakManager;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.BlockState;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class WeirdishSurvival extends JavaPlugin {

    @Override
    public void onEnable() {
        ItemManager.init();
        TweakManager.init();
        Bukkit.getPluginCommand("item").setExecutor(new ItemCommand());
        Bukkit.getPluginManager().registerEvents(new Events(),this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
