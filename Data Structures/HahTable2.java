import java.io.*;
import java.util.*;
class HahTable2{
    public static void main(String args[])
    {
  
       
        Hashtable<Integer, String> ht
            = new Hashtable<Integer, String>();
  
        
        ht.put(1, "HOW");
        ht.put(2, "ARE");
        ht.put(3, "YOU");
          
         
        System.out.println("Initial Map " + ht);
          
          
        ht.put(2, "For");
          
        
        System.out.println("Updated Map " + ht);
        System.out.println(ht.keySet());
        System.out.println(ht.values());
    }
}