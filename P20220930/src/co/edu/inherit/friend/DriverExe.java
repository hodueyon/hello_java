package co.edu.inherit.friend;

public class DriverExe {
public static void main(String[] args) {
	Car car = new Car();
	Bus bus = new Bus();
	
	Driver driver = new Driver();
	driver.drive(car); //Vehicle�ν��Ͻ�
	driver.drive(bus);
	
	//������ : ������ driver �޼ҵ带 �����ߴµ� ����ִ� �ŰԺ���, �ʵ�, �ν��Ͻ��� ���� ���� �޶����°�
	// -> ������ ����� �����ϴµ� �ٸ� ����� ��Ÿ���� ��. 
	
}
}
