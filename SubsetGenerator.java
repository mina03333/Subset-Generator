import java.util.ArrayList;

public class SubsetGenerator {

  private String str;

  public SubsetGenerator(String str) {
    this.str = str;
  }

  public ArrayList<String> getSubsets() {
    ArrayList<String> subsets = new ArrayList<String>();
    if(str.length()==0){
      subsets.add(str);
      return subsets;
    }

    for(int i=0; i<str.length(); i++){
      for(int j=i; j<str.length(); j++){
        SubsetGenerator gen = new SubsetGenerator(str.substring(j+1));
        ArrayList<String> otherSet = gen.getSubsets();
        for(String s : otherSet){
          subsets.add(str.substring(i, j+1) + s);
        }
        if(i==str.length() - 1 && j == str.length()-1){
          subsets.add("");
        }

      }
    }

    for(int i =0; i<subsets.size()-1; i++){
      for(int j=i+1; j<subsets.size(); j++){
        if(subsets.get(i).equals(subsets.get(j))) subsets.remove(j);
      }
    }
    return subsets;
  }
 
}
