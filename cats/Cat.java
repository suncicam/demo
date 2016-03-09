package rtrk.pnrs.cats;
import rtrk.pnrs.food.Portion;

public abstract class Cat{

	public void pet(){
		System.out.println("Dont pet it....");
	}
	
	public abstract String say();
	
	public void feed(Portion food){
		food.setFood(55);
	}
}