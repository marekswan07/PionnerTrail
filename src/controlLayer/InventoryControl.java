package controlLayer;


/**
 * Done for the purpose of tutoring
 * @author Marek
 */
public class InventoryControl {
    
    public static double calculateItemWeight(double height, double diameter){
        
        if (height < 0){
            return -1;
        } 
        
        if (diameter < 0 || diameter > 36){
            return -1;
        }
        
        double radius = diameter / 2;
        double volume = (Math.PI * Math.pow(radius, 2)*height) /1728;
        
        return volume;
    }
    
}
