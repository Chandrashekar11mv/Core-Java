class Refrigerator{
	String color;
	double price;
	SelectType type;
	int noOfdoors=3;
	Stabilizer stab;
	
	Refrigerator(String color,double price){
		
		this.color=color;
		this.price=price;
	}
	
	void forType(SelectType type){
			
		this.type=type;
				
	}
	
	void forStab(Stabilizer stab){
		
		type=type.MINI;
		this.type=type;
		this.stab=stab;
					
	}
	
	void displayAllProperties(){
		System.out.println("color :" +color);
		System.out.println("Price :"+price);
		System.out.println("doors :"+noOfdoors);
		System.out.println("type :" +this.type);
		System.out.println("MaxVoltage is:" +this.stab.maxVoltage);
		System.out.println("its working :"+this.stab.working);
		System.out.println("Num of fuses :"+this.stab.noOfFuse);
	}
		
}