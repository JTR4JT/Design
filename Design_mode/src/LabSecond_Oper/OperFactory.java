package LabSecond_Oper;

public class OperFactory {
	public static Oper Choose(String type) {
		Oper oper = null;
		
			if (type.trim().equals("+"))
				oper = new Add();
			else if (type.trim().equals("-"))
				oper = new Sub();
			else if (type.trim().equals("*"))
				oper = new Mul();
			else if (type.trim().equals("/"))
				oper = new Div();
			else
				System.out.println("运算符不正确！");
		
		return oper;
	}
}
