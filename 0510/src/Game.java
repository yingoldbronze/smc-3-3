import java.util.Scanner;
public class Game {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = (int)(Math.random()*3);
		String a = scan.next();
		if(i == 0) System.out.println("����");
		else if(i == 1) System.out.println("����");
		else if(i == 2) System.out.println("��");
		
		if(a.equals("����")) {
			if(i == 0) System.out.println("����");
			else if(i == 1) System.out.println("����");
			else if(i == 2) System.out.println("�̰��");
		}
		if(a.equals("����")) {
			if(i == 0) System.out.println("�̰��");
			else if(i == 1) System.out.println("����");
			else if(i == 2) System.out.println("����");
		}
		if(a.equals("��")) {
			if(i == 0) System.out.println("����");
			else if(i == 1) System.out.println("�̰��");
			else if(i == 2) System.out.println("����");
		}

	}
}