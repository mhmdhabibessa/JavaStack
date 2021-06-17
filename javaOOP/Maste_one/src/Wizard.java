
public class Wizard extends Human {
	
		public Wizard(String name) {
			this.health= 50 ;
			this.intelligence= 8 ;
			this.name = name ; 
		}
		
		public void heal(Human human) {
			human.setHealth(human.getHealth()+this.intelligence);
			System.out.println("("+human.getName()+"had their health increased" + this.intelligence+".)" );
			
		}
		
		public void fireball(Human human) {
			
			human.setHealth(human.getHealth()-(this.intelligence*3));
				System.out.println("oooooh!");
				System.out.println("("+ human.getName()+ "now  damaged"+ this.intelligence*3+ ")");
				
		}
		
	
	
}

