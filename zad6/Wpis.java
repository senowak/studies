abstract class Wpis 
{	
    public abstract String opis();
}


class Osoba extends Wpis {
	String imie;
	String nazwisko;
	String adres;
	
	public Osoba(String a, String b, String c)
	{
		imie=a;
		nazwisko=b;
		adres=c;
	}
	
	@Override
	public String opis() {
		String dana;
		dana=this.imie +" "+ this.nazwisko+ " " + this.adres + " ";
		return dana;
	}
}

class Firma extends Wpis 
{
	String nazwa;
	String adres;
	
	public Firma(String a, String b)
	{
		nazwa=a;
		adres=b;
	}
	
	@Override
	public String opis() {
		String dany;
		dany=this.nazwa+ " " + this.adres + " ";
		return dany;
	}
}