package study;

import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) {
    	Person Artem = new Person(": Artem",  16, ": 10-Cheredovaya 9",": 65-54-98");
    	Artem.printName();
    	Artem.printAge();
    	Artem.printPhone();
    	double result = sqrt(16);
    	System.out.println("Age you brother = "+ result);
    }
}
