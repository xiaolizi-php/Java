package test;

import java.util.Scanner;

public class demo {
	public static void main(String[] args) {
		//�����ַ���
		String detail = "";
		int balance=0;
		for(;;) {
		System.out.println("-------------��ӭʹ��С���Ӽ��˳���-----------------");
		System.out.println("1.�鿴��֧��ϸ");
		System.out.println("2.�� �� �� ��");
		System.out.println("3.�� �� ֧ ��");
		System.out.println("4.��      ��");
		//�û�����
		System.out.println("������ִ�й��ܵı��(�û��س�ȷ��)");
		Scanner sc =new Scanner (System.in);
		int choice =sc.nextInt();
		//���ֹ���
		while(choice !=1 && choice !=2 && choice !=3 && choice !=4) {
			System.out.println("�Բ������������������ʱ��(�û��س�ȷ��)");
			int newchoice =sc.nextInt();
			choice=newchoice;
		}
		
		switch (choice) {
		case 1:
			System.out.println("С���Ӽ��˳��򡷡������鿴��֧��ϸ");
			System.out.println(detail);
			break;
		case 2:
			System.out.println("С���Ӽ��˳��򡷡������� �� �� ��");
			System.out.println("������������(�û��س�ȷ��)");
			int income=sc.nextInt();
			System.out.println("������������Դ(�û��س�ȷ��)");
			String incomeDetal=sc.next();
			balance=balance+income;
			
			detail +="�����"+income+",������Դ��"+incomeDetal+",��"+balance+"\n";
			System.out.println(detail);	
			break;
		case 3:
			System.out.println("С���Ӽ��˳��򡷡������� �� ֧ ��");
			System.out.println("������֧�����(�û��س�ȷ��)");
			int income1=sc.nextInt();
			System.out.println("������֧��ԭ��(�û��س�ȷ��)");
			String incomeDetal1=sc.next();
			balance=balance-income1;
			
			detail +="֧����"+income1+",֧��ԭ��"+incomeDetal1+",��"+balance+"\n";
			System.out.println(detail);	
			break;
		case 4:
			System.out.println("С���Ӽ��˳��򡷡������˳�");
			return;//����return ������ǰ����
		}
		
		
		} 
	}
}