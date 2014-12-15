
public class ToyStore {
private String tsName;
private Toy[] toyArray;
public static int vel=10;

public ToyStore(){
	tsName="toyStore";
	Toy[] toyArray=new Toy[vel];
	if(toyArray.length==vel){
		expandArray(toyArray);
	}
}

public ToyStore(String name, Toy[] toyArray){
	this.tsName=name;
	this.toyArray=toyArray;
	/*Toy[] toyArray=new Toy[vel];
	if(toyArray.length==vel){
		expandArray(toyArray);
	}*/
}



public void expandArray(Toy[] arr){
	Toy[] arr2=new Toy[arr.length*2];
	for(int i=0;i<arr.length;i++){
		arr2[i].copyToy(arr[i]);
	}
	arr=arr2;
}

public String toString(){
	String tsToString="";
	String toyArrayS="";
	tsToString="Ime prodavnice: "+tsName+"\n_____________________";
	for(int i=0;i<toyArray.length;i++){
		toyArrayS+=toyArray[i].toString();
		//System.out.println();
	}
	tsToString+=toyArrayS;
	return tsToString;
}

public void ispisiPoKolicini(Toy[] arr){
	for(int i=0;i<arr.length;i++){
		if(arr[i])
	}
}


}