package ch07;

import java.math.BigDecimal;

public class DoubleTest {

	public static void main(String[] args) {
		
		double dnum = 3.14;
		float fnum = 3.14f;
		
		System.out.println(dnum);
		System.out.println(fnum);
		
		//�����ο� �����θ� �и�?.
		
		int inum = (int) dnum;
		System.out.println("�����δ� : " + inum);
		System.out.println("�����δ� : " + (dnum - inum));
		// �������� ���� �߻�
		//�ε��Ҽ��� ������ ���� ��Ȯ�� ���� ��µ��� �ʴ´�.
		
		//�ε� �Ҽ��� ǥ���� ������ �ذ��ϱ� ���ؼ��� BigDecimal Ŭ���� ���
		BigDecimal value0 = new BigDecimal(Integer.toString(inum));
		//int�� String���� ��ȯ�Ͽ� value0�� ����
		BigDecimal value = new BigDecimal(String.valueOf(dnum));
		//double�� String���� ��ȯ�Ͽ� value�� ����
		System.out.println("--------BigDecimal ���--------");
		System.out.println("�����δ� : " + value0);
		// BigDecimal ���� ������ .subtract�� .add �� ���
		System.out.println("�����δ� : " + value.subtract(value0));
	

		
	}
}
