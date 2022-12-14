package co.edu.emp;

//CRUD 처리.
public interface EmployeeService {
	//초기화(init)
	public void init();
	//추가
	public void input();
	//조회
	public void search();
	public String search(int employeeId); //사원 아이디의 이름 반환.
	public void print(); //전체사원정보 출력.
	public int searchSal(int employeeId); //사원아이디 -> 급여 반환
	
}
