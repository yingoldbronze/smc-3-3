import java.util.Scanner;

public class Number {
	public static void main(String[] args) {
        System.out.print("10���� ���� ���� �� �ϳ��� ���纸����(1~50����): ");
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        int []arr=new int[10];
        int diff = 0;
        for(int i=0; i<10; i++) {
            arr[i] = (int)(Math.random()*50+1);
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=0; i<10; i++) {
        	if(arr[i] == num) {
        		System.out.println("��÷!��ġ�ϴ� ���ڰ� �ֽ��ϴ�");
        		diff=1;
        	}
        }
        if(diff==0) System.out.println("��!������ȸ��~");
	}
}


