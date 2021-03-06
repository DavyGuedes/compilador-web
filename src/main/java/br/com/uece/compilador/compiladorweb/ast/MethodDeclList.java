package br.com.uece.compilador.compiladorweb.ast;

import java.util.Vector;

public class MethodDeclList extends ASTNode {
    private Vector list;

    public MethodDeclList(int ln) {
        super(ln);
        list = new Vector();
    }

    public void addElement(MethodDecl n) {
        this.list.addElement(n);
    }

    public MethodDecl elementAt(int i) {
        return (MethodDecl) this.list.elementAt(i);
    }

    public int size() {
        return this.list.size();
    }
}
