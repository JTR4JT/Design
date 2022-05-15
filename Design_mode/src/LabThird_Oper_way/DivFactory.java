package LabThird_Oper_way;

public class DivFactory extends OperFactory{

	@Override
	public Oper Create() {
		// TODO Auto-generated method stub
		Oper oper=new Div();
		return oper;
	}

}
