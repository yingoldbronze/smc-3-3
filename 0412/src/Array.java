import java.util.Scanner;
public class Array {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[5];
		int max = 0;
		int j = 0;
		
		for(int i=0; i<arr.length; i++) {
			System.out.println((i+1)+"�� �Է�:");
			arr[i] = scan.nextInt();
		}
		for(int i=0; i<arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
				j = i+1;
			}
		}
		System.out.println("���� ū ���� " + j + "��° ������ " + max);
	}

}

