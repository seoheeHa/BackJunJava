package javajungsuk;

public class Back15596 {
	
	long sum(int[] a) {
		// sum�Լ���  ���� �޾� �Ű������� �迭 a[] �� ���� �����Ѵ�
		int ans = 0;
		// ���� ans�� �����ϰ�, 0���� �ʱ�ȭ �Ѵ�.
		for(int  i=0; i<a.length; i++) {
			// �ݺ��� ���� , �迭 a[]���̸�ŭ �ݺ��Ѵ�.
			ans += a[i];
			// �迭�� ���� �޾� �������� ans�� �����Ѵ�.
		}
		return ans;
		//ans�� ���� �����Ѵ�. 
	}
	
}
