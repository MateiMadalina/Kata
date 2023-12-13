public class WhatCenturyIsIt {
    public static void main(String[] args) {
        System.out.println(whatCentury(2000));
    }

    public static String whatCentury(int year) {
        int century = year % 100 == 0 ? year / 100 : (year / 100) + 1;
        if (century % 100 >= 11 && century % 100 <= 13) {
            return century + "th";
        }
        String end = (century % 10) == 1 ? "st" : (century % 10) == 2 ? "nd" : (century % 10) == 3 ? "rd" : "th";
        return century + end;
    }
}
