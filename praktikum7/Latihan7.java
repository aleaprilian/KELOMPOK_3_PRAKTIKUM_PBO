
package com.mycompany.latihan7;

public class Latihan7 {

    public static void main(String[] args) {
        Player player = new Player("Player" , 90,50,25);
         player.startGame();

        Goblin goblin = new Goblin("Goblin", 90,50,20);
          goblin.startGame();
          
        Rogue rogue = new Rogue ("Rouge", 90,50,20);
        rogue.startGame();

          goblin.attackPlayer(player);
          player.attackGoblin(goblin);
          goblin.attackPlayer(player);
          player.attackGoblin(goblin);
          goblin.attackPlayer(player);
          player.attackGoblin(goblin);
          goblin.attackPlayer(player);
    }
}
