package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AgainOrEnd {
	Quiz qu = new Quiz();
	StartEnd se = new StartEnd();
	Scanner scan = new Scanner(System.in);
	int select;
	int count = 0;

	public void againOrEnd() {

		do {
			System.out.println("\nもう一度挑戦しますか？");
			System.out.println("\n1: 終了する  2:もう一度");

			try {
				this.select = scan.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("数字を入力してください。");
			}

			if(select == 2) {
				qu.quizSummary();
				scan.nextLine();
				se.end();
			}else if(select == 1) {
				scan.nextLine();
				se.end();
				break;
			}
		}while(!isNumber(select));
	}

	private boolean isNumber(int answer) {
		if(count < 3) {
			if(select == 1 || select == 2) {
				System.out.println("1: 終了する か 2:もう一度 を選んでください。");
				count++;
				return false;
			}
			return true;
		}else {
			this.select = 2;
			return true;
		}
	}

}
