package it.unimol.alan2pp;

import javax.swing.GrayFilter;

public class PPAlanVisitor extends Alan2BaseVisitor<PPNode> {

    int tabs = 0;

    @Override
    public PPNode visitSource(Alan2Parser.SourceContext ctx) {
        PPTree source = new PPTree(true, tabs);
        tabs++;
        source.addChild(new PPTerminalNode(ctx.SOURCE().getText()));
        source.addChild(PPTerminalNode.WHITE_SPACE);
        source.addChild(new PPTerminalNode(ctx.ID().getText()));
        source.addChild(PPTerminalNode.NEW_LINE);
        ctx.def().stream()
            .forEach(defctx -> source.addChild(visit(defctx)));
        source.addChild(PPTerminalNode.NEW_LINE);
        source.addChild(visit(ctx.body()));
        tabs--;
        return source;
    }

    @Override
    public PPNode visitParam(Alan2Parser.ParamContext ctx) {
        PPTree tree = new PPTree(false, tabs);
        tree.addChild(visit(ctx.type()));
        tree.addChild(PPTerminalNode.WHITE_SPACE);
        tree.addChild(new PPTerminalNode(ctx.ID().getText()));
        return tree;
    }

    @Override
    public PPNode visitParam_comma(Alan2Parser.Param_commaContext ctx) {
        PPTree tree = new PPTree(false, tabs);
        tree.addChild(visit(ctx.param()));
        tree.addChild(PPTerminalNode.WHITE_SPACE);
        tree.addChild(new PPTerminalNode(ctx.COMMA().getText()));
        return tree;
    }

    @Override
    public PPNode visitParams(Alan2Parser.ParamsContext ctx) {
        PPTree tree = new PPTree(true, tabs);
        ctx.param_comma().stream()
            .forEach(pc -> {
                tree.addChild(visit(pc));
                tree.addChild(PPTerminalNode.WHITE_SPACE);
            });   
        tree.addChild(visit(ctx.param()));
        return tree;
    }

    @Override
    public PPNode visitFuncdef(Alan2Parser.FuncdefContext ctx) {
        PPTree tree = new PPTree(true, tabs);
        tree.addTerminalNode(ctx.FUNCTION().getText());
        tree.addWhiteSpace();
        tree.addTerminalNode(ctx.ID().getText());
        tree.addTerminalNode(ctx.OPENPAR().getText());
        tree.addChild(visit(ctx.params()));
        tree.addTerminalNode(ctx.CLOSEPAR().getText());
        if(ctx.return_type() != null) {
            tree.addChild(visit(ctx.return_type()));
        }
        tree.addChild(visit(ctx.body()));
    }
    
}
