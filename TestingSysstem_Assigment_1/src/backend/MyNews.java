package backend;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entity.News;

public class MyNews {
	
	List<News> listNews = new ArrayList<News>();
//	News news = new News();
	public void insertNews() {
		News news = new News();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào title: ");
		String title = sc.nextLine();
		news.setTitle(title);
		
		System.out.println("PublishDate: ");
		String publishDate = sc.nextLine();
		news.setPublistDate(publishDate);
		
		System.out.println("Author: ");
		String author = sc.nextLine();
		news.setAuthor(author);
		
		System.out.println("Content: ");
		String content = sc.nextLine();
		news.setContent(content);
		
		System.out.println("Nhập 3 điếm Rate: ");
		int[] rates = new int[3];
		for(int i = 0;i < rates.length;i++) {
			System.out.println("Nhập rate thứ "+(i+1)+":");
			rates[i] = Integer.parseInt(sc.nextLine());
		}
		news.Calculate(rates);
		
		listNews.add(news);
	}
	public void viewListNews() {
		for(News news:listNews) {
			news.Display();
		}
	}
	public void AverageRate() {
		for(News news:listNews) {
			System.out.println("AverageRate: " +news.getAverrageRate());
		}
	}
	
	
}
