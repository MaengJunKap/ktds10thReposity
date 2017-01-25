package com.ktds.mcj;

public class Army {

	public final String JOB = "직업군인";
	
	public Person makeArmy( String name ) {
		
		// 외부에서 전달받은 이름을 이용해 Person 객체를 생성한다.
		Person army = new Person(name, JOB);
		
		// 생성된 Person 객체를 반환한다.
		return army;
		
	}
	
}
