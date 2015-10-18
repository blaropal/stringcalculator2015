package is.ru.stringcalculator;

public class Calculator {

	public static int add(String numbers) throws IllegalArgumentException{
		if(numbers.equals("")){
			return 0;
		}
		if(numbers.startsWith("//")){
			char delimiter = numbers.charAt(2);
			numbers = numbers.substring(4);
			return sum(extractNumbers(numbers, delimiter));
		}
		if(numbers.contains("-")){
			throw new IllegalArgumentException(exceptionMessage(extractNumbers(numbers, ',')));
		}
		return sum(extractNumbers(numbers, ','));
	}

	public static String[] extractNumbers(String numbers, char delimiter){
		numbers = numbers.replace('\n', ',');
		String deli = Character.toString(delimiter);
		return numbers.split(deli);
	}

	public static int sum(String[] numbers){
		int sum = 0;
		for(String number : numbers){
			sum += Integer.parseInt(number);
		}
		return sum;
	}

	public static String exceptionMessage(String[] numbers){
		String message = "";
		int counter = 0;
		message = "Negatives not allowed: ";
		for(String number: numbers){
			if(number.startsWith("-")){
				if(counter == 0){
					message = message + number;
				}else{
					message = message + "," + number;
				}
			}
		}
		return message;
	}

}