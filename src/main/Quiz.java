package main;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Quiz {
	Scanner scan = new Scanner(System.in);
	public int answer; //解答
	public int count = 0;
	public int score = 0;
	public int mis = 0;

	//問題１
	public int quiz1() {
		do {
			System.out.println("-----第１問-----");
			System.out.println("整数を格納する型は？");
			System.out.println("\n1: int 2: String 3: double 4: char");
			System.out.print("\n\n正解を入力＞");
			try {
				this.answer = scan.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("数値を入力してね！");
				count++;
			}
			if(answer==1) {
				System.out.println("\n正解！");
				score ++;
			}else if(answer==2) {
				System.out.println("\n不正解！");
				System.out.println("Stringは文字列を格納する型です。");
				System.out.println("正解は1の int です。");
				mis ++;
			}else if(answer==3) {
				System.out.println("\n不正解！");
				System.out.println("doubleは少数を格納する型です。");
				System.out.println("正解は1の int です。");
				mis ++;
			}else if(answer==4) {
				System.out.println("\n不正解！");
				System.out.println("charは1つの文字を格納する型です。");
				System.out.println("正解は1の int です。");
				mis ++;
			}
		}while (!isNumber(answer));
		System.out.println("--------------");
		scan.nextLine();
		return this.answer;
	}
	private boolean isNumber(int answer) {
		//3回以上間違えたら強制的に間違いの解答になる
		if(count < 3) {
			if(!(answer == 1 || answer == 2 || answer == 3 || answer == 4)) {
				System.out.println("1〜4の数字を選んでください。");
				count++;
				return false;
			}
			return true;
		}else {
			this.answer = 4;
			mis ++;
			return true;
		}
	}
	//問題２
	public int quiz2() {
		do {
			System.out.println("\n-----第2問-----");
			System.out.println("文法として正しいものはどれ？");
			System.out.println("\n1:double d = true");
			System.out.println("2:String s = 2 +\"人目\" ");
			System.out.println("3:int x = 3 + 5.0 ");
			System.out.println("4:int number = \"5\"; ");
			System.out.print("\n正解を入力＞");
			try {
				this.answer = scan.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("数値を入力してね！");
				count++;
			}
			if(answer==2) {
				System.out.println("\n正解！");
				score ++;
			}else if(answer==1) {
				System.out.println("\n不正解！");
				System.out.println("右辺はboolean型のため、型が異なるdouble型にできません。");
				System.out.println("正解は2です。");
				mis ++;
			}else if(answer==3) {
				System.out.println("\n不正解！");
				System.out.println("右辺を評価する際、double型に揃えるためint型の変数には入りきれません。");
				System.out.println("正解は2です。");
				mis ++;
			}else if(answer==4) {
				System.out.println("\n不正解！");
				System.out.println("右辺はString型なので、型が異なるint型に代入できません。");
				System.out.println("正解は2です。");
				mis ++;
			}
		}while (!isNumber2(answer));
		System.out.println("--------------");
		scan.nextLine();
		return this.answer;
	}
	private boolean isNumber2(int answer) {
		//3回以上間違えたら強制的に間違いの解答になる
		if(count < 3) {
			if(!(answer == 1 || answer == 2 || answer == 3 || answer == 4)) {
				System.out.println("1〜4の数字を選んでください。");
				count++;
				return false;
			}
			return true;
		}else {
			this.answer = 4;
			mis ++;
			return true;
		}
	}
	//問題３
	public int quiz3() {
		do {
			System.out.println("\n-----第3問-----");
			System.out.println("条件式として適切ものはどれ？");
			System.out.println("\n1:cost = 300 * 1.05");
			System.out.println("\n2:893");
			System.out.println("\n3:b + 5 < 20");
			System.out.println("\n4:isNumeric = true");
			System.out.print("\n\n正解を入力＞");
			try {
				this.answer = scan.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("数値を入力してね！");
				count++;
			}
			if(answer==3) {
				System.out.println("\n正解！");
				score ++;
			}else if(answer==1) {
				System.out.println("\n不正解！");
				System.out.println("評価結果がbooleanにならないため、条件式として利用するとコンパイルエラーになります。");
				System.out.println("正解は3です。");
				mis ++;
			}else if(answer==2) {
				System.out.println("\n不正解！");
				System.out.println("評価結果がbooleanにならないため、条件式として利用するとコンパイルエラーになります。");
				System.out.println("正解は3です。");
				mis ++;
			}else if(answer==4) {
				System.out.println("\n不正解！");
				System.out.println("これは代入を行う式です。コンパイルエラーにはなりませんが、意図しない不具合を"
						+ "招きやすいため一部例外を除いて避けるべきとされています。");
				System.out.println("正解は3です。");
				mis ++;
			}
		}while (!isNumber3(answer));
		System.out.println("--------------");
		scan.nextLine();
		return this.answer;
	}
	private boolean isNumber3(int answer) {
		//3回以上間違えたら強制的に間違いの解答になる
		if(count < 3) {
			if(!(answer == 1 || answer == 2 || answer == 3 || answer == 4)) {
				System.out.println("1〜4の数字を選んでください。");
				count++;
				return false;
			}
			return true;
		}else {
			this.answer = 4;
			mis ++;
			return true;
		}
	}
	//問題４
	public int quiz4() {
		do {
			System.out.println("\n-----第4問-----");
			System.out.println("クラスを元に作られるオブジェクトのことを何と言うでしょうか？");
			System.out.println("\n1: インスタンス 2: コンストラクタ 3:インタフェース 4: メソッド");
			System.out.print("\n\n正解を入力＞");
			try {
				this.answer = scan.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("数値を入力してね！");
				count++;
			}
			if(answer==1) {
				System.out.println("\n正解！");
				score ++;
			}else if(answer==2) {
				System.out.println("\n不正解！");
				System.out.println("コンストラクタはインスタンス生成時に実行されるメソッドです。");
				System.out.println("正解は1のインスタンスです。");
				mis ++;
			}else if(answer==3) {
				System.out.println("\n不正解！");
				System.out.println("インターフェースとは、クラスに含まれるメソッドの具体的な処理内容を記述せず、"
						+ "変数とメソッドの型のみを定義したものです。");
				System.out.println("正解は1のインスタンスです。");
				mis ++;
			}else if(answer==4) {
				System.out.println("\n不正解！");
				System.out.println("メソッドとは、いくつかの処理をひとまとめにしたものです。");
				System.out.println("正解は1のインスタンスです。");
				mis ++;
			}
		}while (!isNumber4(answer));
		System.out.println("--------------");
		scan.nextLine();
		return this.answer;
	}
	private boolean isNumber4(int answer) {
		//3回以上間違えたら強制的に間違いの解答になる
		if(count < 3) {
			if(!(answer == 1 || answer == 2 || answer == 3 || answer == 4)) {
				System.out.println("1〜4の数字を選んでください。");
				count++;
				return false;
			}
			return true;
		}else {
			this.answer = 4;
			mis ++;
			return true;
		}
	}
	//問題５
	public int quiz5() {
		do {
			System.out.println("\n-----第5問-----");
			System.out.println("文字列sで終わるか調べるメソッドの定義で正しいものはどれ？");
			System.out.println("\n1:public int lastIndexOf(String s)");
			System.out.println("2:public boolean contains(String s)");
			System.out.println("3:public int indexOf(String s)");
			System.out.println("4:public boolean endsWith(String s)");
			System.out.print("\n\n正解を入力＞");
			try {
				this.answer = scan.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("数値を入力してね！");
				count++;
			}
			if(answer==4) {
				System.out.println("\n正解！");
				score ++;
			}else if(answer==2) {
				System.out.println("\n不正解！");
				System.out.println("public boolean contains(String s) は一部に文字列sを含むか調べるメソッドです");
				System.out.println("正解は4です。");
				mis ++;
			}else if(answer==3) {
				System.out.println("\n不正解！");
				System.out.println("public int indexOf(String s) は文字sが最初に登場する位置を調べるメソッドです。");
				System.out.println("正解は4です。");
				mis ++;
			}else if(answer==1) {
				System.out.println("\n不正解！");
				System.out.println("public int lastIndexOf(String s) は文字sを後ろから検索して最初に登場する位置を調べるメソッドです。");
				System.out.println("正解は4です。");
				mis ++;
			}
		}while (!isNumber5(answer));
		System.out.println("--------------");
		scan.nextLine();
		return this.answer;
	}
	private boolean isNumber5(int answer) {
		//3回以上間違えたら強制的に間違いの解答になる
		if(count < 3) {
			if(!(answer == 1 || answer == 2 || answer == 3 || answer == 4)) {
				System.out.println("1〜4の数字を選んでください。");
				count++;
				return false;
			}
			return true;
		}else {
			this.answer = 4;
			mis ++;
			return true;
		}
	}

	//score
	public int correctScore() {
		System.out.println("\n-----結果-----");
		System.out.println("\n5問中" + score + "問正解です。" );
		System.out.println("\n-------------");
		return score;
	}

	//問題をまとめる
		public void quizSummary() {
			quiz1();
			System.out.println("\n■Enterキーを押して次の問題へ  →");
			scan.nextLine();
			quiz2();
			System.out.println("\n■Enterキーを押して次の問題へ  →");
			scan.nextLine();
			quiz3();
			System.out.println("\n■Enterキーを押して次の問題へ  →");
			scan.nextLine();
			quiz4();
			System.out.println("\n■Enterキーを押して次の問題へ  →");
			scan.nextLine();
			quiz5();
			System.out.println("\n■Enterキーを押して結果画面へ  →");
			scan.nextLine();
			correctScore();
		}
}
