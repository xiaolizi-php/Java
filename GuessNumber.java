package test;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {
		Random r =new Random();
		int Number=r.nextInt(50)+1;
		System.out.println("--------------��ӭʹ��С���Ӳ�������Ϸ----------------");
		//System.out.println(Number);
		System.out.println("1-50������Ѿ�����");
		for(int i=0 ;i<5;i++) {
		Scanner sc =new Scanner(System.in);
		System.out.println("������1-50������");
		int number = sc.nextInt();
		
		
		
		if(Number==number){
			System.out.println("--------------��ϲ�㣡���¶���----------------");
			break;
		}else {
				if(number>Number) {
					System.out.println("sorry!!���´���");
				}else {
					System.out.println("sorry!!����С��");
				}
			}
		if(i==4){
			System.out.println("���Ѿ�����"+(i+1)+"���ˣ�û������");
		}else {
			System.out.println("�������Բ�"+(4-i)+"�Σ�����ϧ����");
			
		}
		}
		
	}
}
