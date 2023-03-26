import java.util.ArrayList;
import java.util.Random;

public class Task02 {
    public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<Integer>();
    Random rand = new Random();
    for (int i = 0; i < 5; i++) {
        int count = rand.nextInt(10);
        arr.add(count);
    
}
  System.out.println(arr.toString());
  int max = arr.get(0);
  int min = arr.get(0);
  float arithmeticmean = 0;
  for (int i = 0; i < arr.size(); i++) {
    if (arr.get(i) > max) {
        max = arr.get(i);
}
if (arr.get(i) < min) {
    min = arr.get(i);
}
arithmeticmean += arr.get(i);
  }
  System.out.println(max);
  System.out.println(min);
  System.out.println(arithmeticmean / arr.size());

}
}
