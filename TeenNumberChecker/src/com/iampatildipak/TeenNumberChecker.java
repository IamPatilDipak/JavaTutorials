package com.iampatildipak;

public class TeenNumberChecker {

    public static boolean hasTeen(int first, int second, int third) {
        if ((first >= 13 && first <= 19) || (second >= 13 && second <= 19) || (third >= 13 && third <= 19)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isTeen(int num4) {
        if (num4 >= 13 && num4 <= 19) {
            return true;
        }
        return false;
    }
}
