package day001;

public class xuanze {
	public void sort(int[] n) {
		// ��һ��forѭ����ʾ�ڼ���ѭ��
		for (int i = 0; i < n.length-1; i++) {
			// �ڶ���forѭ����ʾ�ô�ѭ�����м��αȽ�
			for (int j = i+1; j < n.length; j++) {
				// �жϱȽ��Ƿ���л�λ
				if (n[i] > n[j ]) {
					int temp = n[i];
					n[i] = n[j];
					n[j ] = temp;
				}
			}
			print(n);
		}
	}

	public void print(int[] n) {
		for (int i = 0; i < n.length; i++)
			// ��������������
			System.out.print(n[i] + "\t");
		System.out.println();
	}

	public static void main(String[] args) {
		xuanze s = new xuanze();
		// �˴�Ϊ��Ҫ���������
		int[] n = { 100, 60, 80, 90, 75, 38 };
		s.sort(n);
		s.print(n);
	}
}
