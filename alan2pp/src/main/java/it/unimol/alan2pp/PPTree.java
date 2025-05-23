package it.unimol.alan2pp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class PPTree implements PPNode{

    private List<PPNode> children = new ArrayList<>();
    private boolean splitable;
    private int tabs;

    public PPTree(boolean splitable, int tabs) {
        this.splitable = splitable;
        this.tabs = tabs;
    }

    public void addChild(PPNode child) {
        children.add(child);
    }

    public void addWhiteSpace() {
        addChild(PPTerminalNode.WHITE_SPACE);
    }

    public void addNewLine() {
        addChild(PPTerminalNode.NEW_LINE);
    }

    public void addTab() {
        addChild(PPTerminalNode.TAB);
    }

    public void addTerminalNode(String text) {
        addChild(new PPTerminalNode(text));
    }

    public void addChildren(Collection<PPNode> children) {
        this.children.addAll(children);
    }

    public List<PPNode> getChildren() {
        return Collections.unmodifiableList(children);
    }

    public boolean isSplitable() {
        return splitable;
    }

    public int getTabs() {
        return tabs;
    }

    @Override
    public String get(int startCharPosition, int maxLength) {
        StringBuilder sb = new StringBuilder();
        if(!isSplitable()) {
            for(PPNode node : children) {
                String pp = node.get(startCharPosition, maxLength);
                sb.append(pp);
            }
        }
        else {
            for(PPNode node : children) {
                if(startCharPosition >= maxLength) {
                    sb.append("\n");
                    sb.append(PPTerminalNode.TAB.getText().repeat(getTabs()));
                    startCharPosition = getTabs() * PPTerminalNode.TAB.getText().length();
                }
                String pp = node.get(startCharPosition, maxLength);
                sb.append(pp);
            }
        }
        return sb.toString();
    }

}
