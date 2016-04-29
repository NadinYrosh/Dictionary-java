import java.util.ArrayList;
public class Word {
  private String mDescription;
  private boolean mCompleted;
  private static ArrayList<Word> mInstances = new ArrayList<Word>();
  private int mId;




  public Word(String description) {
    mDescription = description;
    mCompleted = false;
    mInstances.add(this);
    mId = mInstances.size();


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
}
