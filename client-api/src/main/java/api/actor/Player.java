package api.actor;

import accessors.RSClient;
import accessors.RSPlayer;

import java.util.Arrays;
import java.util.List;

public class Player extends Actor {
    private final RSPlayer rsPlayer;

    public Player(RSPlayer rsPlayer, RSClient client) {
        super(rsPlayer, client);
        this.rsPlayer = rsPlayer;
    }

    @Override
    public int getPlane() {
        return rsPlayer.getPlane();
    }


//    public Username getName() {
//        return rsPlayer.getUsername() != null ? new Username(accessor.getUsername()) : null;
//    }
//    public List<String> getActions() {
//        return Arrays.stream(rsPlayer.getActions()).toList();
//    }
//    public int getCombatLevel() {
//        return rsPlayer.getCombatLevel();
//    }
//    public int getHeadIconPrayer() {
//        return rsPlayer.getHeadIconPrayer();
//    }
//    public int getHeadIconPk() {
//        return rsPlayer.getHeadIconPk();
//    }
//    public int getTeam() {
//        return rsPlayer.getTeam();
//    }
//    public PlayerAppearance getAppearance() {
//        return rsPlayer.getAppearance() != null ? new PlayerAppearance(accessor.getAppearance()) : null;
//    }
//    public static int combatLevel(int attack, int strength, int defence, int ranged, int prayer, int magic, int hitpoints) {
//        int base = defence + hitpoints + prayer / 2;
//        int offenseMelee = attack + strength;
//        int offenseRanged = 3 * ranged / 2;
//        int offenseMagic = 3 * magic / 2;
//        int offense = Math.max(offenseMelee, Math.max(offenseRanged, offenseMagic));
//        return (base + 13 * offense / 10) / 4;
//    }
}