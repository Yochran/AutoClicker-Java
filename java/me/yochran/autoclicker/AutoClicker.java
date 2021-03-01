package me.yochran.autoclicker;

import me.yochran.autoclicker.listeners.KeyPressListener;
import me.yochran.autoclicker.utils.Clicker;
import me.yochran.autoclicker.utils.Utils;
import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;

import java.awt.*;

public class AutoClicker extends Utils {

    private static Clicker CCL = new Clicker();

    public static void main(String[] args) {
        T_RJNAT();

        U_PRINT("AutoClicker (Java) Started up successfully.");
        U_PRINT("Q is to toggle on, Z is to toggle off.");

        U_PRINT("Enter the Click Delay (MS): ");
        String I_DELAY_STR = U_INPUT();

        try {
            int I_DELAY_VAL = Integer.parseInt(I_DELAY_STR);
            CCL.I_DELAY = I_DELAY_VAL;

            U_PRINT("Click delay set.");

            while (true) {
                Thread.sleep(5000);
                CCL.C_TOGGLE(false);
            }
        } catch (Exception e) {
            U_PRINT("Error, inputted value couldn't be converted to an integer.");
        }
    }

    private static void T_RJNAT() {
        try {
            GlobalScreen.registerNativeHook();
            GlobalScreen.addNativeKeyListener(new KeyPressListener());
        } catch (NativeHookException e) {
            U_PRINT("JNativeHook failed to register.");
        }
    }
}
