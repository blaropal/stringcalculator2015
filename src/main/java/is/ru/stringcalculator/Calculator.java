package is.ru.stringcalculator;

public class Calculator {

	public static int add(String numbers){
		if(numbers.equals("")){
			return 0;
		}
		return sum(extractNumbers(numbers));
	}

	public static String[] extractNumbers(String numbers){
		String newlist = numbers.replace('\n', ',');
		return newlist.split(",");
	}

	public static int sum(String[] numbers){
		int sum = 0;
		for(String number : numbers){
			sum += Integer.parseInt(number);
		}
		return sum;
	}

}