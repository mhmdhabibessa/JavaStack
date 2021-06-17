
public class Ninja extends Human {
		
	public Ninja(String name) {
		this.stealth=10;
		
	}
	
	public void steal(Human human) {
		
		human.setHealth(human.getHealth()-stealth);
		
		System.out.println(human.getName()+"the stelth"+ stealth );		
	}
	public void runAway() {
		this.setHealth(this.health-10 );
	}

	
	
}
