package model;

public class News {

	private String title;
	private String comment;
	
	
	public News(String mtitle, String mcomment) {
		// TODO Auto-generated constructor stub
		
		this.title=mtitle;
		this.comment=mcomment;
		
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	
	
}
