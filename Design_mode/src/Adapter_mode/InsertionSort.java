package Adapter_mode;

public class InsertionSort {
	public int[] insertsort(int[] agrs)
	{
		int numA;
		for(int num=1;num<agrs.length;num++)
		{
//			System.out.println("外面"+num);
			for(int numB=num;numB>0;numB--) {
//				System.out.println("里面"+numB);
//				System.out.println(agrs[numB]);
//				System.out.println(agrs[numB+1]);
				if(agrs[numB]<agrs[numB-1])
				{
					
					numA=agrs[numB];
					agrs[numB]=agrs[numB-1];
					agrs[numB-1]=numA;
				}
			}	
		}
		
		return agrs;
		
	}
}
