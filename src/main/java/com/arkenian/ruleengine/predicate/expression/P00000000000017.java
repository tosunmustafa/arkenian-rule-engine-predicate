package com.arkenian.ruleengine.predicate.expression;

import com.arkenian.ruleengine.model.Subject;
import com.arkenian.ruleengine.predicate.RootSubjectPredicate;

public class P00000000000017 extends RootSubjectPredicate {
    @Override
    public boolean test(Subject subject) {
        return "A2".equals(subject.getS006());
    }
}
