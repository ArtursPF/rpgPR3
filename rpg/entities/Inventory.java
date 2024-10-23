package rpg.entities;

import rpg.entities.items.Item;
import rpg.entities.items.armors.Armor;
import rpg.entities.items.weapons.Weapon;
import rpg.entities.items.misc.Misc;
import java.util.ArrayList;

/**
 * Representa un inventario en el juego que puede contener diferentes tipos de ítems.
 * La clase `Inventory` permite agregar, eliminar y gestionar ítems dentro de un límite de capacidad.
 */
public class Inventory {
    private ArrayList<Item> items;
    private int capacity;

    /**
     * Crea un nuevo inventario con la capacidad especificada.
     *
     * @param capacity la capacidad máxima del inventario
     */
    public Inventory(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    /**
     * Agrega un ítem al inventario si no está lleno.
     *
     * @param item el ítem a agregar
     */
    public void addItem(Item item) {
        if (!isFull()) {
            items.add(item);
        } else {
            System.out.println("El inventario está lleno.");
        }
    }

    /**
     * Elimina un ítem del inventario.
     *
     * @param item el ítem a eliminar
     */
    public void removeItem(Item item) {
        items.remove(item);
    }

    /**
     * Obtiene un ítem del inventario por su índice.
     *
     * @param index el índice del ítem
     * @return el ítem en la posición especificada
     */
    public Item getItem(int index) {
        return items.get(index);
    }

    /**
     * Obtiene la cantidad actual de ítems en el inventario.
     *
     * @return el número de ítems en el inventario
     */
    public int getItemCount() {
        return items.size();
    }

    /**
     * Verifica si el inventario está lleno.
     *
     * @return true si el inventario está lleno, false en caso contrario
     */
    public boolean isFull() {
        return items.size() >= capacity;
    }

    /**
     * Verifica si el inventario está vacío.
     *
     * @return true si el inventario está vacío, false en caso contrario
     */
    public boolean isEmpty() {
        return items.isEmpty();
    }

    /**
     * Limpia el inventario, eliminando todos los ítems.
     */
    public void clear() {
        items.clear();
    }

    /**
     * Aumenta la capacidad del inventario en la cantidad especificada.
     *
     * @param amount la cantidad a agregar a la capacidad actual
     */
    public void increaseCapacity(int amount) {
        this.capacity += amount;
    }

    /**
     * Lista todos los ítems de tipo Armor en el inventario.
     *
     * @return una lista de ítems de tipo Armor
     */
    public ArrayList<Armor> listArmors() {
        ArrayList<Armor> armors = new ArrayList<>();
        for (Item item : items) {
            if (item instanceof Armor) {
                armors.add((Armor) item);
            }
        }
        return armors;
    }

    /**
     * Lista todos los ítems de tipo Weapon en el inventario.
     *
     * @return una lista de ítems de tipo Weapon
     */
    public ArrayList<Weapon> listWeapons() {
        ArrayList<Weapon> weapons = new ArrayList<>();
        for (Item item : items) {
            if (item instanceof Weapon) {
                weapons.add((Weapon) item);
            }
        }
        return weapons;
    }

    /**
     * Lista todos los ítems de tipo Misc en el inventario.
     *
     * @return una lista de ítems de tipo Misc
     */
    public ArrayList<Misc> listMisc() {
        ArrayList<Misc> miscItems = new ArrayList<>();
        for (Item item : items) {
            if (item instanceof Misc) {
                miscItems.add((Misc) item);
            }
        }
        return miscItems;
    }
}