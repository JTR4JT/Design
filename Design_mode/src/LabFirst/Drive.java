package LabFirst;

public class Drive {
   private String name;
    public void drive(Car car)
    {
    	System.out.print(name+" Driving ");
    	car.move();
    }
    public Car creat(String name)
    {
    	if(name.equals("BMW"))
    		return new BMW();
    	else if(name.equals("Benz"))
    		return new Benz();
    	else if(name.equals("VM"))
    		return new VM();
    	else
    		return null;
    }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
    
}
