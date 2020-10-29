package dsw.rudok.app.gui.swing.view;

import dsw.rudok.app.core.Repository;
import dsw.rudok.app.gui.swing.controller.ActionManager;
import dsw.rudok.app.gui.swing.tree.RuTree;
import dsw.rudok.app.gui.swing.tree.view.RuTreeImplementation;
import lombok.Getter;
import lombok.Setter;

import javax.swing.*;
import java.awt.*;
@Setter
@Getter
public class AboutUsFrame extends JDialog {

    private ActionManager actionManager;
    public static AboutUsFrame instante;


    private AboutUsFrame(){
        setLayout(new GridLayout());
    }

    private void initialise() {
        actionManager = new ActionManager();
    }

    private void initialiseGUI() {

        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        setSize(screenWidth / 3, screenHeight / 3);
        Label lblD = new Label("Dimitrije Spasojevic indeks:108/2020rn");
        Label lblE = new Label("Emilija Dotlic indeks:  /2020rn");
        add(lblE);
        add(lblD);
    }

    public static AboutUsFrame getInstance(){
        if(instante == null){
            instante = new AboutUsFrame();
            instante.initialise();
            instante.initialiseGUI();
        }

        return instante;
    }

}
