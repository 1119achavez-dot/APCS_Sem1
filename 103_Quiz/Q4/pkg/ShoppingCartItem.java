package pkg;
import java.util.*;

public class ShoppingCartItem {
    private String itemname;
    private double itemCost;
    private int quantity;
    
    public ShoppingCartItem (){
    itemname = "unknown";
    itemCost= 0;
    quantity=0;}
    
    public ShoppingCartItem (String x,double y,int z){
    itemname = x;
    itemCost= y;
    quantity= z;
    }
    
    public void cartToString() {
        System.out.println("you have " + quantity + " of " + itemname + " for " + itemCost + " each." );
        
    }
    
    public Double getTotalCost() {
        return quantity * itemCost;
   
    }
    
    public Double getTotalWithTax(){
        return getTotalCost / 12 ;
    }

}
