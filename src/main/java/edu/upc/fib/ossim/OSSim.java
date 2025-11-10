package edu.upc.fib.ossim;

import javax.swing.*;
import java.awt.*;

/**
 * Interface for application's top level container, a frame or an applet for instance.
 *
 * @author Alex
 */
public interface OSSim {
    /**
     * Loads a view into container.
     *
     * @param view view to load
     */
    void loadView(JPanel view);

    /**
     * Shows a message
     *
     * @param msg message content
     */
    void showMessage(String msg);

    /**
     * Gets component in which dialogs are displayed
     *
     * @return component
     */
    Component getComponent();

    /**
     * Is it possible to open or save simultions?
     *
     * @return it is possible to open or save simultions
     */
    boolean allowOpenSave();
}
