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
			System.out.println("������һ����:");
			Scanner Number =new Scanner(System.in);
			 NumberA=Number.nextInt();
			System.out.println("������+-*/����һ���ַ���");
			 type=Number.next();
			System.out.println("������һ����:");
			 NumberB=Number.nextInt();
			System.out.println("������Ϊ:");
			oper=OperFactory.Choose(type);
		}
		if(type.equals("/")&&NumberB==0)
			System.out.println("��������Ϊ0��");
		else
		System.out.println(oper.operation(NumberA, NumberB));
	}
}
