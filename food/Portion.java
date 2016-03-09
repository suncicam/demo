package rtrk.pnrs.food;

public class Portion{
	
	private float myfood;
	
	public void setFood(float food)throws IllegalArgumentException{

		if(food<0){
			throw new IllegalArgumentException();
		}else{
			myfood=food;
		}
		
	}
	
	public float getFood(){
		return myfood;		
	}
}