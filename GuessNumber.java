package test;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {
		Random r =new Random();
		int Number=r.nextInt(50)+1;
		System.out.println("--------------欢迎使用小李子猜数字游戏----------------");
		//System.out.println(Number);
		System.out.println("1-50随机数已经生成");
		for(int i=0 ;i<5;i++) {
		Scanner sc =new Scanner(System.in);
		System.out.println("请输入1-50的整数");
		int number = sc.nextInt();
		
		
		
		if(Number==number){
			System.out.println("--------------恭喜你！！猜对了----------------");
			break;
		}else {
				if(number>Number) {
					System.out.println("sorry!!您猜大了");
				}else {
					System.out.println("sorry!!您猜小了");
				}
			}
		if(i==4){
			System.out.println("您已经猜了"+(i+1)+"次了，没机会了");
		}else {
			System.out.println("您还可以猜"+(4-i)+"次，请珍惜机会");
			
		}
		}
		
	}
}
