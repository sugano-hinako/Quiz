package main;

import java.util.Scanner;

public class StartEnd {

	Scanner scan = new Scanner(System.in);

	public void start() {
		System.out.println("Javaのもんだい");
		System.out.println("※Enterキーを押してスタート");
		scan.nextLine();
	}

	public void end() {
		System.out.println("お疲れ様でした。");
		scan.nextLine();
	}

}
