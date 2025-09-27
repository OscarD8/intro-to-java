package intro_pt2.RegularExpressions;

public class VowelCheck
{
    public static void main(String[] args) {
        VowelCheck vowelCheck = new VowelCheck();
        System.out.println(vowelCheck.allVowels("oi"));
        System.out.println(vowelCheck.allVowels("queue"));
    }

    public boolean allVowels(String string) {
        return string.matches("[aeiou]+");
    }
}
