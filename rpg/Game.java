package rpg;

import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
 * Clase abstracta que representa un item en el juego.
 */
abstract class Item {
    private final String nombre;
    private final String descripcion;

    /**
     * Constructor de la clase Item.
     *
     * @param nombre      Nombre del item.
     * @param descripcion Descripción del item.
     */
    public Item(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    /**
     * Obtiene el nombre del item.
     *
     * @return Nombre del item.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene la descripción del item.
     *
     * @return Descripción del item.
     */
    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Item item = (Item) obj;
        return nombre.equals(item.nombre);
    }

    @Override
    public int hashCode() {
        return nombre.hashCode();
    }
}

/**
 * Clase que representa un item misceláneo.
 */
class ItemMiscelaneo extends Item {

    /**
     * Constructor de la clase ItemMiscelaneo.
     *
     * @param nombre      Nombre del item misceláneo.
     * @param descripcion Descripción del item misceláneo.
     */
    public ItemMiscelaneo(String nombre, String descripcion) {
        super(nombre, descripcion);
    }
}

/**
 * Clase que representa una armadura.
 */
class Armadura extends Item {
    private final int defensa;

    /**
     * Constructor de la clase Armadura.
     *
     * @param nombre      Nombre de la armadura.
     * @param descripcion Descripción de la armadura.
     * @param defensa     Valor de defensa de la armadura.
     */
    public Armadura(String nombre, String descripcion, int defensa) {
        super(nombre, descripcion);
        this.defensa = defensa;
    }

    /**
     * Obtiene el valor de defensa de la armadura.
     *
     * @return Valor de defensa de la armadura.
     */
    public int getDefensa() {
        return defensa;
    }
}

/**
 * Clase que representa un arma.
 */
class Arma extends Item {
    private final int ataque;

    /**
     * Constructor de la clase Arma.
     *
     * @param nombre      Nombre del arma.
     * @param descripcion Descripción del arma.
     * @param ataque      Valor de ataque del arma.
     */
    public Arma(String nombre, String descripcion, int ataque) {
        super(nombre, descripcion);
        this.ataque = ataque;
    }

    /**
     * Obtiene el valor de ataque del arma.
     *
     * @return Valor de ataque del arma.
     */
    public int getAtaque() {
        return ataque;
    }
}

/**
 * Clase que representa el inventario del jugador.
 */
class Inventario {
    private final ArrayList<Item> items;

    /**
     * Constructor de la clase Inventario.
     */
    public Inventario() {
        items = new ArrayList<>();
    }

    /**
     * Agrega un item al inventario si no está duplicado.
     *
     * @param item El item a agregar.
     */
    public void agregarItem(Item item) {
        if (!items.contains(item)) {
            items.add(item);
        } else {
            JOptionPane.showMessageDialog(null, "El item ya está en el inventario.");
        }
    }

    /**
     * Muestra el contenido del inventario.
     */
    public void mostrarInventario() {
        StringBuilder inventarioStr = new StringBuilder("Inventario:\n");
        for (Item item : items) {
            inventarioStr.append(item.getNombre())
                    .append(": ")
                    .append(item.getDescripcion())
                    .append("\n");
        }
        JOptionPane.showMessageDialog(null, inventarioStr.toString());
    }
}

/**
 * Clase principal del juego que gestiona la ejecución.
 */
public class Game {

    /**
     * Método principal del juego.
     *
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        // Creación de nuevos items
        Arma filero = new Arma("Navaja2 ", "Inflinge mucho daño.", 25);
        Arma fileroOP = new Arma("Navaja OP", "Causa daño extremo.", 20);
        Arma espadaEncantada = new Arma("Espada Encantada", "Espada con magia.", 22);
        Arma EspadadeHierro = new Arma("Espada de Hierro", "Espada estándar de hierro.", 17);
        Arma EspadaDeMadera = new Arma("Espada de madera", "Espada efectiva contra wolfman.", 20);
        Armadura cheta = new Armadura("Armadura OP", "Protección suprema.", 30);
        Armadura escudo = new Armadura("Escudo", "Protección.", 24);
        Armadura cascoOP = new Armadura("Casco OP", "Protección OP.", 18);
        Armadura cascoDeHierro = new Armadura("Armadura cascoDeHierro", "Protección.", 20);
        Armadura Casco = new Armadura("Armadura Casco", "Protección inicial.", 10);
        ItemMiscelaneo pocion = new ItemMiscelaneo("Poción", "Restaura 15 puntos de vida.");
        ItemMiscelaneo pocionEnergia = new ItemMiscelaneo("Poción de vigor", "Restaura 20 puntos de energía.");
        ItemMiscelaneo Rabia = new ItemMiscelaneo("Líquido de rabia", "Aumenta la fuerza.");
        ItemMiscelaneo leche = new ItemMiscelaneo("Leche", "Restaura 10 puntos de vida.");
        ItemMiscelaneo GemaDelInfinito = new ItemMiscelaneo("Gema Del Infinito", "Otorga poder ilimitado.");

        // Agregar items al inventario
        inventario.agregarItem(EspadadeHierro);
        inventario.agregarItem(Casco);
        inventario.agregarItem(pocion);
        inventario.agregarItem(EspadaDeMadera);
        inventario.agregarItem(cascoDeHierro);
        inventario.agregarItem(pocionEnergia);
        inventario.agregarItem(espadaEncantada);
        inventario.agregarItem(cheta);
        inventario.agregarItem(Rabia);
        inventario.agregarItem(fileroOP);
        inventario.agregarItem(escudo);
        inventario.agregarItem(leche);
        inventario.agregarItem(filero);
        inventario.agregarItem(cascoOP);
        inventario.agregarItem(GemaDelInfinito);

        // Mostrar el inventario
        inventario.mostrarInventario();
    }
}
