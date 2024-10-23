package rpg.entities.items.armors;

import rpg.entities.items.Item;
import rpg.enu.ItemType;

/**
 * Representa una armadura en el juego.
 * La armadura proporciona un poder de defensa que puede ser utilizado por los personajes.
 */
public class Armor extends Item {
    private int defensePower;

    /**
     * Crea una nueva armadura con el nombre especificado y el poder de defensa.
     *
     * @param name el nombre de la armadura
     * @param defensePower el poder de defensa de la armadura
     */
    public Armor(String name, int defensePower) {
        super(name);
        this.defensePower = defensePower;
    }

    /**
     * Obtiene el tipo de ítem de la armadura.
     *
     * @return el tipo de ítem, que es "Armadura"
     */
    @Override
    public ItemType getType() {
        return ItemType.valueOf("Armadura");
    }

    /**
     * Obtiene el poder de defensa de la armadura.
     *
     * @return el poder de defensa
     */
    public int getDefensePower() {
        return defensePower;
    }

    /**
     * Obtiene el bono de defensa proporcionado por la armadura.
     * Este método actualmente retorna 0, pero puede ser modificado en el futuro.
     *
     * @return el bono de defensa
     */
    public Integer getDefenseBonus() {
        return 0;
    }

    /**
     * Obtiene el valor de defensa de la armadura.
     * Este método actualmente retorna 0, pero puede ser modificado en el futuro.
     *
     * @return el valor de defensa
     */
    public Integer getDefense() {
        return 0;
    }
}