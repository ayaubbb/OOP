package lab3.task5;

public class Sort {
	static <E> void swap(E [] array, int i, int j) {
		E temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	static <E extends Comparable<E>> void bubbleSort(E [] array) {
		int n = array.length;
		for(int i = 0; i < n - 1; i++) {
			for(int j = 0; j < n - i - 1; j++) {
				if(array[j].compareTo(array[j + 1])>0) {
					swap(array, j, j + 1);
				}
				
			}
		}
	}
	
	static <E extends Comparable<E>> void quickSort(E [] array, int low, int high) {
		if (low < high) {
            int pi = partition(array, low, high);
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
		}
	}
	
	private static <E extends Comparable<E>> int partition(E[] array, int low, int high) {
        E pivot = array[high]; 
        int i = (low - 1);
        for (int j = low; j <= high - 1; j++) {
            if (array[j].compareTo(pivot) <= 0) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, high);
        return (i + 1);
    }
}