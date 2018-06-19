import java.io.*;
import java.util.*;

public class zad4{
  public static void main(String[] args) throws FileNotFoundException{
      File file = new File("io.txt");
	  String alfabet="1234567890qertyuiopasdfghjklzxcvbnm";
	  String wynik="";
	  Random rand = new Random();
	  for (int i=0; i<1000; i++)
	  {
		  int n = rand.nextInt(alfabet.length()) + 0;
		  wynik=wynik+alfabet.substring(n, n+1);
	  }
	  long startTimeio = System.nanoTime();
	  zad4_1.zapisz(wynik, file);
	  zad4_1.odczyt(file);
	  long endTimeio   = System.nanoTime();
	  long totalTimeio = endTimeio - startTimeio;
	  
	  long startTimenio = System.nanoTime();
	  try
	  {
		  zad4_2.zapisz(wynik);
		  zad4_2.odczyt();
	  }
	  catch (IOException e) {
		  System.out.println("Ups");
	  }
	  long endTimenio   = System.nanoTime();
	  long totalTimenio = endTimenio - startTimenio;
	  if (totalTimeio < totalTimenio)
	  {
		  System.out.println("\n \nBiblioteka IO ma krotszy czas dzialania");
		  System.out.println("Biblioteka IO: "+ totalTimeio + " \n Biblioteka NIO: " + totalTimenio);
	  }
	  else
	  {
		  System.out.println("\n \n Biblioteka NIO ma krotszy czas dzialania");
		  System.out.println("Biblioteka IO: "+ totalTimeio + " \n Biblioteka NIO: " + totalTimenio);
	  }
		  
  }
}