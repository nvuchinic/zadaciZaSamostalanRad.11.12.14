
public class Datum {
private int dan;
private int mjesec;
private int godina;

private Datum(){
	dan=1;
	mjesec=1;
	godina=1900;
}

public  Datum(int dan, int mjesec, int godina){
	this.dan=dan;
	this.mjesec=mjesec;
	this.godina=godina;
}

public Datum(Datum other){
	this.dan=other.dan;
	this.mjesec=other.mjesec;
	this.godina=other.godina;
	
}

public int getDan() {
	return dan;
}

public void setDan(int dan) {
	this.dan = dan;
}

public int getMjesec() {
	return mjesec;
}

public void setMjesec(int mjesec) {
	this.mjesec = mjesec;
}

public int getGodina() {
	return godina;
}

public void setGodina(int godina) {
	this.godina = godina;
}

/**
 *funkcija koja kreira i vraca String reprezentaciju objekta Datum
 */
public String toString(){
	String datumString="";
	datumString=dan+"."+mjesec+"."+godina;
	return datumString;
}


/**
 * funkcija koja postavlja vrijednost atributa godina na vrijednost parametra
 */
public void novaGodina(){
	this.dan=1;
	this.mjesec=1;
	this.godina=godina+1;
}

/**
 * funkcja koja namjesta sve atribute objekta Datum na vrijednosti parametara
 * @param noviDan
 * @param noviMjesec
 * @param novaGodina
 */
public void setDate(int noviDan, int noviMjesec, int novaGodina){
	this.dan=noviDan;
	this.mjesec=noviMjesec;
	this.godina=novaGodina;
}

/**
 *   funkcija koja povecava vrijednost atributa dan za vrijednost parametra

 * @param n integer
 */
public void povecajDan(int n){
	if(this.dan+n>31){
	int temp=31-dan;
	dan=n-temp;
	mjesec=mjesec+1;}
	else
		dan=dan+n;
	//godina=godina;
	}

/**
 * funkcija koja povecava vrijednost atributa mjesec za vrijednost parametra

 */
public void povecajMjesec(int n){
	//dan=dan;
	if(this.mjesec+n>12){
		int temp=12-mjesec;
		mjesec=n-temp;
		godina=godina+1;
	}
	else{
		//dan=dan;
		mjesec=mjesec+n;
		//godina=godina;
	}
}

/**
 * funkcija koja povecava vrijednost atributa godina za vrijednost parametra

 * @param n integer
 */
public void povecajGodinu(int n){
	
	godina=godina+n;
}

}







