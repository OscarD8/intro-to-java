package intro_pt2.ClassDiagrams.SaveablePerson;

public interface Saveable
{
    void save();
    void delete();
    void load(String address);
}
