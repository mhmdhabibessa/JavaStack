
public class HumanTest {

	public static void main(String[] args) {
		
		Human mhmad = new Human("mhmad");
		Human amro = new Human("amro");
		System.out.println("Health amro  "+ amro.getHealth());
		mhmad.attack(amro);
		System.out.println("Health amro  "+ amro.getHealth());
		
		
		Wizard wz = new Wizard("amin");
		System.out.println("Health amro  "+ mhmad.getHealth());

		wz.heal(mhmad);
		System.out.println("Health amro  "+ mhmad.getHealth());
		
		
		wz.fireball(mhmad);
		
		System.out.println("Health amin  "+ mhmad.getHealth());		
		Ninja nj= new Ninja("amin");
		
		System.out.println("Health amin "+mhmad.getHealth());

		nj.steal(mhmad);
		System.out.println("Health amin "+mhmad.getHealth());
		
		System.out.println(nj.getHealth());

		nj.runAway();
		System.out.println(nj.getHealth());
		
		
		Samurai Su = new Samurai("Anas");
		Samurai Sumori = new Samurai("sumori");

		System.out.println(Su.getHealth());
		System.out.println(mhmad.getHealth());

		Su.deathBlow(mhmad);
		System.out.println(Su.getHealth());
		System.out.println(mhmad.getHealth());
		
		
		Su.meditate();
		System.out.println(Su.getHealth());
		
		Su.howMany();
		
		
	}
	

}
