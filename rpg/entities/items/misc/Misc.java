package rpg.entities.items.misc;

import rpg.entities.items.Item;
import rpg.enu.ItemType;

/**
 * Representa un ítem de tipo misceláneo en el juego.
 * La clase `Misc` es abstracta y sirve como base para otros ítems que no encajan en otras categorías.
 */
public abstract class Misc extends Item {

    /**
     * Crea un nuevo ítem misceláneo con el nombre especificado.
     *
     * @param name el nombre del ítem misceláneo
     */
    public Misc(String name) {
        super(name, ItemType.MISC);
    }
}