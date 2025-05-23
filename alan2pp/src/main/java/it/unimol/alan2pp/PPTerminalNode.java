package it.unimol.alan2pp;

public class PPTerminalNode implements PPNode {

    public final static PPTerminalNode WHITE_SPACE = new PPTerminalNode(" ");
    public final static PPTerminalNode TAB = new PPTerminalNode("    ");
    public final static PPTerminalNode NEW_LINE = new PPTerminalNode("\n");

    private String text;

    public PPTerminalNode(String text) {
        this.text = text;
    }
    
    public String getText() {
        return text;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof PPTerminalNode) {
            PPTerminalNode other = (PPTerminalNode)obj;
            return getText().equals(other.getText());
        }
        else {
            return false;
        }
    }

    @Override
    public String get(int startCharPosition, int maxLength) {
        return getText();
    }


}
