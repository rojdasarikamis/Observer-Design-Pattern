package follower;

import newsManagement.sportNews;

public class FootballFollower implements Follower {

	private String mname;
	public FootballFollower(String name) {
	
		this.mname = name;
		// TODO Auto-generated constructor stub
		
		
	}

	@Override
	public void update(sportNews sportNews) {
		// TODO Auto-generated method stub
	
		
		System.out.println(String.format("The %s title news gone %s in followers.",
				sportNews.getNew().getTitle(),
				this.mname
			
			
				
				
				));
		
	}

	
	
	
}
