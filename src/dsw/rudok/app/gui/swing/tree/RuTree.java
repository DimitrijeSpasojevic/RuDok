package dsw.rudok.app.gui.swing.tree;

import dsw.rudok.app.gui.swing.controller.ExceptionForDocker;
import dsw.rudok.app.gui.swing.tree.model.RuTreeItem;
import dsw.rudok.app.repository.Project;
import dsw.rudok.app.repository.Workspace;

import javax.swing.*;
import javax.swing.tree.DefaultTreeModel;

public interface RuTree {

    JTree generateTree(Workspace workspace);
    void addProject(Project project);
    void deleteProject() throws ExceptionForDocker;

}
