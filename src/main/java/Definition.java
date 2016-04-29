import java.util.ArrayList;

public class Definition {
  private String mDescription;
  private boolean mCompleted;
  private int mId;
  private ArrayList<Word> mWord;
  private static ArrayList<Definition> instances = new ArrayList<Definition>();


  public Definition(String description) {
    mDescription = description;
    instances.add(this);
    mId = instances.size();
    mWord = new ArrayList<Word>();
  }

  public String getDescription() {
    return mDescription;
  }

  public boolean isCompleted() {
    return mCompleted;
  }

  public static ArrayList<Definition> all() {
    return instances;
  }

  public static void clear() {
    instances.clear();
  }

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
