package co.edu.variable;

public class SortExe {
	public static void main(String[] args) {
		int[] numAry = {34, 21, 12};
		
		//�ݺ����� ó��. 
		//numAry = {12,21,34} ������ , ���� ������ �����ǰԲ� 
		//���̽� : n1 > n2 > n3 -> ����ϰ�
		//���̽� : n1 < n2 > n3 -> ��� �ϴ���. ��ġ �ٲٴ� �����ؿ��� 
		
		if(numAry[0] > numAry[1]) { //34 > 21
			int temp = numAry[0];
			numAry[0] = numAry[1]; //21�̶� ��
			numAry[1] = temp;
		}
		
		for(int n : numAry) {
			System.out.println(n);
		}
	}
}
