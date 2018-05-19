package modellayer;
import java.io.Serializable;
import java.util.Objects;

//@author Marek

public class Player implements Serializable {
    
    //instance variables for this class (attributes)
    private String name;
    private double bestTime;
    
    //constructor
    public Player() {
        
    }
    
    //getters
    public String getName(){
        return name;
    }
    
    public double getBestTime(){
        return bestTime;
    }
    
    //setters
    public void setName(String name){
        this.name = name;
    }
    
    public void setBestTime(double bestTime){
        this.bestTime = bestTime;
    }
    
    
    //toString Method

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", bestTime=" + bestTime + '}';
    }
    
    
    //extra methods, reason for them not listed in the project
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.name);
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.bestTime) ^ (Double.doubleToLongBits(this.bestTime) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Player other = (Player) obj;
        if (Double.doubleToLongBits(this.bestTime) != Double.doubleToLongBits(other.bestTime)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
    
}
