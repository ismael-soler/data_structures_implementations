import java.util.*;

public class checkRepeatedChars {
    private Set<Character> set;
    private String str;

    public checkRepeatedChars(String str) {
        this.str = str;
        this.set = settify(str);
    }

    public Set<Character> settify(String str){
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) set.add(str.charAt(i));
        return set;
    }

    public Boolean allUnique(){
        return this.str.length() == this.set.size();
    }

    public static void main(String[] args) {
        checkRepeatedChars checker = new checkRepeatedChars(new Scanner(System.in).nextLine());
        System.out.println(checker.allUnique());
    }
}

class Secondary {
    public static void main(String[] args) {
        checkRepeatedChars checker = new checkRepeatedChars("aa");
        System.out.println(checker.allUnique());
    }
}
