
import java.util.Scanner;


public class InputOutput {

  
    public static void main(String[] args) {
        Scanner kalimat = new Scanner (System.in);
        String band , lagu1, lagu2;
        int TahunDidirikan, personil ;
       
        
        System.out.print("Nama Band:");
       band = kalimat.nextLine();
        
       
         System.out.print("Jumlah Personil:");
         personil = kalimat.nextInt();
         System.out.print("Tahun Berapa Didirikan:");
         TahunDidirikan = kalimat.nextInt();
       System.out.print("Lagu pertama yang akan dibawakan:");
       lagu1 = kalimat.next();
       
       System.out.print("Lagu kedua yang akan dibawakan:"  );
       lagu2 = kalimat.next();
       
 
       
        
        System.out.println("Nama Band= " +band);
        System.out.println("Jumlah Personil=" +personil);
        System.out.println("Tahun didirikan=" +TahunDidirikan);
        System.out.println("Lagu Pertama =" +lagu1);
              System.out.println("Lagu Kedua =" +lagu2 );
              
              
              
              
    }
    
}
