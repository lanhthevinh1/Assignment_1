package entity;

public class News implements INews{
	private int id;
	private String title;
	private String publishDate;
	private String author;
	private String content;
	private float averageRate;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPublistDate() {
		return publishDate;
	}
	public void setPublistDate(String publishDate) {
		this.publishDate = publishDate;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public float getAverrageRate() {
		return averageRate;
	}
	
	public void Display() {
		System.out.println("Title: "+ title);
		System.out.println("PublistDate: "+ publishDate);
		System.out.println("Author: "+ author);
		System.out.println("Content: " + content);
		System.out.println("AverageRate: "+averageRate);
	}
	public float Calculate(int[] rates) {
		float sum = 0;
		for(int rate:rates) {
			sum+=rate;
		}
		this.averageRate = sum/3;
		return averageRate;
	}
	
}
