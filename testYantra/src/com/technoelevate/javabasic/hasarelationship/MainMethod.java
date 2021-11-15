package com.technoelevate.javabasic.hasarelationship;

public class MainMethod {
	public static void main(String[] args) {
		Engine engine=new Engine("s4","30.11.2102","he4562","diseal");
		Tyre tyres=new Tyre("mrf","tubeless",14.6f,14322.215);
		
		Vehicle vehicle=new Vehicle("Audi","black",engine,tyres,4000000);
		vehicle.status();
		
	}

}
