import java.util.Scanner;

public class CircleExam {
	public static void main(String args[]) {
		 Scanner scan = new Scanner(System.in);
		 System.out.print("������ �� >>");
		 int radius = scan.nextInt();
		 Circle c = new Circle(radius);
		 System.out.println("������ "+ radius + "�� ���� ���̴� " + c.Area() + "�̴�.");
	}
}

class Circle{
	int radius;
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public double Area() {   
		return radius*radius*3.14;
	}
}