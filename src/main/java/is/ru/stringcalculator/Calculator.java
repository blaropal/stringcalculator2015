package is.ru.stringcalculator;

public class Calculator {

	public static int add(String numbers){
		if(numbers.equals("")){
			return 0;
		}
		int sum = 0;
		String[] list = numbers.split(",");
		for(String number : list){
			sum += Integer.parseInt(number);
		}
		return sum;
	}

}