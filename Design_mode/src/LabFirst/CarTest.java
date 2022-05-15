package LabFirst;
public class CarTest {
public static void main(String[] args) {
	Drive drive =new Drive();
	drive.setName("ZhangSan");
	Car car=drive.creat("BMW");
	drive.drive(car);
	drive.setName("LiSi");
	car=drive.creat("Benz");
	drive.drive(car);
	
}
}
