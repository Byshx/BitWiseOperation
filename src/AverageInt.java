
public class AverageInt {
	public static void main(String[] args) {
		System.out.println(new AverageInt().getAverage(10, 2));
	}

	// a&b 求相同位置下的数
	// a^b 求不同位置上的数 右移1位来除以2(相当于将两数与平均数相差的部分拿出来相加/2)
	public int getAverage(int a, int b) {
		return (a & b) + ((a ^ b) >> 1);
	}
}
