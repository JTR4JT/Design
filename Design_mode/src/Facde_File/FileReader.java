package Facde_File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReader {

	public String read(String fileNameSrc)
	{
		System.out.println("��ȡ�ļ�����ȡ����");
		StringBuffer sb=new StringBuffer();
		try {
			FileInputStream inFS=new FileInputStream(fileNameSrc);
			int data;
			while((data=inFS.read())!=-1)
			{
				sb=sb.append((char)data);
			}
			inFS.close();
			System.out.println(sb.toString());
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println("�ļ������ڣ�");
		}
		catch(IOException e)
		{
			System.out.println("�ļ���������");
		}
		return sb.toString();
		
	}
}