package co.edu.variable;

public class SortExe {
	public static void main(String[] args) {
		int[] numAry = {34, 21, 12, 9, 8, 7, 6, 51 ,74 };
		
		//�ݺ����� ó��. 
		//numAry = {12,21,34} ������ , ���� ������ �����ǰԲ� 
		//���̽� : n1 > n2 > n3 -> ����ϰ�
		//���̽� : n1 < n2 > n3 -> ��� �ϴ���. ��ġ �ٲٴ� �����ؿ��� 
		
		//���� ���� �迭
		//1 1) �迭 ��� ���� n�� -> n-1��, n-2��, n-3�� ... n-1�� ��
//		if(numAry[0] > numAry[1]) { //ù��° �ι�° �� ��
//			int temp = numAry[0];
//			numAry[0] = numAry[1];
//			numAry[1] = temp;
//		}
//		if(numAry[1] > numAry[2]) { 
//			int temp = numAry[1];
//			numAry[1] = numAry[2]; 
//			numAry[2] = temp;
//		}
//		if(numAry[2] > numAry[3]) { 
//			int temp = numAry[2];
//			numAry[2] = numAry[3]; 
//			numAry[3] = temp;
//		}
//		
//		// 2)
//		if(numAry[0] > numAry[1]) { 
//			int temp = numAry[0];
//			numAry[0] = numAry[1]; 
//			numAry[1] = temp;
//		}
//		if(numAry[1] > numAry[2]) { 
//			int temp = numAry[1];
//			numAry[1] = numAry[2]; 
//			numAry[2] = temp;
//		}
//		
//		//3
//		if(numAry[0] > numAry[1]) { 
//			int temp = numAry[0];
//			numAry[0] = numAry[1]; 
//			numAry[1] = temp;
//		}
//		
//		//���� ���
//		for(int n : numAry) {
//			System.out.print(n+ " "); //println�� �ٹٲ��ϸ� ������
//		}
		
		//�ݺ������� �����۾�
//	for( int j = 0; j<numAry.length-1; j++) {
//		for (int i = 0; i <numAry.length-1; i++) {
//			if(numAry[i] > numAry[i+1]) {
//			int temp = 0;
//			temp = numAry[i]; // ������ ���� �Էµ� ���� �� ����
//			numAry[i] = numAry[i+1];
//			numAry[i+1] = temp;
//			}
//		}		
//	}
//		
	for(int i = 0; i<numAry.length-1; i++) {
		for(int j = 0; j<numAry.length-2; j++) {
			if(numAry[i] > numAry[i+1]) {
				int temp = 0;
				temp = numAry[i];
				numAry[i] = numAry[i+1];
				numAry[i+1] = temp;
			}
		}
	}
	for(int n : numAry) {
		System.out.print(n+ " "); //println�� �ٹٲ��ϸ� ������
	}

	
	}
}
