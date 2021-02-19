package test;

import java.util.Scanner;

public class demo {
	public static void main(String[] args) {
		//定义字符串
		String detail = "";
		int balance=0;
		for(;;) {
		System.out.println("-------------欢迎使用小李子记账程序-----------------");
		System.out.println("1.查看收支明细");
		System.out.println("2.登 记 收 入");
		System.out.println("3.登 记 支 出");
		System.out.println("4.退      出");
		//用户交互
		System.out.println("请输入执行功能的编号(敲击回车确认)");
		Scanner sc =new Scanner (System.in);
		int choice =sc.nextInt();
		//数字过滤
		while(choice !=1 && choice !=2 && choice !=3 && choice !=4) {
			System.out.println("对不起，输入错误请输入合适编号(敲击回车确认)");
			int newchoice =sc.nextInt();
			choice=newchoice;
		}
		
		switch (choice) {
		case 1:
			System.out.println("小李子记账程序》》》》查看收支明细");
			System.out.println(detail);
			break;
		case 2:
			System.out.println("小李子记账程序》》》》登 记 收 入");
			System.out.println("请输入收入金额(敲击回车确认)");
			int income=sc.nextInt();
			System.out.println("请输入收入来源(敲击回车确认)");
			String incomeDetal=sc.next();
			balance=balance+income;
			
			detail +="收入金额："+income+",收入来源："+incomeDetal+",余额："+balance+"\n";
			System.out.println(detail);	
			break;
		case 3:
			System.out.println("小李子记账程序》》》》登 记 支 出");
			System.out.println("请输入支出金额(敲击回车确认)");
			int income1=sc.nextInt();
			System.out.println("请输入支出原因(敲击回车确认)");
			String incomeDetal1=sc.next();
			balance=balance-income1;
			
			detail +="支出金额："+income1+",支出原因："+incomeDetal1+",余额："+balance+"\n";
			System.out.println(detail);	
			break;
		case 4:
			System.out.println("小李子记账程序》》》》退出");
			return;//遇到return 结束当前方法
		}
		
		
		} 
	}
}