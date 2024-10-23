package rpg.entities.items.weapons;

import rpg.entities.items.Item;
import rpg.enu.ItemType;

/**
 * Representa un ítem de tipo arma en el juego.
 * La clase `Weapon` es abstracta y sirve como base para diferentes tipos de armas,
 * proporcionando un poder de ataque común.
 */
public abstract class Weapon extends Item {
    private int attackPower;

    /**
     * Crea una nueva arma con el nombre especificado y el poder de ataque.
     *
     * @param name el nombre del arma
     * @param attackPower el poder de ataque de la arma
     */
    public Weapon(String name, int attackPower) {
        super(name, ItemType.WEAPON);
        this.attackPower = attackPower;
    }

    /**
     * Obtiene el poder de ataque de la arma.
     *
     * @return el poder de ataque
     */
    public int getAttackPower() {
        return attackPower;
    }
}