
public class BitAdd {
	// λ����ʵ���������
	public static void main(String[] args) {
		System.out.println(new BitAdd().Add(10, 2));
	}

	public int Add(int a, int b) {
		if (b == 0)
			return a;
		// ���������λ�ļӷ�
		int sum = a ^ b;
		// ������Ҫ��λ�ļӷ�
		int up = (a & b) << 1;
		return Add(sum, up);
	}

}
