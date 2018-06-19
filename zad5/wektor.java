import java.util.*;
import java.io.*;

class wektor{
	List<Integer> x = new ArrayList<Integer>();
	
	
	public wektor()
	{
	}
	
	void sprawdz(wektor w2) throws WektoryRoznejDlugosciException
	{
		if (this.x.size()==w2.x.size())
		{
			
		}
		else
		{
			throw new WektoryRoznejDlugosciException();
		}
		
	}
	
	void dodaj(String a, int i)
	{
		this.x.add(Integer.parseInt(a));		
	}
}