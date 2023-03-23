package is.hi.hbv202g.ass9.compositeLeafObservedTemplateMethod;

import java.util.ArrayList;
import java.util.List;

public abstract class SuperComposite {

    protected List<MathExpression> children = new ArrayList<MathExpression>();
    protected int lastObservedResult;

    protected abstract int getResult();

    public void add(MathExpression mE) {
        children.add(mE);
    }

    public void update() {
        lastObservedResult = getResult();
        System.out.println(lastObservedResult);
    }

    public int getLastObservedResult() {
        return lastObservedResult;
    }

}
