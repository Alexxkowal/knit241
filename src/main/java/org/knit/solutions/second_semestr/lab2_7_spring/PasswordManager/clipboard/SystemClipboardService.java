package org.knit.solutions.second_semestr.lab2_7_spring.PasswordManager.clipboard;

import java.awt.*;
import java.awt.datatransfer.StringSelection;

public class SystemClipboardService implements ClipboardService {

    @Override
    public void copyToClipboard(String text) {
        Toolkit.getDefaultToolkit()
                .getSystemClipboard()
                .setContents(new StringSelection(text), null);
    }
}