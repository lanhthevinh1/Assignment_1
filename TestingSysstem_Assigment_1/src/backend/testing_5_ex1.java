package backend;

import java.util.Scanner;

public class testing_5_ex1 {
	public static void main(String[] args) {
		Question1();
	}
	public static void Question1() {
		Scanner sc = new Scanner(System.in);
		int key = -1;
		MyNews  myNews = new MyNews();
		while(true) {
			System.out.println("0. Insert news"+"\n"+"1. View list news"+"\n"+"2.Averrage rate"+"\n"+"3.Exit");
			key = Integer.parseInt(sc.nextLine());
			switch (key) {
			case 0:
				myNews.insertNews();
				break;
			case 1:
				myNews.viewListNews();
				break;
			case 2:
				myNews.AverageRate();
				break;
			default:
				System.out.println("OUT!");
				return;
			}
		}
	}
}
