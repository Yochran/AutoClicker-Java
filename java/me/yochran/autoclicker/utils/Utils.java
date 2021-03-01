package me.yochran.autoclicker.utils;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Utils {

    protected static void U_PRINT(String message) {
        SimpleDateFormat SDF = new SimpleDateFormat("HH:mm:ss");
        System.out.println("(" + SDF.format(System.currentTimeMillis()) + ") " + "[AutoClicker] " + message);
    }

    protected static String U_INPUT() {
        Scanner U_SC = new Scanner(System.in);
        return U_SC.nextLine();
    }
}
