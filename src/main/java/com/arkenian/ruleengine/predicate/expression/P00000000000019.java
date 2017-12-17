package com.arkenian.ruleengine.predicate.expression;

import com.arkenian.ruleengine.model.Subject;
import com.arkenian.ruleengine.predicate.RootSubjectPredicate;

public class P00000000000019 extends RootSubjectPredicate {
    @Override
    public boolean test(Subject subject) {
        return subject.getL001() != null && Long.valueOf(99796144).compareTo(subject.getL001()) > 0;
    }
}
