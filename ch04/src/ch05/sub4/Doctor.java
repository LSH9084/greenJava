package ch05.sub4;

public class Doctor extends Person{
	private String speciality;
	
	public Doctor(String name, int age, String speciality) {
		super(name, age);
		this.speciality = speciality;
	}
	
	public void work() {
		super.introduce();
		System.out.println("저는 의사이며 전공은 "+this.speciality+" 입니다.");
	}
	
	
	
	
	
}
