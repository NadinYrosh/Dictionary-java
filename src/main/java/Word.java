import java.util.ArrayList;

public class Word {
  private String mDescription;
  private boolean mCompleted;
  private static ArrayList<Word> mInstances = new ArrayList<Word>();
  private int mId;
  private ArrayList<Word> mWord;
  private ArrayList<Definition> mDescriptions;


  public Word(String description) {
    mDescription = description;
    mCompleted = false;
    mInstances.add(this);
    mId = mInstances.size();
    mWord = new ArrayList<Word>();
    mDescriptions = new ArrayList<Definition>();
  }

  public String getDescription() {
    return mDescription;
  }

  public boolean isCompleted() {
    return mCompleted;
  }

  public static ArrayList<Word> all() {
    return mInstances;
  }

  public static void clear() {
    mInstances.clear();
  }

  public int getId() {
    return mId;
  }

  public static Word find(int id) {
    try{
      return mInstances.get(id-1);
    } catch(IndexOutOfBoundsException e) {
      return null;
    }
  }

  public ArrayList<Definition> getDefinition() {
    return mDescriptions;
  }

  public void addDefinition(Definition description) {
    mDescriptions.add(description);
  }
}
