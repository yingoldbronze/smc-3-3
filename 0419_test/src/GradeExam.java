import java.util.Scanner;

public class GradeExam {
	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.print("����, ����, ���� ������ 3���� ���� �Է�>>");
			Grade me = new Grade();
			me.math = scan.nextInt();
			me.science = scan.nextInt();
			me.english = scan.nextInt();
			System.out.print("����� " + me.average());
	}
}
class Grade{
	int math;
	int science;
	int english;
	public int average() {
		return (math+science+english)/3;
	}
}