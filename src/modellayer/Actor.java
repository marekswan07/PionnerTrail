package modellayer;
import java.awt.Point;


//@author Marek
public enum Actor{
    
    Father("lehi","He is prophet",new Point(1,1));
    
    private String name;
    private String description;
    private Point coordinates;
 
    Actor(String name, String description, Point coordinates){
    this.name = name;
    this.description = description;
    this.coordinates = coordinates;
}
    
      public String getName(){
        return name;
    }
}
