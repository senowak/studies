import java.nio.*;
import java.io.*;
import java.util.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public class zad4_2{
  static void zapisz(String wynik) throws IOException{
	  Files.write(Paths.get("nio.txt"), wynik.getBytes());
  }
  
  
  static void odczyt() throws IOException{	 
	 System.out.println( Files.readAllLines(Paths.get("nio.txt"), Charset.forName("UTF-8")));
  }
  
 
}