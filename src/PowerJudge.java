
public class PowerJudge {
	public static void main(String[] args) {
		System.out.println(new PowerJudge().judge(32));
	}

	// �жϸ����Ƿ�Ϊ2����
	public boolean judge(int num) {
		return (num > 0) && (num & (num >> 1)) == 0;
	}

}
