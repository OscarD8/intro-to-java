package intro_pt2.Interfaces.ImplementingInterfaces;

import java.util.*;

public class mainProgram
{
    public static void main(String[] args) {
        Map<String, String> names = new HashMap<>();
        names.put("Bean", "ham");

        System.out.println(returnSize(names));
        Collection<String> values = names.values();
        System.out.println(values.getClass().getName());
        System.out.println(names.getClass().getName());
    }

    public static int returnSize(List<String> list) {
        return list.size();
    }

    public static int returnSize(Map object) {
        return object.size();
    }

    public static int returnSize(Set set) {
        return set.size();
    }
}
