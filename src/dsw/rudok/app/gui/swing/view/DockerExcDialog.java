package dsw.rudok.app.gui.swing.view;

import javax.swing.*;
import java.awt.*;

public class DockerExcDialog extends JDialog {

    private String tiltle;

    public DockerExcDialog(String title){
        this.tiltle = title;
        setLayout(new GridLayout());
        initialiseGUI();

    }

    private void initialiseGUI() {

        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        setSize(screenWidth / 4, screenHeight / 4);
        add(new Label(this.tiltle));
    }
}
