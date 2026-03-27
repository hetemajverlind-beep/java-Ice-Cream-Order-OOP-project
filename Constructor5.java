import java.util.Scanner;
public class Constructor5{
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	/*
	This is a project that is build by me for 
	managing orders for Icecream.
	
	I used Variables,Atribute,Arrays,Objects,OOP,
	Methods(in class IceCream),do-while Loop,if,
	else-if, for Loop,for nested Loop,
	Constructor, Overloaded Constructor.
	
	*/
	
	int nr;
	do{
	System.out.print("How many people whant icecream (not more than 3): ");
	nr = scan.nextInt();
	}while(nr>3);
	
	IceCream[] p = new IceCream[nr];
	String[] people = new String[nr];
	int[] many = new int[nr];
	int[] scoop = new int[nr];
	String[][] cream = new String[nr][3];
	
	scan.nextLine();
	for(int i =0;i<nr;i++){
		
	System.out.print("Your Name :");
	people[i] = scan.nextLine();
	
	
	System.out.print("How many icecremas do you whant : ");
	many[i] = scan.nextInt();
	
	do{
	System.out.print("How many scoop for an icecream (3 or less) : ");
	scoop[i] = scan.nextInt();
	}while(scoop[i]>3);
	
	scan.nextLine();
	
	for(int j =0;j<scoop[i];j++){
		System.out.print("What cream do you whant for scoop "+(j+1)+" : ");
		cream[i][j] = scan.nextLine();
		
	}
	
	
	
	if(scoop[i] == 1){
	p[i] = new IceCream(people[i],many[i],scoop[i], cream[i][0]);
	
	}
	else if(scoop[i] == 2){
	p[i] = new IceCream(people[i],many[i],scoop[i], cream[i][0],cream[i][1]);
	
	}
	else if(scoop[i] == 3){
	p[i] = new IceCream(people[i],many[i],scoop[i], cream[i][0], cream[i][1],cream[i][2]);
	
	}
	
	}
	
	
	for(int i =0;i<p.length;i++){
		System.out.println(p[i].name+" has "+ p[i].many+" icecream with "+
		p[i].size+" scoop with "+ p[i].creams()+" creams , Enjoy!");
	}
	
	
		
	

	}

}