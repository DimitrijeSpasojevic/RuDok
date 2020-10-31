package dsw.rudok.app.gui.swing.tree.controller;

import dsw.rudok.app.gui.swing.tree.model.RuTreeItem;
import dsw.rudok.app.repository.node.RuNode;
import lombok.Getter;

import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;
@Getter
public class RuTreeSelectionListener implements TreeSelectionListener {

    private RuTreeItem SelectedRuTreeItem;

    @Override
    public void valueChanged(TreeSelectionEvent e) {
        TreePath path = e.getPath();
        SelectedRuTreeItem = (RuTreeItem)path.getLastPathComponent();
        System.out.println("Selektovan cvor:"+ SelectedRuTreeItem.getName());
        System.out.println("getPath: "+ path);
    }


}


