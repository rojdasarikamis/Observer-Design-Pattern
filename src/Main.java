
import follower.FootballFollower;
import model.News;
import newsManagement.FootballNews;
import newsManagement.sportNews;



public class Main {
	
	
	// @Author ROJDA SARÝKAMIÞ

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sportNews footballnews = new FootballNews();
		footballnews.subscribe(new FootballFollower("ROJDA"));
		footballnews.subscribe(new FootballFollower("EYUP"));
		
		footballnews.addNewNews(new News(" BITCOIN  ", 
				" Bitcoin news's comment"));
		
		footballnews.subscribe(new FootballFollower("IÞIL"));
		footballnews.subscribe(new FootballFollower("ONUR"));
		
		footballnews.addNewNews(new News("CIFTLIKBANK", 
				"Ciftlikbank new's comment"));
		
		footballnews.subscribe(new FootballFollower("BARAN"));
		
		
		
		}

}
