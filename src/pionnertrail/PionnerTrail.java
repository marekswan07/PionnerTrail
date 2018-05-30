package pionnertrail;
import modellayer.Actor;
import modellayer.Player;
import modellayer.Inventory;
import controlLayer.InventoryControl;

 //@author Marek

public class PionnerTrail {
    
    public static void main(String[] args) {
        
        test_Model();
    }
    
    public static void test_Model(){
        //player test with some fucntion tests
        Player player1 = new Player();
        player1.setName("Roger");
        System.out.println(player1.toString());
        
        //enum test
        System.out.println(Actor.Father.getName());
        
        //inventory test
        Inventory testItem = new Inventory("chicken", 50, 10);
        System.out.println(testItem.toString());
        
        
        //
    }
    
}
