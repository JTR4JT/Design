package LabThird_Oper_way;

public class MulFactory extends OperFactory{

	@Override
	public Oper Create() {
		// TODO Auto-generated method stub
		Oper oper=new Mul();
		return oper;
	}

}
