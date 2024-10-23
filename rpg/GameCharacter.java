package rpg;

import rpg.enu.Stats;
import java.util.HashMap;

/**
 * Clase abstracta que representa un personaje del juego.
 */
public abstract class GameCharacter {
    protected String name;
    protected HashMap<Stats, Integer> stats;

    /**
     * Constructor de la clase GameCharacter.
     *
     * @param name Nombre del personaje.
     */
    public GameCharacter(String name) {
        this.name = name;
        this.stats = new HashMap<>();
        initializeStats();
    }

    /**
     * Método abstracto que debe inicializar las estadísticas del personaje.
     */
    protected abstract void initializeStats();

    /**
     * Obtiene el nombre del personaje.
     *
     * @return Nombre del personaje.
     */
    public String getName() {
        return name;
    }

    /**
     * Obtiene las estadísticas del personaje.
     *
     * @return Un {@code HashMap} con las estadísticas del personaje, donde las claves son de tipo {@code Stats}
     * y los valores son enteros que representan el valor de cada estadística.
     */
    public HashMap<Stats, Integer> getStats() {
        return stats;
    }

    /**
     * Aplica daño al personaje reduciendo sus puntos de vida (HP). Si el daño excede los puntos de vida actuales,
     * los puntos de vida se reducen a 0.
     *
     * @param damage Cantidad de daño a infligir.
     */
    public void takeDamage(int damage) {
        stats.put(Stats.HP, Math.max(stats.get(Stats.HP) - damage, 0));
    }

    /**
     * Verifica si el personaje sigue con vida (es decir, tiene más de 0 puntos de vida).
     *
     * @return {@code true} si el personaje está vivo, {@code false} en caso contrario.
     */
    public boolean isAlive() {
        return stats.get(Stats.HP) > 0;
    }
}
