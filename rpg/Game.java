package rpg;

import rpg.entities.enemies.Enemy;
import rpg.utils.Randomize;
import javax.swing.JOptionPane;

public class Game {
    private rpg.player player;
    private Enemy enemy;

    public Game(rpg.player player) {
        this.player = player;
        this.enemy = Randomize.getRandomEnemy();
    }

    /** iniciar juego **/
    public void startGame() {
        JOptionPane.showMessageDialog(null, "¡Comienza la batalla entre " + player.getClass() + " y " + enemy.getName() + "!");
        while (player.isAlive() && enemy.isAlive()) {
            playerTurn();
            if (enemy.isAlive()) {
                enemyTurn();
            }
        }

        if (player.isAlive()) { /** se mantiene vivo el jugador **/
            JOptionPane.showMessageDialog(null, player.getClass() + " ha derrotado a " + enemy.getName() + "!");
        } else { /** es derrotado el jugador **/
            JOptionPane.showMessageDialog(null, enemy.getName() + " ha derrotado a " + player.getClass() + "!");
        }
    }

    /** turno del jugador **/
    private void playerTurn() {
        int option = JOptionPane.showConfirmDialog(null, "¿Quieres atacar?", "Turno de " + player.getName(), JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            player.attack(enemy);
        }
    }

    /** turno del enemigo **/
    private void enemyTurn() {
        JOptionPane.showMessageDialog(null, enemy.getName() + " se prepara para atacar.");
        enemy.attack(player);
    }

    public static void main(String[] args) {
        rpg.player player = new player("Cowboy");
        Game game = new Game(player);
        game.startGame();
    }
}