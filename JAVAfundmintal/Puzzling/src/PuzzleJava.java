import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
public class PuzzleJava {
    public static void main() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        //3,5,1,2,7,9,8,13,25,32
        numbers.add(3);
        numbers.add(5);
        numbers.add(1); 	
        numbers.add(2);
        numbers.add(7);
        numbers.add(9);
        numbers.add(8);
        numbers.add(13);
        numbers.add(32);
        numbers.add(25);

        Collections.shuffle(numbers);
        System.out.println(numbers); // [1, 5, 2, 4, 3]
        Collections.sort(numbers);
        System.out.println(numbers); // [1, 2, 3, 4, 5]
                
        Random r = new Random();
        System.out.println(r.nextInt()); // without bounds
        System.out.println(r.nextInt(5)); // with bounds 0 to 5
    }
}