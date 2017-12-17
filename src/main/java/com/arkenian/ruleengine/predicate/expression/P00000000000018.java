package com.arkenian.ruleengine.predicate.expression;

import com.arkenian.ruleengine.model.Subject;
import com.arkenian.ruleengine.predicate.RootSubjectPredicate;

public class P00000000000018 extends RootSubjectPredicate {
    @Override
    public boolean test(Subject subject) {
        return subject.getL000() != null && Long.valueOf(6886144L).compareTo(subject.getL000()) <= 0;
    }
}
