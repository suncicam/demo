package rtrk.pnrs.cats;
import rtrk.pnrs.cats.Cat;

public class Lion extends Cat{

	public String say(){
		
		return "ROAR";
	}
	public void pet(){
		super.pet();
		System.out.println("neki drugi string");
	}
	
	
}