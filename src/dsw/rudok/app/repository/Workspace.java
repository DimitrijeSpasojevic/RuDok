package dsw.rudok.app.repository;

import dsw.rudok.app.repository.node.RuNode;
import dsw.rudok.app.repository.node.RuNodeComposite;

import java.util.List;

public class Workspace extends RuNodeComposite {

    public Workspace(String name) {
        super(name, null);
    }

    @Override
    public void addChild(RuNode child) {
        if (child != null &&  child instanceof Project){
            Project project = (Project) child;
            if (!this.getChildren().contains(project)){
                this.getChildren().add(project);
            }
        }
    }

    @Override
    public void deleteChild(RuNode child) {
        if(child != null && child instanceof Project){
            Project project = (Project) child;
            this.getChildren().remove(child);
        }
    }
    public void deleteAllCild(){
        while(this.getChildren()!=null){
            getChildren().remove(0);
        }
    }

}
