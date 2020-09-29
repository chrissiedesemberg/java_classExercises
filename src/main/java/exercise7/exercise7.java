/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise7;

/**
 *
 * @author Chrissie
 */
public class exercise7 {
    public static void main(String[] args) {
        double price = 12.20, tax = 0.12;
        int quantity = 1;
        double total = (price + tax) * quantity;
        boolean outOfStock = false;
        String custName = "John Doe";
        String [] items = {"shirt", "socks", "pants", "scarf"};
        int [] itemPrices = {12,11,15,25};

        String message = (custName + " wants to buy " + quantity);
        
        System.out.println(message + " " + items[3]);

        for (int unitPrice : itemPrices) {
            System.out.println("Item price is " + unitPrice);
        }
        
        //
        System.out.println(" ");
        System.out.println("print first name of customer - PAGE 214");
        int indexFirst = custName.indexOf(" ");
        System.out.println(indexFirst);
        String firstName = custName.substring(0, indexFirst);
        System.out.println("First name: " + firstName);
        
         // 
        System.out.println(" ");
        System.out.println("print last name of customer - PAGE 214");
        String lastName = custName.substring(indexFirst + 1);
        System.out.println("Last name: " + lastName);
       
        //
        System.out.println(" ");
        System.out.println("Stringbuilder append - PAGE 215");
        StringBuilder mySB = new StringBuilder(firstName).append(" ");
        mySB.append(lastName);
        System.out.println(mySB);
        
        // 
        System.out.println(" ");
        System.out.println("Page 215");
      
        int id = 6;
        int newId = ++id;
        System.out.println("id: " + id + " newId: " + newId);
     
        int id2 = 6;
        int newId2 = id2++;
        System.out.println("id2: " + id2 + " newId2: " + newId2);
        
        // 
        System.out.println(" ");
        System.out.println("Page 216");
        
        int count=15;
        int a, b, c, d;
        
        a = count++;
        System.out.println("a:  " + a);
        
        b = count;
        System.out.println("b:  " + b);
        
        c = ++count;
        System.out.println("c:  " + c);
        
        d = count;
        System.out.println("d:  " + d);
        
        //
        System.out.println(" ");
        System.out.println("Page 239");
        
        short f, g, h;
        f = 1 ;
        g = 2 ;
        //h = f + g ; //compiler error
        h = (short) (f + g);
        System.out.println(h);
        
        //
         System.out.println(" ");        
        System.out.println("Page 239");
        
        int ageYears = 32;

        int ageDays = ageYears * 365;
        long ageSeconds = ageYears * 365 * 24L * 60 * 60;

        System.out.println("You are " + ageDays + " days old.");
        System.out.println("You are " + ageSeconds + " seconds old.");

         // 
         System.out.println(" ");
         System.out.println("Page 244");
         
         long var1 = 1000000000000L;
         float var2 = 1.1F;
         char var3 = 'A';
         int var4;
         
         System.out.println("Long: " + var1);
         System.out.println("float: " + var2);
         System.out.println("char: " + var3);
         
         //Assign the long to the int variable. Correct the syntax error by 
         //casting the long as an int.
         
         var4 = (int) (var1);
         System.out.println("Long to int: " + var4);

         // 
        System.out.println(" ");
        System.out.println("Page 247 number 7-1");
        
    
        
    }
}