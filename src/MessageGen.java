public class MessageGen {
    public String getMessage() {
        return "Hello, World!!!";
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setAge(50);

        Person person2 = new Person();
        person2.setAge(40);

        Person person3 = new Person();
        person3.setAge(5);

        Person person4 = new Person();
        person4.setAge(25);

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);
    }
}
