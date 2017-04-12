import java.util.Date;

public class MutableTest {

    public static void main(String[] args) {
        run(new MutableTest());
    }

    Date date = new Date();

    private static void run(MutableTest that) {
        System.out.println(that.date);
        that.date = that.changeDate(that.date);
        System.out.println(that.date);

        System.out.println();

        int i = 55;
        System.out.println(i); //55
        i = that.changeI(i);
        System.out.println(i); //54
    }

    private int changeI(MutableTest this, int i) {
        System.out.println(i);//55
        i = 54;
        System.out.println(i); //54
        return i;
    }

    private Date changeDate(MutableTest this, Date date2) {
        date2.setTime(0);
        return date2;
    }
}