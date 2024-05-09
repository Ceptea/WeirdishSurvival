package cepteas.weirdishsurvival.tweak.impl;


import cepteas.weirdishsurvival.tweak.Tweak;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.BlockState;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.EntityDamageEvent;

//
// Makes lava extremely overpowered.
//
public class LavaShred extends Tweak {
    public LavaShred() {
        super("lavashred");

        Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, () -> {
            for (Player player: Bukkit.getOnlinePlayers()) {
                Location location = player.getLocation();
                BlockState state = player.getWorld().getBlockState(location.add(0,0f,0));
                if (state.getType() == Material.LAVA) {
                    player.setNoDamageTicks(0);
                }
            }
        }, 1L, 1L);
    }
    @EventHandler
    public void onDamage(EntityDamageEvent e) {

        Entity entity = e.getEntity();
        if (e.getCause() == EntityDamageEvent.DamageCause.LAVA) {
            if (entity instanceof LivingEntity living) {
                e.setDamage(1.6f);
                living.setNoDamageTicks(0);
                living.setFireTicks(34);
            }
        }

    }

}
