package com.arkenian.ruleengine.predicate.expression;

import com.arkenian.ruleengine.model.Subject;
import com.arkenian.ruleengine.predicate.RootSubjectPredicate;

public class P00000000000002 extends RootSubjectPredicate {
    @Override
    public boolean test(Subject subject) {
        return subject.getI0000() != null && subject.getI0000() < 100;
    }
}
