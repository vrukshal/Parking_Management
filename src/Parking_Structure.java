import java.util.*;
public class Parking_Structure{
    


    public int calculate_high_price(int price){
        Random random = new Random();
        int New_Price;
        
        do {
            New_Price = random.nextInt(100) + 1;
        } while (New_Price <= price);
        
        return New_Price;
    }

    public int calculate_low_price(int price){
        Random random = new Random();
        int New_Price;
        
        do {
            New_Price = random.nextInt(100) + 1;
        } while (New_Price <= price);
        
        return New_Price;
    }
    
} 