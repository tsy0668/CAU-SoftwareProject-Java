package lab05;
import java.util.Scanner;
public class Calc {

	public static void main(String[] args) {
		
		int a = 0;
		int b = 0;
		String op = "";

		System.out.println("두 정수와 연산자를 입력하시오 >> ");

		Scanner scanner = new Scanner(System.in);
		
		a = scanner.nextInt();
		op = scanner.next();
		b = scanner.nextInt();
		
		switch(op){
		case "+" :
			Add pl = new Add();
			pl.setValue(a, b);
			System.out.println(pl.calculate()); 
			break;
		case "-" :
			Sub su = new Sub();
			su.setValue(a, b);
			System.out.println(su.calculate());
			break;
		case "*" :
			Mul mu = new Mul();
			mu.setValue(a, b);
			System.out.println(mu.calculate());
			break;
		case "/" :
			Div di = new Div();
			di.setValue(a, b);
			System.out.println(di.calculate());
			break;
		}
	}

}

class Add{
	int a;
	int b;
	
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	int calculate() {
		return a + b;
	}
}

class Sub{
	int a;
	int b;
	
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	int calculate() {
		return a - b;
	}
}

class Mul{
	int a;
	int b;
	
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	int calculate() {
		return a * b;
	}
}

class Div{
	int a;
	int b;
	
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	int calculate() {
		return a / b;
	}
}
