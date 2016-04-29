import java.util.ArrayList;
public class Word {
  private String mDescription;
  private boolean mCompleted;
  private static ArrayList<Word> mInstances = new ArrayList<Word>();






  public Word(String description) {
    mDescription = description;
    mCompleted = false;
    mInstances.add(this);

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
}
