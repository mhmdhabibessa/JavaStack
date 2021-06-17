public class Pythagorean {
    public double calculateHypotenuse(int legA, int legB) {
        double c = (legA*legA + legB*legB);
        double  c_prime = Math.sqrt(c);
        System.out.println(c_prime);
        return c_prime;

    }
}
