package rtrk.pnrs;
import rtrk.pnrs.cats.Lion;
import rtrk.pnrs.cats.Cat;
import rtrk.pnrs.cats.DomesticCat;
import rtrk.pnrs.food.Portion;

public class AnimalKingdom{
	public static void main(String[] arg){
		
		Lion lion=new Lion();
		DomesticCat cat=new DomesticCat();
		Portion sandwich = new Portion();
		
		Cat[] cats ={new Lion(),new DomesticCat()};
		
		System.out.println("Lion says "+lion.say()+" !!!!!!");
		
		lion.pet();
		
		System.out.println("Cat say "+cat.say()+" !!!!!!");
		
		
		for(int i=0;i<cats.length;i++){
			System.out.println("Cats say: "+ cats[i].say());
		}
		
		try{
			sandwich.setFood(-1);
			System.out.println("My food: "+sandwich.getFood()); 
			
		}catch(IllegalArgumentException e){
			System.out.println("ERROR");
			
		}
	}
}