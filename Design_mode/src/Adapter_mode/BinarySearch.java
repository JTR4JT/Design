package Adapter_mode;

public class BinarySearch {
public int binarySearch(int[] numberA,int numberB) {
	int low = 0;
	int high = numberA.length - 1;
	int middle = 0;			//定义middle
	
	if(numberB < numberA[low] || numberB > numberA[high] || low > high){
		return -1;				
	}
	
	while(low <= high){
		middle = (low + high) / 2;
		if(numberA[middle] > numberB){
			//比关键字大则关键字在左区域
			high = middle - 1;
		}else if(numberA[middle] < numberB){
			//比关键字小则关键字在右区域
			low = middle + 1;
		}else{
			return middle;
		}
	}
	
	return -1;	

}
}
