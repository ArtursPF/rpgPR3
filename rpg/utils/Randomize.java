package rpg.utils;

import rpg.entities.enemies.enemyTypeA.EnemyA;
import rpg.entities.enemies.enemyTypeB.EnemyB;
import rpg.entities.enemies.enemyTypeC.EnemyC;
import rpg.entities.enemies.enemyTypeD.EnemyD;
import rpg.entities.enemies.enemyTypeE.EnemyE;

import java.util.Random;

/**
 * Clase que proporciona métodos para generar enemigos aleatorios en el juego.
 * La clase `Randomize` utiliza un generador de números aleatorios para seleccionar
 * un tipo de enemigo de manera aleatoria entre varias opciones.
 */
public class Randomize {

    /**
     * Obtiene un enemigo aleatorio de uno de los tipos predefinidos.
     *
     * @return un objeto de tipo EnemyA, EnemyB, EnemyC, EnemyD o EnemyE
     */
    public static Object getRandomEnemy() {
        Random rand = new Random();
        int enemyType = rand.nextInt(5); // Genera un número entre 0 y 4

        return switch (enemyType) {
            case 0 -> new EnemyA();
            case 1 -> new EnemyB();
            case 2 -> new EnemyC();
            case 3 -> new EnemyD();
            case 4 -> new EnemyE();
            default -> new EnemyC(); // Por defecto si algo falla
        };
    }
}