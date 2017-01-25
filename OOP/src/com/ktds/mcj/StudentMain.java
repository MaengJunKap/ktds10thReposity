package com.ktds.mcj;

public class StudentMain {

	public static void main(String[] args) {
		
		Student khs = new Student();
		khs.setName("고흥수");
		khs.setGrade(1);
		khs.setClassRoomNumber(206);
		khs.setSchoolName("ktds university");
		
		String[] books = {"Angular.js2", "React.js"};
		khs.setBooks(books);
		
		khs.introduce();
		khs.study();
		
		Student sjm = new Student();
		sjm.setName("손진무");
		sjm.setGrade(1);
		sjm.setClassRoomNumber(201);
		sjm.setSchoolName("ktds university");
		String[] books1 = {"Angular.js2", "React.js"};
		khs.setBooks(books1);
		
		khs.introduce();
		khs.study();
		
		
	}
	
}
