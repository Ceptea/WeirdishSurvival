package cepteas.weirdishsurvival;

import org.bukkit.entity.Player;

import java.util.Vector;

public class Util {
    public static void sendMessage(Player player, String message) {
        player.sendMessage(message.replace("&","§"));
    }



}
