package day001;

public class maopao {
	public void sort(int[] n) {
		// ��һ��forѭ����ʾ�ڼ���ѭ��
		for (int i = 1; i < n.length; i++) {
			// �ڶ���forѭ����ʾ�ô�ѭ�����м��αȽ�
			for (int j = 0; j < n.length - i; j++) {
				// �жϱȽ��Ƿ���л�λ
				if (n[j] > n[j + 1]) {
					int temp = n[j];
					n[j] = n[j + 1];
					n[j + 1] = temp;
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
		maopao s = new maopao();
		// �˴�Ϊ��Ҫ���������
		int[] n = { 100, 60, 80, 90, 75, 38 };
		s.sort(n);
		s.print(n);
	}
}
