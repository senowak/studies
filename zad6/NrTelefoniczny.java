public class NrTelefoniczny implements Comparable<NrTelefoniczny>{
 
    public final String nrkierunkowy;
    public final String nrtelefonu;
	Osoba os;
	Firma as;
 
	NrTelefoniczny( String a, String b, String c, int da, int de)
	{
		nrkierunkowy=Integer.toString(da);
		nrtelefonu=Integer.toString(de);
		os=new Osoba(a, b, c);
	}
 
	NrTelefoniczny( String a, String b, int ki, int tel)
	{
		nrkierunkowy=Integer.toString(ki);
		nrtelefonu=Integer.toString(tel);
		as=new Firma(a, b);
	}
	
	String drukuj_tel()
	{
		String tel;
		tel=nrkierunkowy + nrtelefonu;
		return tel;
		
	}
	String drukuj_dane()
	{
		String dane;
		if(as==null)
		{
			dane=os.opis();
		}
		else{
			dane=as.opis();
		}
		return dane;
		
	}
 
    @Override
    public int compareTo(NrTelefoniczny o) {
        int porownanenrKierunkowe = nrkierunkowy.compareTo(o.nrkierunkowy);
 
        if(porownanenrKierunkowe == 0) {
            return nrtelefonu.compareTo(o.nrtelefonu);
        }
        else {
            return porownanenrKierunkowe;
        }
    }
 
}