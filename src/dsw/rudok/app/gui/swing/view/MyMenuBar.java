package dsw.rudok.app.gui.swing.view;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class MyMenuBar extends JMenuBar {

    public MyMenuBar() {
        JMenu fileMenu = new JMenu("File");
        fileMenu.setMnemonic(KeyEvent.VK_F);
        fileMenu.add(MainFrame.getInstance().getActionManager().getExitAction());
        fileMenu.add(MainFrame.getInstance().getActionManager().getNewProjectAction());
        fileMenu.add(MainFrame.getInstance().getActionManager().getAboutus());
        fileMenu.add(MainFrame.getInstance().getActionManager().getDeleteAction());
        this.add(fileMenu);

    }
}
