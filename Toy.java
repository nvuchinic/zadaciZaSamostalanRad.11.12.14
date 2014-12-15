
public class Toy {
private String name;
private String type;
private double price;
private int kol;
private int godPro;
private int dobGr;
	
public Toy(){
	name="toy";
	type="toy";
	price=1.0;
	godPro=2014;
	dobGr=0;
	}

public Toy(String name,String type, double price, int godPro,int dobGr ){
	this.name=name;
	this.type=type;
	this.price=price;
	this.godPro=godPro;
	this.dobGr=dobGr;
	kol++;
	
	}

public Toy(String name,String type, double price){
this.name=name;
this.type=type;
this.price=price;
this.godPro=2014;
this.dobGr=0;
}

public Toy(String name,String type, double price, int n){
this.name=name;
this.type=type;
this.price=price;
if(n>100)
	godPro=n;
else
	dobGr=n;
}


public String getName(){
	return name;
}

public void setName(String newName){
	name=newName;
}

public String getType(){
	return type;
}

public void setType(String newType){
	type=newType;
}

public double getPrice(){
	return price;
}

public void setPrice(double newPrice){
	price=newPrice;
}

public int getGodPro(){
	return godPro;
}

public void setGodPro(int newGodPro){
	godPro=newGodPro;
}

public int getDobGr(){
	return dobGr;
}

public void setDobGr(int newDobGr){
	dobGr=newDobGr;
}

public void setKol(int newKol){
	kol=newKol;
}

public int getKol(){
	return kol;
}

/**
 * funkcija koja kreira string reprezentaciju Toy objekta odnosno njegovih atributa
 * (ime, tip, cijena, godina proizvodnje, dobno ogranicenje)
 * @return String reprezentaciju Toy objekta
 */
public String toString(){
	String toyToString="";
	toyToString="\n\nIme igracke: "+name+"\nTip igracke: "+type+"\nCijena: "+price+"\nKolicina: "+kol+"\nGodina proizvodnje: " +
			""+godPro+"\nDobno ogranicenje: "+dobGr;
	return toyToString;
}

/**
 * funkcija koja prima objekt tipa Toy, i poredi ga sa objektom istog tipa koji je pozvao metodu.
 * Ako su objekti isti, funkcija vraca true, inace false.
 * (pretpostavio sam da su objekti  isti ako imaju isto ime i iste su vrste)
 * @param toy2 objekt tipa Toy
 * @return boolean vrijednost
 */
public boolean equals(Toy toy2){
	boolean iste=false;
	if(this.name.equals(toy2.name) && this.type.equals(toy2.type))
		iste =true;
	return iste;
}

public void copyToy(Toy other){
	this.name=other.name;
	this.type=other.type;
	this.price=other.price;
	this.godPro=other.godPro;
	this.dobGr=other.dobGr;
	
}

}

