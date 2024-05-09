package cepteas.weirdishsurvival.item;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockDamageEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class CustomItem {
    ItemStack stack;
    public String name;
    public CustomItem(Material item, String name) {
        this.name = name;
        ItemStack stack = new ItemStack(item,1);
        ItemMeta meta = stack.getItemMeta();;
        meta.setDisplayName(name);
        ArrayList<String> lore = new ArrayList<>();
        lore.add("§k");
        meta.setLore(lore);
        stack.setItemMeta(meta);
        this.stack = stack;
    }

    public void unbreakable() {
        ItemMeta meta = stack.getItemMeta();
        meta.setUnbreakable(true);
        stack.setItemMeta(meta);

    }
    public void itemName(String name) {
        ItemMeta meta = stack.getItemMeta();
        meta.setDisplayName(name.replace("&","§"));
        stack.setItemMeta(meta);
    }
    public ItemStack getStack() {
        return stack;
    }
    public void onBlockDamageEvent(BlockDamageEvent e) {}


}
