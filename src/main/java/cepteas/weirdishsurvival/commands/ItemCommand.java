package cepteas.weirdishsurvival.commands;

import cepteas.weirdishsurvival.Util;
import cepteas.weirdishsurvival.item.CustomItem;
import cepteas.weirdishsurvival.item.ItemManager;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;

public class ItemCommand implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {

        if (sender instanceof Player p) {
            for (CustomItem item: ItemManager.items()) {
                if (item.name.equalsIgnoreCase(strings[0])) {
                    p.getInventory().addItem(item.getStack());
                    Util.sendMessage(p, String.format("Spawned in %s", item.getStack().getItemMeta().getDisplayName()));
                    return true;
                }
            }
            Util.sendMessage(p,"&cThat item doesn't exist.");
            return false;
        } else {
            sender.sendMessage("You have to be a player");
            return true;
        }

    }
}
