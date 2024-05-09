package cepteas.weirdishsurvival.item.impl;

import cepteas.weirdishsurvival.item.CustomItem;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockDamageEvent;

public class BreakerItem extends CustomItem {
    public BreakerItem() {
        super(Material.GOLDEN_PICKAXE, "breaker");
        unbreakable();
        itemName("&cBreaker");
    }

    public void onBlockDamageEvent(BlockDamageEvent e) {
        Player player = e.getPlayer();
        e.setInstaBreak(true);
    }
}
