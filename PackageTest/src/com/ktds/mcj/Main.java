package com.ktds.mcj;

import com.ktds.mcj.hospital.Doctor;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Package Test 입니다...");
		
//		com.ktds.mcj.hospital.Doctor doctor = 
//				new com.ktds.mcj.hospital.Doctor();
		
		Doctor doctor = new Doctor();
		doctor.hello();
		
	}
	
}
