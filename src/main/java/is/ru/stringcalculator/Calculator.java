package is.ru.stringcalculator;

public class Calculator {

	public static int add(String numbers){
		if(numbers.equals("")){
			return 0;
		}
		if(numbers.startsWith("//")){
			char delimiter = numbers.charAt(2);
			numbers = numbers.substring(4);
			return sum(extractNumbers(numbers, delimiter));
		}
		return sum(extractNumbers(numbers));
	}

	public static String[] extractNumbers(String numbers){
		numbers = numbers.replace('\n', ',');
		return numbers.split(",");
	}

	public static String[] extractNumbers(String numbers, char delimiter){
		String del = Character.toString(delimiter);
		return numbers.split(del);
	}

	public static int sum(String[] numbers){
		int sum = 0;
		for(String number : numbers){
			sum += Integer.parseInt(number);
		}
		return sum;
	}

}