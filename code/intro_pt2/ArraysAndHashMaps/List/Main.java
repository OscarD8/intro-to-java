package intro_pt2.ArraysAndHashMaps.List;

public class Main
{
    public static void main(String[] args) {
        ListAttempt<String> myList = new ListAttempt<>();
        System.out.println(myList.contains("hello"));
        myList.add("hello");
        System.out.println(myList.contains("hello"));
        int index = myList.indexOf("hello");
        System.out.println(index);
        System.out.println(myList.value(index));
        myList.remove("hello");
        System.out.println(myList.contains("hello"));
    }
}
