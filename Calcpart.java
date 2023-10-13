package practicesession;

public class Calcpart {

	public static void main(String[] args) {

		One one = new One();
		one.setValue1(10);
		one.setValue2(20);
		one.setValue3(600);
		one.setValue4(48);

		Logic logic = new Logic();
		double percentage = logic.percentage(one);
		System.out.println("percentage" + percentage);
		
		 int add=logic.add(one);
		 System.out.println("addition is "+add);
		 
		 int subtract=logic.subtract(one);
		 System.out.println("subtract is "+subtract);
		 
		 int multiply=logic.multiply(one);
		 System.out.println("multiply is "+multiply);
		 
		 int divide=logic.divide(one);
		 System.out.println("division is "+divide);
		 
		 
	}

}

class Logic {

	int add(One one) {
		int add = one.getValue1() + one.getValue2();
		return add;
	}

	int subtract(One one) {
		int subtract = one.getValue1() - one.getValue2();
		return subtract;
	}

	int multiply(One one) {
		int multiply = one.getValue1() * one.getValue2();
		return multiply;
	}

	int divide(One one) {
		int divide = one.getValue1() / one.getValue2();
		return divide;
	}

	double percentage(One one) {
		double percentage = one.getValue3() * one.getValue4() / 100;
		return percentage;
	}
}

class One {

	int value1;
	int value2;
	int value3;
	double value4;

	public int getValue1() {
		return value1;
	}

	public void setValue1(int value1) {
		this.value1 = value1;
	}

	public int getValue2() {
		return value2;
	}

	public void setValue2(int value2) {
		this.value2 = value2;
	}

	public int getValue3() {
		return value3;
	}

	public void setValue3(int value3) {
		this.value3 = value3;
	}

	public double getValue4() {
		return value4;
	}

	public void setValue4(double value4) {
		this.value4 = value4;
	}
}
