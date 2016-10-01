
public class CountOne {
	// 计算一个数的二进制中有几个1，当输入数据的二进制表示里有偶数个数字1时程序输出0，有奇数个则输出1。
	// 例如，1314520的二进制101000000111011011000中有9个1，则x=1314520时程序输出1。
	public static void main(String[] args) {
		System.out.println(new CountOne().Caluclate(1314520));
	}

	public int Caluclate(int num) {
		num ^= (num >> 1);
		num ^= (num >> 2);
		num ^= (num >> 4);
		num ^= (num >> 8);
		num ^= (num >> 16);
		return num & 1;
	}

}
