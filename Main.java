import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

/**
   This program tests the subset generator. Your SubsetGenerator class must adhere to this interface.
*/
public class Main {
   public static void main(String[] args) {
      SubsetGenerator generator = new SubsetGenerator("run");
      List<String> subsets = generator.getSubsets();
      // Sort the result for checking 
      Collections.sort(subsets);
      System.out.println("Your ans: " + subsets);
      System.out.println("Expected: [, n, r, rn, ru, run, u, un]");
   }
}
