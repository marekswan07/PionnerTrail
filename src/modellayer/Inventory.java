package modellayer;

/**
 *  Done for the purpose of tutoring
 * @author Marek
 */
public class Inventory {
    
    String inventoryType;
    int quanityInStock;
    int requiredAmount;

    public Inventory(String inventoryType,int quanityInStock,int requiredAmount){
        this.inventoryType = inventoryType;
        this.quanityInStock = quanityInStock;
        this.requiredAmount = requiredAmount;
    }

    public String getInventoryType() {
        return inventoryType;
    }

    public void setInventoryType(String inventoryType) {
        this.inventoryType = inventoryType;
    }

    public int getQuanityInStock() {
        return quanityInStock;
    }

    public void setQuanityInStock(int quanityInStock) {
        this.quanityInStock = quanityInStock;
    }

    public int getRequiredAmount() {
        return requiredAmount;
    }

    public void setRequiredAmount(int requiredAmount) {
        this.requiredAmount = requiredAmount;
    }

    @Override
    public String toString() {
        return "Inventory{" + "inventoryType=" + inventoryType + ", quanityInStock=" + quanityInStock + ", requiredAmount=" + requiredAmount + '}';
    }
    
}
