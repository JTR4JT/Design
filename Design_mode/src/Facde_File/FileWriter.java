package Facde_File;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriter {
	public void write(String encryptStr,String fileNameDes)
 {
	 System.out.println("�����ļ���д���ļ�");
	 try {
		FileOutputStream outFS =new FileOutputStream(fileNameDes);
		outFS.write(encryptStr.getBytes());
		outFS.close();
	}	 catch (FileNotFoundException e) {
		// TODO: handle exception
		System.out.println("�ļ������ڣ�");
	}
	catch(IOException e)
	{
		System.out.println("�ļ���������");
	}
}
}
