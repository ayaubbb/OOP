package lab1.task3;

public class TemperatureTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Temperature value = new Temperature();
		Temperature highTemperature = new Temperature(40, 'C');
		
		System.out.println(highTemperature.getDegreesF());
		System.out.println(value.getDegreesC());
		
		value.setBoth(100, 'C');
		System.out.println(value.getDegreesF());
		
		Temperature onlyScale = new Temperature('F');
		System.out.println(onlyScale.getDegreesC());
		
	}

}
