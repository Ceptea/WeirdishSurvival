package cepteas.weirdishsurvival;

import cepteas.weirdishsurvival.item.CustomItem;
import cepteas.weirdishsurvival.item.ItemManager;
import cepteas.weirdishsurvival.util.Global;
import org.bukkit.GameMode;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockDamageEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.*;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.PlayerInventory;

public class Events implements Listener, Global {

    @EventHandler
    public void onPlayerMove(PlayerMoveEvent e) {

        Player player = e.getPlayer();
        if (player.getFoodLevel() <=3) {
            player.setWalkSpeed(0.15f);
        } else {
            player.setWalkSpeed(0.2f);
        }
    }


    @EventHandler
    public void onBlockDamage(BlockDamageEvent e) {
        Player player = e.getPlayer();
        PlayerInventory inv = player.getInventory();
        boolean isCustomItem = inv.getItemInMainHand().getItemMeta().getLore().contains("§k");

        if (isCustomItem) {
            for (CustomItem item: ItemManager.items()) {
                item.onBlockDamageEvent(e);
            }
        }
    }

}
