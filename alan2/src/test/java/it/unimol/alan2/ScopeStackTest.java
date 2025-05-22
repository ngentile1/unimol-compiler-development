package it.unimol.alan2;

import org.junit.Assert;
import org.junit.Test;

public class ScopeStackTest {

    @Test
    public void getVisibleSymbolStack() {
        ScopeStack stack = new ScopeStack();
        stack.pushScope();
        stack.addSymbol(Symbol.make_source("a"));
        stack.pushScope();
        stack.addSymbol(Symbol.make_variable("a", Type.INTEGER));
        Assert.assertEquals(stack.getVisibleSymbol("a").get(), Symbol.make_variable("a", Type.INTEGER));
        stack.popScope();
        stack.popScope();
    }
    
}
