import java.util.Scanner;
public class scan {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("1000 ������ �ڿ����� �Է��ϼ���.: ");
		int num1 = scan.nextInt();
		int sum = 0;
		for(int i=1; i<=num1; i++) {
			if(i%4==0) {
				System.out.print(i);
				sum+=1;
			}
		}
		System.out.print("1~" + num1 + "4�� ����� ���� " + sum + "�Դϴ�.");
	}
}
