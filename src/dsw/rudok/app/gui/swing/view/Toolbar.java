package dsw.rudok.app.gui.swing.view;

import javax.swing.*;

public class Toolbar extends JToolBar {

    public Toolbar() {
        super(HORIZONTAL);
        setFloatable(false);

        add (MainFrame.getInstance().getActionManager().getExitAction());
        add (MainFrame.getInstance().getActionManager().getNewProjectAction());
        add (MainFrame.getInstance().getActionManager().getAboutus());
        add (MainFrame.getInstance().getActionManager().getDeleteAction());
    }
}
