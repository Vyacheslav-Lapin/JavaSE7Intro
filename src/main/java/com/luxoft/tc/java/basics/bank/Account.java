package com.luxoft.tc.java.basics.bank;

import com.luxoft.tc.java.basics.Person;
import lombok.*;
import lombok.experimental.Accessors;

@AllArgsConstructor
@Accessors(chain = true)
@Data
public class Account {

    private final Person person;
    private int bill;
    private int overdraft;

    public static void main(String[] args) {

        val account = new Account(
                new Person("John Smith", 55),
                500,
                100);

        int bill = account.getBill();

        m3("");
        StringBuffer buffer = new StringBuffer("jhafdgdfg");
        buffer.append("safgafdghshgdf");
        m3(buffer);
    }

    public static int m3(CharSequence sequence) {
        //...
        return sequence.length();
    }
}
