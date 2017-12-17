package com.arkenian.ruleengine.predicate.expression;

import com.arkenian.ruleengine.model.Subject;
import com.arkenian.ruleengine.predicate.RootSubjectPredicate;

import java.util.Arrays;
import java.util.List;

public class P00000000000014 extends RootSubjectPredicate {
    private final List s = Arrays.asList("CC", "BB");

    @Override
    public boolean test(Subject subject) {
        return subject.getS004() != null && s.contains(subject.getS004());
    }
}
