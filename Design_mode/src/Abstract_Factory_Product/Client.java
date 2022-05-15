package Abstract_Factory_Product;

public class Client {
public static void main(String[] args) {
//	Factory factory;
//	Tv tv;
//	A_c air;
//	factory=new Hairfactory();
//	tv=factory.CreateTv();
//	tv.Play();
//	factory=new TclFactory();
//	air=factory.CreateA_c();
//	air.Work();
	String s = "[][()()()][][][][][][][]";
	int length = s.length() / 2;
	for (int i = 0; i < length; i++) {
		s = s.replace("()", "").replace("{}", "").replace("[]", "");
	}
	System.out.println(s);
//	char[] a = s.toCharArray();
//	int z = 0;
//	int x = 0;
//	int c = 0;
//	int v = 0;
//	int b = 0;
//	int n = 0;
//	for(int i = 0;i<a.length;i++)
//	{
//		if(a[i] == '(')
//			z++;
//		if(a[i] == ')')
//			x++;
//		if(a[i] == '[')
//			c++;
//		if(a[i] == ']')
//			v++;
//		if(a[i] == '{')
//			b++;
//		if(a[i] == '}')
//			n++;	
//	}
//	if(z==x&&c==v&&b==n)
//		System.out.println(1);
//	else
//		System.out.println("²»Æ¥Åä");
	
	
//	System.out.print(s.length());
	
}
}
