import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.Set;
import java.util.Collections;
import java.util.Collection;

import java.util.Iterator;



public class zad6{
	public static void main(String args[])  {
		TreeMap<String, String> tm=new TreeMap<String, String>();
        List<NrTelefoniczny> tel = new ArrayList<NrTelefoniczny>();
		tel.add(new NrTelefoniczny("Miroslawa", "Sawicka", "Slawin", 72, 729718487));
		tel.add(new NrTelefoniczny("Ludwika", "Kozlowska", "Bojownikow", 69, 690661226));
		tel.add(new NrTelefoniczny("Eugeniusz", "Piotrowski", "Sarnia", 73, 696898793));
		tel.add(new NrTelefoniczny("Hipolit", "Zielinski", "Rozana", 37, 881935095));
		tel.add(new NrTelefoniczny("Rossman", "Aleksandrowska", 78, 737730387));
		tel.add(new NrTelefoniczny("CCC", "Wyszynskiego", 66, 727104983));
		tel.add(new NrTelefoniczny("EMPIK", "Piotrkowska", 73, 883150577));
		tel.add(new NrTelefoniczny("FitFabric", "Augustow", 73, 787232133));
		for(NrTelefoniczny NrTelefoniczny : tel) {
            tm.put(NrTelefoniczny.drukuj_tel(),NrTelefoniczny.drukuj_dane());
        }
		
    Collection c = tm.entrySet();
    //obtain an Iterator for Collection
    Iterator itrc = c.iterator();

    //iterate through TreeMap values iterator
    while(itrc.hasNext() )
      System.out.println( itrc.next() );
	}	
}