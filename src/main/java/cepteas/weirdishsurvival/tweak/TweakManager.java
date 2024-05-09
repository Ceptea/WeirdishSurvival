package cepteas.weirdishsurvival.tweak;

import cepteas.weirdishsurvival.tweak.impl.LavaShred;
import org.bukkit.event.Listener;

import java.util.ArrayList;

public class TweakManager {
    public static ArrayList<Tweak> tweaks = new ArrayList<>();
    public static ArrayList<Tweak> tweaks() {
        return tweaks;
    }

    public static void init() {
        addTweak(new LavaShred());
    }

    public static void addTweak(Tweak tweak) {
        tweaks.add(tweak);
    }
}
