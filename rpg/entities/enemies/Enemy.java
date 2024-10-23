package rpg.entities.enemies;

import rpg.Player;
import rpg.enu.Stats;

import javax.swing.*;
import java.util.HashMap;
import java.util.Random;

/**
 * Representa un enemigo en el juego.
 * Un enemigo tiene un nombre y estadísticas que determinan su comportamiento en combate.
 */
public class Enemy {
    private String name;
    private HashMap<Stats, Integer> stats;

    /**
     * Crea un nuevo enemigo con el nombre especificado.
     *
     * @param name el nombre del enemigo
     */
    public Enemy(String name) {
        this.name = name;
        this.stats = new HashMap<>();
        initializeStats();
    }

    /**
     * Inicializa las estadísticas del enemigo con valores predeterminados.
     * Las estadísticas incluyen HP máximo, HP actual, ataque, defensa y velocidad.
     */
    private void initializeStats() {
        stats.put(Stats.MAX_HP, 80);
        stats.put(Stats.HP, 80);
        stats.put(Stats.ATTACK, 15);
        stats.put(Stats.DEFENSE, 8);
        stats.put(Stats.SPEED, 4);
    }

    /**
     * Obtiene el nombre del enemigo.
     *
     * @return el nombre del enemigo
     */
    public String getName() {
        return name;
    }

    /**
     * Ataca a un jugador, infligiendo daño basado en las estadísticas del enemigo.
     *
     * @param player el jugador que será atacado
     */
    public void attack(Player player) {
        int damage = calculateDamage(player);
        player.getStats().put(Stats.HP, Math.max(player.getStats().get(Stats.HP) - damage, 0));
        JOptionPane.showMessageDialog(null, name + " ataca a " + player.getName() + " e inflige " + damage + " de daño.");
    }

    /**
     * Calcula el daño que el enemigo infligirá a un jugador.
     *
     * @param player el jugador al que se le calculará el daño
     * @return el daño infligido al jugador
     */
    private int calculateDamage(Player player) {
        int attackPower = stats.get(Stats.ATTACK);
        int defensePower = player.getStats().get(Stats.DEFENSE);
        Random rand = new Random();
        return Math.max(attackPower - defensePower + rand.nextInt(5), 0);
    }

    /**
     * Aplica daño al enemigo.
     *
     * @param damage el daño a aplicar
     */
    public void takeDamage(int damage) {
        stats.put(Stats.HP, Math.max(stats.get(Stats.HP) - damage, 0));
    }

    /**
     * Verifica si el enemigo está vivo.
     *
     * @return true si el enemigo tiene HP mayor que 0, false en caso contrario
     */
    public boolean isAlive() {
        return stats.get(Stats.HP) > 0;
    }

    /**
     * Obtiene las estadísticas del enemigo.
     *
     * @return un HashMap de estadísticas y sus valores
     */
    public HashMap<Stats, Integer> getStats() {
        return stats;
    }
}