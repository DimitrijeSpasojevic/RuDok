package dsw.rudok.app.gui.swing.controller;

import dsw.rudok.app.gui.swing.view.DockerExcDialog;

public class ExceptionForDocker extends Exception{

    public ExceptionForDocker(String title){
        super(title);
        DockerExcDialog excDialog = new DockerExcDialog(title);
        excDialog.setVisible(true);
    }

}
