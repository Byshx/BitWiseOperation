
public class CompInt {
	public static void main(String[] args) {
		System.out.println(new CompInt().compare(1, 2));
	}

	public int compare(int a, int b) {
		int c = a ^ b;
		//�������Ϊ0 ��������ÿһλ����ͬ(������㣺��Ӧλ��ͬΪ0����ͬΪ1)
		if (c == 0)
			return 0;
		//��������ʹ���λ����������λ��Ϊ0 ��001xxxxx  ---->  00100000
		c |= c >> 1;
		c |= c >> 2;
		c |= c >> 4;
		c |= c >> 8;
		c |= c >> 16;
		System.out.println((byte)c);
		c ^= c >> 1;
		//��һ�����뱣�����λ����������������������Ϊ0˵���������λ��������������λ����λ�ã�������С����һ����
		return (a & c) != 0 ? 1 : -1;
	}

}
