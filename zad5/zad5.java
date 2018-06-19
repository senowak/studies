import java.util.*;
import java.io.*;

public class zad5{
	
	static void dodaj(wektor w) {
		Scanner odczyt = new Scanner(System.in);
		String a,b, wczytane;
		int t=5;
		w.x.clear();
		String[] splitedArray = null;
		System.out.println("Wprowadz wartosc wektora oddzielona spacjami");
		wczytane=odczyt.nextLine();	
		splitedArray = wczytane.split(" ");
		try
		{
			for(int j=0; j<splitedArray.length; j++)
			{
				//splitedArray[0]
				w.x.add(Integer.parseInt(splitedArray[j]));
			}
		}
        catch (NumberFormatException e) {
			System.out.println("Wprowadz tylko 2 liczby!");
			dodaj(w);
        }	
	}	
	
  static void zapisz(wektor w1, wektor w2, File file) throws FileNotFoundException{
	   PrintWriter zapis = new PrintWriter(file);
	   int wynik;
	   for(int j=0; j<w1.x.size(); j++)
			{
				wynik=w1.x.get(j)+w2.x.get(j);
				zapis.println("Suma "+ j +" +: "+wynik);
			}
	   zapis.close();
  } 
  
	public static void main(String args[]) throws FileNotFoundException{
		File file = new File("zad5.txt");
		int i=0;
		
		wektor w2= new wektor();
		wektor w1= new wektor();
		do
		{
			dodaj(w1);
			dodaj(w2);
			try
			{
				w1.sprawdz(w2);
				zapisz(w1,w2, file);
				i=1;
			}
			catch(WektoryRoznejDlugosciException e)
			{
				System.out.println("Wektory sa roznej dlugosci");
			}			
		}
		while(i!=1);
		
	}	
	
}