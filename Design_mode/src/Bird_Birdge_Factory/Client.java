package Bird_Birdge_Factory;

import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		for(int i=0;i<3;i++)
		{
			System.out.println("请输入你需要测试的鸟儿：1代表鸽子，2代表老鹰，3代表企鹅");
			Scanner number = new Scanner(System.in);
			int num = number.nextInt();
			Bird bird =Factory.create(num);
			bird.setFly(new Fly());
			bird.setSwim(new Swim());
			bird.show();
		}
	}
}
