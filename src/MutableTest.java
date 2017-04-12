import java.util.Date;

public class MutableTest {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        date = changeDate(date);
        System.out.println(date);

        System.out.println();

        int i = 55;
        System.out.println(i); //55
        i = changeI(i);
        System.out.println(i); //54
    }

    private static int changeI(int i) {
        System.out.println(i);//55
        i = 54;
        System.out.println(i); //54
        return i;
    }

    private static Date changeDate(Date date2) {
        date2.setTime(0);
        return date2;
    }
}