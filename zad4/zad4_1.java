import java.io.*;
import java.util.*;

public class zad4_1{
  static void zapisz(String wynik, File plik) throws FileNotFoundException{
	   PrintWriter zapis = new PrintWriter(plik);
	   zapis.println(wynik);
	   zapis.close();
  }
  
  
  static void odczyt(File plik) throws FileNotFoundException{
	  Scanner in = new Scanner(plik);
 
      String zdanie = in.nextLine();
      System.out.println(zdanie +"\n \n");
  }
  
 
}