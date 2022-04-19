import java.util.Scanner;
public class scan {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("1000 이하의 자연수를 입력하세요.: ");
		int num1 = scan.nextInt();
		int sum = 0;
		for(int i=1; i<=num1; i++) {
			if(i%4==0) {
				System.out.print(i);
				sum+=1;
			}
		}
		System.out.print("1~" + num1 + "4의 배수의 합은 " + sum + "입니다.");
	}
}
