package LabThird_Oper_way;

public class AddFactory extends OperFactory{

	@Override
	public Oper Create() {
		// TODO Auto-generated method stub
		Oper oper=new Add();
		return oper;
	}

}
