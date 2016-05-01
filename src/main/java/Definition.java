import java.util.ArrayList;

public class Definition {
  private String mDefinition;
  private static ArrayList<Definition> instances = new ArrayList<Definition>();
  private int mId;
  private boolean mCompleted;
  // private ArrayList<Word> mWord;


  public Definition(String definition) {
    mDefinition = definition;
    instances.add(this);
    mId = instances.size();
    // mWord = new ArrayList<Word>();
  }

  public String getDefinition() {
    return mDefinition;
  }

  public boolean isCompleted() {
    return mCompleted;
  }

  public static ArrayList<Definition> all() {
    return instances;
  }
  //
  public static void clear() {
    instances.clear();
  }
  //
  public int getId() {
    return mId;
  }

  public static Definition find(int id){
    try{
      return instances.get(id-1);
    }catch (IndexOutOfBoundsException e) {
      return null;
    }
  }
}
