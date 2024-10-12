package rpg.entities.enemies;

import rpg.player;
import rpg.enu.Stats;

import javax.swing.*;
import java.security.PermissionCollection;
import java.util.HashMap;
import java.util.Random;

import static rpg.enu.Stats.*;

public class Enemy {
    private String name;
    private HashMap<Stats, Integer> stats;

    public Enemy(String name) {
        this.name = name;
        this.stats = new HashMap<>();
        initializeStats();
    }

    private void initializeStats() {
        stats.put(MAX_HP, 80);
        stats.put(HP, 80);
        stats.put(ATTACK, 15);
        stats.put(DEFENSE, 8);
        stats.put(SPEED, 4);
    }

    public String getName() {
        return name;
    }

    public void attack(player player) {
        int damage = calculateDamage(player);
        player.getStats().put(HP, Math.max(player.getStats().get(HP) - damage, 0));
        JOptionPane.showMessageDialog(null, name + " ataca a " + player.getClass() + " e inflige " + damage + " de daño.");
    }

    private int calculateDamage(player player) {
        int attackPower = stats.get(ATTACK);
        PermissionCollection defensePower;
        defensePower = player.getStats().get(DEFENSE);
        Random rand = new Random();
        return Math.max(attackPower - defensePower + rand.nextInt(5), 0);
    }

    public void takeDamage(int damage) {
        stats.put(HP, Math.max(stats.get(HP) - damage, 0));
    }

    public boolean isAlive() {
        return stats.get(HP) > 0;
    }

    public HashMap<Stats, Integer> getStats() {
        return stats;
    }
}