package com.tns.daytwo.an;

public class RcbTeams {

	private String name;
	private int age;
	private int jersyNo;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name; // this refer to class's words
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getJersyNo() {
		return jersyNo;
	}

	public void setJersyNo(int jersyNo) {
		this.jersyNo = jersyNo;
	}

	public static void main(String[] args) {

		RcbTeams obj = new RcbTeams();

		obj.setName("Virat Kholi");
		obj.setAge(35);
		obj.setJersyNo(18);

		System.out.println(obj.getName());
		System.out.println(obj.getAge());
		System.out.println(obj.getJersyNo());

	}

}
