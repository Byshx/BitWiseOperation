
public class BitSwapInt {
	public static void main(String[] args) {
		new BitSwapInt().swap(10, 20);
	}

	public void swap(int a, int b) {
		System.out.println("Before Swap: a=" + a + " b=" + b);
		a ^= b;
		b ^= a;
		a ^= b;
		System.out.println("After Swap: a=" + a + " b=" + b);
	}

}
