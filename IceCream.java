public class IceCream{
	/*
	This is the class that has the Atribute , 
	Overloaded Constructor and Method.
	
	*/
	
	String name;
	int many;
	int size;
	String cream1;
	String cream2;
	String cream3;
	
	
	
	
	
	IceCream(String name, int many, int size, String cream1){
		
	this.name = name;
	this.many = many;
	this.size = size;
	this.cream1 = cream1;
		
	}
	
	IceCream(String name, int many, int size, String cream1,String cream2){
		
	this.name = name;
	this.many = many;
	this.size = size;
	this.cream1 = cream1;
	this.cream2 = cream2;
	
	}
	
	IceCream(String name, int many, int size, String cream1,String cream2,String cream3){
		
	this.name = name;
	this.many = many;
	this.size = size;
	this.cream1 = cream1;
	this.cream2 = cream2;
	this.cream3 = cream3;
		
	}
	
	String creams(){
    String result = "";

    if(cream1 != null) result += cream1 + " ,";
    if(cream2 != null) result += cream2 + " ,";
    if(cream3 != null) result += cream3 + " ";

    return result;
}
	
}