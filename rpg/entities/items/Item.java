package rpg.entities.items;

import rpg.enu.ItemType;

/**
 * Representa un ítem en el juego.
 * La clase `Item` es abstracta y sirve como base para todos los tipos de ítems,
 * incluyendo armas, armaduras y otros ítems misceláneos.
 */
public abstract class Item {
    protected String name;
    protected ItemType type;

    /**
     * Crea un nuevo ítem con el nombre y tipo especificados.
     *
     * @param name el nombre del ítem
     * @param type el tipo del ítem, que debe ser uno de los tipos definidos en ItemType
     */
    public Item(String name, ItemType type) {
        this.name = name;
        this.type = type;
    }

    /**
     * Crea un nuevo ítem con el nombre especificado.
     * Este constructor puede ser utilizado para crear ítems sin especificar un tipo.
     *
     * @param name el nombre del ítem
     */
    public Item(String name) {
        this.name = name;
    }

    /**
     * Obtiene el nombre del ítem.
     *
     * @return el nombre del ítem
     */
    public String getName() {
        return name;
    }

    /**
     * Obtiene el tipo del ítem.
     *
     * @return el tipo del ítem
     */
    public ItemType getType() {
        return type;
    }
}