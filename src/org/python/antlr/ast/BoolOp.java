// Autogenerated AST node
package org.python.antlr.ast;
import org.python.antlr.PythonTree;
import org.python.antlr.ListWrapper;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import java.io.DataOutputStream;
import java.io.IOException;

public class BoolOp extends exprType {
    private boolopType op;
    public boolopType getOp() {
        return op;
    }
    public void setOp(boolopType op) {
        this.op = op;
    }

    private ListWrapper<exprType> values;
    public ListWrapper<exprType> getValues() {
        return values;
    }
    public void setValues(java.util.List<exprType> values) {
        this.values = new ListWrapper<exprType>(values);
    }


    private final static String[] fields = new String[] {"op", "values"};
    public String[] get_fields() { return fields; }

    public BoolOp(boolopType op, java.util.List<exprType> values) {
        this.op = op;
        this.values = values;
        if (values != null) {
            for(PythonTree t : values) {
                addChild(t);
            }
        }
    }

    public BoolOp(Token token, boolopType op, java.util.List<exprType> values) {
        super(token);
        this.op = op;
        this.values = values;
        if (values != null) {
            for(PythonTree t : values) {
                addChild(t);
            }
        }
    }

    public BoolOp(int ttype, Token token, boolopType op,
    java.util.List<exprType> values) {
        super(ttype, token);
        this.op = op;
        this.values = values;
        if (values != null) {
            for(PythonTree t : values) {
                addChild(t);
            }
        }
    }

    public BoolOp(PythonTree tree, boolopType op, java.util.List<exprType>
    values) {
        super(tree);
        this.op = op;
        this.values = values;
        if (values != null) {
            for(PythonTree t : values) {
                addChild(t);
            }
        }
    }

    public String toString() {
        return "BoolOp";
    }

    public String toStringTree() {
        StringBuffer sb = new StringBuffer("BoolOp(");
        sb.append("op=");
        sb.append(dumpThis(op));
        sb.append(",");
        sb.append("values=");
        sb.append(dumpThis(values));
        sb.append(",");
        sb.append(")");
        return sb.toString();
    }

    public <R> R accept(VisitorIF<R> visitor) throws Exception {
        return visitor.visitBoolOp(this);
    }

    public void traverse(VisitorIF visitor) throws Exception {
        if (values != null) {
            for (PythonTree t : values) {
                if (t != null)
                    t.accept(visitor);
            }
        }
    }

    private int lineno = -1;
    public int getLineno() {
        if (lineno != -1) {
            return lineno;
        }
        return getLine();
    }

    public void setLineno(int num) {
        lineno = num;
    }

    private int col_offset = -1;
    public int getCol_offset() {
        if (col_offset != -1) {
            return col_offset;
        }
        return getCharPositionInLine();
    }

    public void setCol_offset(int num) {
        col_offset = num;
    }

}
