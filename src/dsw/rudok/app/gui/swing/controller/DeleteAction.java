package dsw.rudok.app.gui.swing.controller;

import dsw.rudok.app.gui.swing.tree.model.RuTreeItem;
import dsw.rudok.app.gui.swing.view.MainFrame;
import dsw.rudok.app.repository.Project;
import dsw.rudok.app.repository.node.RuNode;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.Random;

public class DeleteAction extends AbstractRudokAction{

    public DeleteAction() {
        putValue(SMALL_ICON, loadIcon("images/delete_icon.png"));
        putValue(NAME, "Delete");
        putValue(SHORT_DESCRIPTION, "Delete Project");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //MainFrame.getInstance().getTree().deleteProject();
    }
}
