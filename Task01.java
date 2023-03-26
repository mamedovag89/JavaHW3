import java.util.ArrayList;
import java.util.Random;

/**
 * Task01
 */
public class Task01 {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            int count = rand.nextInt(10);
            arr.add(count);
        
    }

    System.out.println(arr.toString());
    for (int i = 0; i < arr.size(); i++) {
        if (arr.get(i) % 2 == 0) {
            arr.remove(i);
            i--;
}
    }
    System.out.println(arr.toString());

}
}
