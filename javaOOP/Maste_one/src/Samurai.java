
public class Samurai extends Human {
		static int numofSamurai=0;
		public Samurai(String name) {
	 	this.health = 200 ; 
	 	numofSamurai++;
		}
		
		
		
		public void deathBlow(Human human) {
				this.setHealth(this.getHealth()/2);
				human.setHealth(human.getHealth()*0);
		}
		
		public  void meditate() {
			this.setHealth(this.getHealth()+(this.getHealth()/2));
			
		}
		
		
		public int  howMany() {
			System.out.print(numofSamurai);
			return numofSamurai ;
		}
}



