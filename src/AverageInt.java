
public class AverageInt {
	public static void main(String[] args) {
		System.out.println(new AverageInt().getAverage(10, 2));
	}

	// a&b ����ͬλ���µ���
	// a^b ��ͬλ���ϵ��� ����1λ������2(�൱�ڽ�������ƽ�������Ĳ����ó������/2)
	public int getAverage(int a, int b) {
		return (a & b) + ((a ^ b) >> 1);
	}
}
