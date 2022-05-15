package LabThird_Oper_way;

import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		OperFactory operfactory=null;
		Oper oper = null;
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
			if (type.trim().equals("+")) {
				operfactory=new AddFactory();
				oper=operfactory.Create();
			}
			else if (type.trim().equals("-"))
				{
				operfactory=new SubFactory();
				oper=operfactory.Create();
				}
			else if (type.trim().equals("*"))
				{
				operfactory=new MulFactory();
				oper=operfactory.Create();
				}
			else if (type.trim().equals("/"))
			{
				operfactory=new DivFactory();
				oper=operfactory.Create();
			}
			else
				System.out.println("运算符不正确！");
		
			
		}
		if(type.equals("/")&&NumberB==0)
			System.out.println("除数不能为0！");
		else
		System.out.println(oper.operation(NumberA, NumberB));
		
}
}