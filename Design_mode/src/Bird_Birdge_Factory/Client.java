package Bird_Birdge_Factory;

import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		for(int i=0;i<3;i++)
		{
			System.out.println("����������Ҫ���Ե������1������ӣ�2������ӥ��3�������");
			Scanner number = new Scanner(System.in);
			int num = number.nextInt();
			Bird bird =Factory.create(num);
			bird.setFly(new Fly());
			bird.setSwim(new Swim());
			bird.show();
		}
	}
}
