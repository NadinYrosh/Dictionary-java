import java.util.ArrayList;

public class Word {
  private String mWord;
  private static ArrayList<Word> mInstances = new ArrayList<Word>();
  private int mId;
  // private ArrayList<Word> mWord;
  private ArrayList<Definition> mDefinitions;
  private boolean mCompleted;


  public Word(String word) {
    mWord = word;
    mInstances.add(this);
    mId = mInstances.size();
    mDefinitions = new ArrayList<Definition>();
    mCompleted = false;
    ;
  }

  public String getWord() {
    return mWord;
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

  public ArrayList<Definition> getDefinitions(){
    return mDefinitions;
  }

  public void addDefinition(Definition definition) {
    mDefinitions.add(definition);
  }
}
