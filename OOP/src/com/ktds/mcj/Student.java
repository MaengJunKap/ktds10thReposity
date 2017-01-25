package com.ktds.mcj;

public class Student {

	// 속성
	/*
	 * 이름, 학교명, 학년, 반, 교과서
	 */
	private String name = "손진무";
	private String schoolName = "ktds";
	private int grade = 2;
	private int classRoomNumber = 201;
	private String[] books = {"Java 프로그래밍 실무", "난 정말 JAVA를 공부한 적이 없다구요!"};
	
	// instance field 에 대해서 setter 생성.
	/**
	 * name 인스턴스 필드를 갱신함.
	 */
	public void setName(String name) {
		// 파라미터로 전달된 데이터의 길이가 3이면 변경을 해준다.
		if ( name.length() == 3 ) {
			this.name = name;
		}
	}
	
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public void setClassRoomNumber(int classRoomNumber) {
		this.classRoomNumber = classRoomNumber;
	}
	
	public void setBooks(String[] books) {
		this.books = books;
	}
	
	/*
	public void set멤버변수명(멤버변수타입 멤버변수명) {
		this.멤버변수명 = 멤버변수명;
	}
	*/
	
	// 기능
	/*
	 * 자기소개 한다.
	 * 공부를 한다. 시험을 친다. 교과서를 읽는다.
	 */
	public void introduce() {
		String introduceMessage = String.format("안녕하세요. %s입니다. %d학년 %d반 입니다.", name, grade, classRoomNumber);
		System.out.println(introduceMessage);
	}
	
	public void study() {
		System.out.println("열공중...!");
		for (int i = 0; i < books.length; i++) {
			System.out.println(books[i] + "를 읽는 중..!");
		}
	}
	
	public void test() {
		System.out.println("시험치는 중!!");
		for (int i = 0; i < books.length; i++) {
			System.out.println(books[i] + " 시험을 치는 중..!");
		}
	}
	
	public void readBooks() {
		for (int i = 0; i < books.length; i++) {
			System.out.println(books[i] + "를 읽는 중..!");
		}
	}
	
}
