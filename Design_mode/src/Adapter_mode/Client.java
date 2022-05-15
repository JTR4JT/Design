package Adapter_mode;

import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		DataOperation quick;
		DataOperation binary;
		int[] numberA= {8,5,1,6,3};
		quick =new Adapter();
		System.out.println("排序前：");
		for(int i=0;i<numberA.length;i++)
			System.out.print(numberA[i]+",");
		System.out.println();
//		numberA=quick.sort(numberA);
		quick.sort1(numberA);
		System.out.println();
		System.out.println("排序：");
		for(int i=0;i<numberA.length;i++)
			System.out.print(numberA[i]+",");
		System.out.println();
		binary=new Adapter();
		Scanner num=new Scanner(System.in);
		System.out.println("输入你想查找的数：");
		int key =num.nextInt();
		System.out.println("查找的数的位置是:"+binary.search(numberA, key));
//		
	}

}
