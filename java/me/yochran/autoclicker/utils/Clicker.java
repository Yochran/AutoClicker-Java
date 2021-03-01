package me.yochran.autoclicker.utils;

import java.awt.*;

public class Clicker extends Utils {

    private int I_BUTTON;
    public int I_DELAY;

    public void C_CLICK() {
        try {
            Robot R_ROBOT = new Robot();

            R_ROBOT.mousePress((I_BUTTON == 1) ? 4 : 16);
            R_ROBOT.mouseRelease((I_BUTTON == 1) ? 4 : 16);
        } catch (AWTException e) {
            U_PRINT("Error while clicking. (Clicker.java)");
        }
    }

    public void C_TOGGLE(boolean I_TOGGLED) {
        try {
            while (I_TOGGLED) {
                C_CLICK();
                Thread.sleep(I_DELAY);
            }
        } catch (InterruptedException e) {
            U_PRINT("Error while delaying clicks.");
        }
    }
}
