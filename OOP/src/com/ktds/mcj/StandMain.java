package com.ktds.mcj;

public class StandMain {

	public static void main(String[] args) {
		
		Stand stand = new Stand();
		
		
		stand.brightnessControlUp();
		stand.brightnessControlDown();
		
		stand.on();
		
		stand.brightnessControlUp();
		stand.brightnessControlDown();
		
		stand.off();
		
	}
	
}
