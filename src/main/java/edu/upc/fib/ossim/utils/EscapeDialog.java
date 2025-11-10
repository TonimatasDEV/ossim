package edu.upc.fib.ossim.utils;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class EscapeDialog extends JDialog {
    private static final long serialVersionUID = 1L;

    /**
     * Method overrides. This allows to close the dialog when escape is pressed
     */
    protected JRootPane createRootPane() {
        JRootPane rootPane = new JRootPane();
        KeyStroke stroke = KeyStroke.getKeyStroke("ESCAPE");

        Action actionListener = new AbstractAction() {
            private static final long serialVersionUID = 1L;

            public void actionPerformed(ActionEvent actionEvent) {
                setVisible(false);
            }
        };

        InputMap inputMap = rootPane.getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
        inputMap.put(stroke, "ESCAPE");
        inputMap = rootPane.getInputMap(JComponent.WHEN_FOCUSED);
        inputMap.put(stroke, "ESCAPE");
        inputMap = rootPane.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        inputMap.put(stroke, "ESCAPE");
        rootPane.getActionMap().put("ESCAPE", actionListener);

        return rootPane;
    }
}
