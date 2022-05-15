package LabThird_Oper_way;

public class SubFactory extends OperFactory {

	@Override
	public Oper Create() {
		// TODO Auto-generated method stub
		Oper oper=new Sub();
		return oper;
	}

}
