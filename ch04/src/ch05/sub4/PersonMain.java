package ch05.sub4;

public class PersonMain {
	public static void main(String[] args) {
		
		Person person1 = new Doctor("이상훈", 28, "흉부외과");
		person1.work();
		
		Person person2 = new Engineer("이영한", 52, "it분야");
		person2.work();
	}
}
