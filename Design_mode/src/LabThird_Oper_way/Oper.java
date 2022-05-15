package LabThird_Oper_way;

public abstract class Oper {
	private double NumberA;
	private double NumberB;

	public abstract double operation(double NumberA, double NumberB);

	public double getNumberA() {
		return NumberA;
	}

	public void setNumberA(double numberA) {
		NumberA = numberA;
	}

	public double getNumberB() {
		return NumberB;
	}

	public void setNumberB(double numberB) {
		NumberB = numberB;
	}

}