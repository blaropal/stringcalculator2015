package is.ru.stringcalculator;

public class Calculator {

	public static int add(String numbers){
		if(numbers.equals("")){
			return 0;
		}
		return sum(extractNumbers(numbers));
	}

	public static String[] extractNumbers(String numbers){
		return numbers.split(",");
	}

	public static int sum(String[] numbers){
		int sum = 0;
		for(String number : numbers){
			sum += Integer.parseInt(number);
		}
		return sum;
	}

}