package dsw.rudok.app.gui.swing.tree.view;

import dsw.rudok.app.gui.swing.controller.ExceptionForDocker;
import dsw.rudok.app.gui.swing.tree.RuTree;
import dsw.rudok.app.gui.swing.tree.controller.RuTreeSelectionListener;
import dsw.rudok.app.gui.swing.tree.model.RuTreeItem;
import dsw.rudok.app.repository.Project;
import dsw.rudok.app.repository.Workspace;
import dsw.rudok.app.repository.node.RuNode;

import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RuTreeImplementation implements RuTree {

    private RuTreeView treeView;
    private DefaultTreeModel treeModel;
    @Override
    public JTree generateTree(Workspace workspace) {
        RuTreeItem root = new RuTreeItem(workspace);
        treeModel = new DefaultTreeModel(root);
        treeView = new RuTreeView(treeModel);
        return treeView;
    }

    @Override
    public void addProject(Project project) {
        RuNode nodeModel = ((RuTreeItem)treeModel.getRoot()).getNodeModel();
        ((RuTreeItem)treeModel.getRoot()).add(new RuTreeItem(project));
        ((Workspace) nodeModel).addChild(project);
        SwingUtilities.updateComponentTreeUI(treeView);
    }

    @Override
    public void deleteProject() throws ExceptionForDocker {

        RuTreeItem selectedRuItem;
        try{
            selectedRuItem = (RuTreeItem)treeView.getSelectionPath().getLastPathComponent();

            if(((RuTreeItem)treeModel.getRoot()).getChildCount()>0 && selectedRuItem != null) {
                RuNode nodeModel = ((RuTreeItem) treeModel.getRoot()).getNodeModel();
                ((RuTreeItem) treeModel.getRoot()).remove(selectedRuItem);
                ((Workspace) nodeModel).deleteChild(selectedRuItem.getNodeModel());
                if (treeView != null)
                    SwingUtilities.updateComponentTreeUI(treeView);
            }
        }catch (Exception e){
            throw new ExceptionForDocker("Morate da selektujete");
        }




    }


}
