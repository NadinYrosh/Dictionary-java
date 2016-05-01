import java.util.ArrayList;

public class Definition {
  private String mDefinition;
  private static ArrayList<Definition> allDefinitions = new ArrayList<Definition>();
  private int mId;
  private boolean mCompleted;
  // private ArrayList<Word> mWord;


  public Definition(String definition) {
    mDefinition = definition;
    allDefinitions.add(this);
    mId = allDefinitions.size();
    // mWord = new ArrayList<Word>();
  }

  public String getDefinition() {
    return mDefinition;
  }

  public boolean isCompleted() {
    return mCompleted;
  }

  public static ArrayList<Definition> all() {
    return allDefinitions;
  }
  //
  public static void clear() {
    allDefinitions.clear();
  }
  //
  public int getId() {
    return mId;
  }

  public static Definition find(int id){
    try{
      return allDefinitions.get(id-1);
    }catch (IndexOutOfBoundsException e) {
      return null;
    }
  }
}
