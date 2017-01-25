package com.ktds.mcj;

public class PersonMain {

	public static void main(String[] args) {
		
		Person khw = new Person();
		khw.setName("김형우");
		khw.setJob("프로그래머");
		khw.introduce();
		
		Person ibj = new Person();
		ibj.setName("인병주");
		ibj.setJob("축구선수");
		ibj.introduce();
		
		Person pmw = new Person();
		pmw.setName("박민우");
		pmw.setJob("백수");
		pmw.introduce();
		
		Person unknown = new Person();
		unknown.introduce();
		
		Person ksk = new Person("김슬기", "감독");
		ksk.introduce();
	}
	
}









