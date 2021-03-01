package me.yochran.autoclicker.listeners;

import me.yochran.autoclicker.utils.Clicker;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;

public class KeyPressListener implements NativeKeyListener {

    private static Clicker CCL = new Clicker();

    @Override
    public void nativeKeyPressed(NativeKeyEvent event) {
        if (NativeKeyEvent.getKeyText(event.getKeyCode()).equals("Q")) {
            CCL.C_TOGGLE(true);
        } else if (NativeKeyEvent.getKeyText(event.getKeyCode()).equals("Z")) {
            CCL.C_TOGGLE(false);
        }
    }

    // JNativeHook Required
    @Override public void nativeKeyTyped(NativeKeyEvent nativeKeyEvent) { }
    @Override public void nativeKeyReleased(NativeKeyEvent nativeKeyEvent) { }
}
