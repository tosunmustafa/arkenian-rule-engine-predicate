package com.arkenian.ruleengine.predicate.expression;

import com.arkenian.ruleengine.model.Subject;
import com.arkenian.ruleengine.predicate.RootSubjectPredicate;

import java.util.Arrays;
import java.util.List;

public class P00000000000010 extends RootSubjectPredicate {
    private final List city = Arrays.asList("Ankara", "İstanbul", "İzmir");

    @Override
    public boolean test(Subject subject) {
        return subject.getS003() != null && city.contains(subject.getS003());
    }
}
