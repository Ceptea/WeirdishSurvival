package cepteas.weirdishsurvival.tweak;

import cepteas.weirdishsurvival.util.Global;
import org.bukkit.event.Listener;

import java.util.ArrayList;

public class Tweak implements Listener, Global {
    String id;
    public Tweak(String id) {
        this.id = id;
    }

    public static ArrayList<Tweak> list() {
        return TweakManager.tweaks();
    }
    public static boolean isEnabled(String tweakId) {
        for (Tweak tweak: list()) {
            if (tweak.id.equalsIgnoreCase(tweakId)) {
                return true;
            }
        }
        return false;
    }
}
