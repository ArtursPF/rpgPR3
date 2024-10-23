package rpg;

import rpg.entities.Inventory;
import rpg.entities.enemies.Enemy;
import rpg.entities.items.armors.Armor;
import rpg.entities.items.weapons.Sword;
import rpg.entities.items.armors.Helmet;
import rpg.entities.items.weapons.Weapon;
import rpg.enu.Stats;

/**
 * La clase {@code Player} representa a un jugador en el juego, heredando las propiedades de {@code GameCharacter}.
 * Un jugador tiene un inventario y estadísticas que definen sus atributos como salud, ataque y defensa.
 */
public class Player extends GameCharacter {
    private Inventory inventory;

    /**
     * Constructor de la clase {@code Player}.
     *
     * @param name El nombre del jugador.
     */
    public Player(String name) {
        super(name);
        inventory = new Inventory(10); // Capacidad inicial de 10 ítems.
        initializeStats();
    }

    /**
     * Obtiene el inventario del jugador.
     *
     * @return El inventario del jugador.
     */
    public Inventory getInventory() {
        return inventory;
    }

    /**
     * Inicializa las estadísticas del jugador, como puntos de vida (HP), ataque, defensa, y velocidad.
     * Este método es llamado automáticamente en el constructor.
     */
    @Override
    protected void initializeStats() {
        stats.put(Stats.MAX_HP, 20);
        stats.put(Stats.HP, 20);
        stats.put(Stats.ATTACK, 20);
        stats.put(Stats.DEFENSE, 10);
        stats.put(Stats.SPEED, 5);
    }

    /**
     * Equipa los ítems iniciales del jugador, como una espada y un casco.
     * Estos ítems se añaden automáticamente al inventario del jugador.
     */
    public void equipInitialItems() {
        inventory.addItem(new Sword());
        inventory.addItem(new Helmet());
    }

    /**
     * El jugador ataca a un enemigo, aplicando daño en función de sus estadísticas de ataque.
     *
     * @param enemy El enemigo que será atacado.
     */
    public void attack(Enemy enemy) {
        // Lógica de ataque al enemigo (implementación pendiente).
    }

    /**
     * Equipa una armadura al jugador.
     *
     * @param item La armadura que el jugador va a equipar.
     */
    public void equipArmor(Armor item) {
        // Lógica para equipar armadura (implementación pendiente).
    }

    /**
     * Equipa un arma al jugador.
     *
     * @param item El arma que el jugador va a equipar.
     */
    public void equipWeapon(Weapon item) {
        // Lógica para equipar arma (implementación pendiente).
    }
}
