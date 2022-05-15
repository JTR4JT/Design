package Facde_File;

public class MainSystem {
	private FileReader reader;
	private CipherMachine cipher;
	private FileWriter writer;
	public MainSystem() {
		// TODO Auto-generated constructor stub
		reader=new FileReader();
		cipher=new CipherMachine();
		writer=new FileWriter();
	}
	public void fileEncrypt(String fileNameSrc,String fileNameDes)
	{
		String plainStr=reader.read(fileNameSrc);
		String encryptStr=cipher.encrypt(plainStr);
		writer.write(encryptStr, fileNameDes);
	}

}
