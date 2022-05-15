package Adapter_mode;

public class Adapter implements DataOperation {

	private QuickSort quick;
	private BinarySearch binary;
	private InsertionSort insert;
	public Adapter() {
		// TODO Auto-generated constructor stub
		quick = new QuickSort();
		binary = new BinarySearch();
		insert =new InsertionSort();
	}

	@Override
	public int[] sort(int[] numberA) {
		// TODO Auto-generated method stub
		return quick.quickSort(numberA);

	}

	@Override
	public int search(int[] numberA, int numberB) {
		// TODO Auto-generated method stub
		return binary.binarySearch(numberA, numberB);
	}

	@Override
	public int[] sort1(int[] numberA) {
		// TODO Auto-generated method stub
		return insert.insertsort(numberA);
	}

}
