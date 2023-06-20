// Date: 10/28/2022

package Game.Levels;

import Game.Gameplay.Controls.PlayerController;

public class Level1 extends Hierarchy{


   public void start(){

      PlayerController pc = new PlayerController(currentFloor[0], startingRoom);
      pc.start();
      
   }

}
