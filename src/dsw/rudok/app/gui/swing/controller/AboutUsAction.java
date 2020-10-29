package dsw.rudok.app.gui.swing.controller;

import dsw.rudok.app.gui.swing.tree.model.RuTreeItem;
import dsw.rudok.app.gui.swing.view.AboutUsFrame;
import dsw.rudok.app.gui.swing.view.MainFrame;
import dsw.rudok.app.repository.Project;
import dsw.rudok.app.repository.node.RuNode;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.Random;

public class AboutUsAction extends AbstractRudokAction{
    private AboutUsFrame instante;

    public AboutUsAction() {
        putValue(SMALL_ICON, loadIcon("images/about-dijalog.png"));
        putValue(NAME, "About dijalog");
        putValue(SHORT_DESCRIPTION, "About us");
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        instante = AboutUsFrame.getInstance();
        instante.setVisible(true);
    }


/*


    public void actionPerformed(ActionEvent arg0) {
        int label = new Random().nextInt(100);
        Project p = new Project("Project " + label, (RuNode) ((RuTreeItem) MainFrame.getInstance().getWorkspaceTree().getModel().getRoot()).getNodeModel());
        MainFrame.getInstance().getTree().addProject(p);
    }*/
}
