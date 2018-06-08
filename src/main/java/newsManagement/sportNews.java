package newsManagement;
import follower.Follower;
import model.News;

import java.util.ArrayList;
import java.util.List;




public abstract class sportNews {

	private List<Follower> followers;
	private List<News> news;
	private News mnew;
	
	{
		followers = new ArrayList<Follower>();
		news = new ArrayList<News>();
	}
	
	
	public void subscribe(Follower follower) {
	
		followers.add(follower);
		
	}
	public void unsubscribe(Follower follower) {
		
		followers.remove(follower);
		
	}
	public void notifyChanges() {
		
		for(Follower follower : followers) {
			follower.update(this);
		}
		
	}
	public void addNewNews(News newss) {
		// TODO Auto-generated method stub
		news.add(newss);
		this.mnew = newss;
		notifyChanges();
	}
	
	public News getNew() {
		return mnew;
	}
	
	
	
}
