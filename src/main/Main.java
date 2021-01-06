package main;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		StartEnd se = new StartEnd();
		Quiz qu = new Quiz();
		AgainOrEnd ae = new AgainOrEnd();

		//テスト
		se.start();
		qu.quizSummary();
		ae.againOrEnd();

	}

}
