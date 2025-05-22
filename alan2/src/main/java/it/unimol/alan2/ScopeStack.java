package it.unimol.alan2;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class ScopeStack {

    Deque<Map<String, Symbol>> stack = new ArrayDeque<>();

    public void pushScope() {
        stack.push(new HashMap<>());
    }

    public Set<Symbol> popScope() {
        return stack.pop().values().stream()
            .collect(Collectors.toSet());
    }

    public Optional<DuplicateIDInScopeException> addSymbol(Symbol symbol) {
        if(stack.peek().containsKey(symbol.getName())) {
            return Optional.of(new DuplicateIDInScopeException("Variable " + symbol.getName() + " already declared in this scope"));
        }
        stack.peek().put(symbol.getName(), symbol);
        return Optional.empty();
    }

    public Optional<Symbol> getVisibleSymbol(String name) {
        return stack.stream()
            .filter(scope -> scope.containsKey(name))
            .findFirst()
            .map(scope -> scope.get(name));
    }

    public Optional<Symbol> getVisibleSymbleFromTopScope(String name) {
        return Optional.ofNullable(stack.peek().get(name));
    }

    public boolean isSymbolDeclared(String name) {
        return getVisibleSymbol(name).isPresent();
    }    
    
    public void clear() {
        stack.clear();
    }
}
