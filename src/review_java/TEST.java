package review_java;

import java.util.Scanner;

enum days {
    MONDAY(2), TUESDAY(3), WEDNESDAY(4), THURSDAY(5), FRIDAY(6), SATURDAY(7), SUNDAY(8);

    private int value;

    private days(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

}

public class TEST {

    public static void main(String[] args) {

//        for (days value : days.values()) {
//            System.out.println(value.getValue());
//        }
        Scanner scan = new Scanner(System.in);
        System.out.println("===>>> " + scan.nextLine());

    }

}
