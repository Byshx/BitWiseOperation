
public class BitAdd {
	// 位运算实现整数相加
	public static void main(String[] args) {
		System.out.println(new BitAdd().Add(10, 2));
	}

	public int Add(int a, int b) {
		if (b == 0)
			return a;
		// 计算无需进位的加法
		int sum = a ^ b;
		// 计算需要进位的加法
		int up = (a & b) << 1;
		return Add(sum, up);
	}

}
