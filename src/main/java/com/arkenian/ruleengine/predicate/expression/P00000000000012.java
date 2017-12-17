package com.arkenian.ruleengine.predicate.expression;

import com.arkenian.ruleengine.model.Subject;
import com.arkenian.ruleengine.predicate.RootSubjectPredicate;

import java.util.Arrays;
import java.util.List;

public class P00000000000012 extends RootSubjectPredicate {
    private final List city = Arrays.asList("Bursa", "Bolu", "Antalya");

    @Override
    public boolean test(Subject subject) {
        return subject.getS003() != null && city.contains(subject.getS003());
    }
}
