package Facde_File;

public class CipherMachine {
	public String encrypt(String plainText)
	{
		System.out.println("���ݼ��ܣ������ļ��ܳ�����:");
		String es="";
		for (int i = 0; i < plainText.length(); i++) {
			String c=String.valueOf(plainText.charAt(i)%7);
			es+=c;
		}
		System.out.println(es);
		return es;
	}
}
