package lab3.task5;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chocolate[] chocolates = {
	            new Chocolate(100, "Twix"),
	            new Chocolate(50, "Mars"),
	            new Chocolate(85, "Snickers")
	        };
	        
	        System.out.println("Before sorting chocolates: ");
	        printArray(chocolates);
	        
	        Sort.bubbleSort(chocolates);
	        
	        System.out.println("After BubbleSort: ");
	        printArray(chocolates);

	        Time[] times = {
	            new Time(23, 50, 10),
	            new Time(10, 5, 0),
	            new Time(15, 30, 45)
	        };

	        System.out.println("Before sorting times: ");
	        printArray(times);
	        
	        Sort.quickSort(times, 0, times.length - 1);
	        
	        System.out.println("After QuickSort: ");
	        printArray(times);
	    }

	    static <E> void printArray(E[] arr) {
	        for (E item : arr) System.out.println(item);
	    }
}


