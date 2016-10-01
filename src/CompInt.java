
public class CompInt {
	public static void main(String[] args) {
		System.out.println(new CompInt().compare(1, 2));
	}

	public int compare(int a, int b) {
		int c = a ^ b;
		//异或运算为0 即两个数每一位都相同(异或运算：对应位相同为0，不同为1)
		if (c == 0)
			return 0;
		//整个操作使最高位保留，其他位置为0 如001xxxxx  ---->  00100000
		c |= c >> 1;
		c |= c >> 2;
		c |= c >> 4;
		c |= c >> 8;
		c |= c >> 16;
		System.out.println((byte)c);
		c ^= c >> 1;
		//将一个数与保留最高位的数进行与运算操作，如果为0说明此数最高位不在最大数的最高位所在位置，即此数小于另一个数
		return (a & c) != 0 ? 1 : -1;
	}

}
