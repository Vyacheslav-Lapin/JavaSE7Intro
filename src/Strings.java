import java.util.Objects;

public class Strings {
    public static void main(String[] args) {
        String s = "Мама мыла раму";
        String s1 = new String("Мама мыла раму");
        System.out.println(s.equals(s1)); //true
        s1 = s1.intern();
        s = s.intern();
        System.out.println(Objects.equals(s, s1)); //true
    }
}
