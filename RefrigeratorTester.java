class RefrigeratorTester{
public static void main(String[] args){
   
	Refrigerator ice=new Refrigerator("black",15000);

		Stabilizer cons=new Stabilizer(300000d,true,3);
		ice.forStab(cons);
		ice.displayAllProperties();
	}
}