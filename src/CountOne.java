
public class CountOne {
	// ����һ�����Ķ��������м���1�����������ݵĶ����Ʊ�ʾ����ż��������1ʱ�������0���������������1��
	// ���磬1314520�Ķ�����101000000111011011000����9��1����x=1314520ʱ�������1��
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
