public class Person {
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        System.out.println(new Person().getAge());
    }
}
