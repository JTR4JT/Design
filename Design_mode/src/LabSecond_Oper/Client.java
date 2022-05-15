package LabSecond_Oper;

import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		Oper oper=null;
		int NumberA = 0;
		int NumberB = 0;
		String type = null;
		while(oper==null)
		{
			System.out.println("请输入一个数:");
			Scanner Number =new Scanner(System.in);
			 NumberA=Number.nextInt();
			System.out.println("请输入+-*/任意一个字符：");
			 type=Number.next();
			System.out.println("请输入一个数:");
			 NumberB=Number.nextInt();
			System.out.println("运算结果为:");
			oper=OperFactory.Choose(type);
		}
		if(type.equals("/")&&NumberB==0)
			System.out.println("除数不能为0！");
		else
		System.out.println(oper.operation(NumberA, NumberB));
	}
}
