package co.edu.variable;

//추상화 : 필요한 만큼만 정보를 만들어 낼거당..
public class Person {
	//속성 -> 필드. 
	String name;
	int age;
	double height;
	
	// 기능 -> 메소드.
	void laugh() {
		System.out.println("웃는다.");
	}
	void sleep() {
		System.out.println("잠을 잡니다.");
	}
}
