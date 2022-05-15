package Adapter_mode;

public class BinarySearch {
public int binarySearch(int[] numberA,int numberB) {
	int low = 0;
	int high = numberA.length - 1;
	int middle = 0;			//����middle
	
	if(numberB < numberA[low] || numberB > numberA[high] || low > high){
		return -1;				
	}
	
	while(low <= high){
		middle = (low + high) / 2;
		if(numberA[middle] > numberB){
			//�ȹؼ��ִ���ؼ�����������
			high = middle - 1;
		}else if(numberA[middle] < numberB){
			//�ȹؼ���С��ؼ�����������
			low = middle + 1;
		}else{
			return middle;
		}
	}
	
	return -1;	

}
}
