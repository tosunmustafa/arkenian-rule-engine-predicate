package com.arkenian.ruleengine.predicate.expression;

import com.arkenian.ruleengine.model.Subject;
import com.arkenian.ruleengine.predicate.RootSubjectPredicate;

public class P00000000000003 extends RootSubjectPredicate {
    @Override
    public boolean test(Subject subject) {
        return subject.getI0001() != null && subject.getI0001() < 90;
    }
}
