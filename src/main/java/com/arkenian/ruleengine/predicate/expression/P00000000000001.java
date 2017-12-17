package com.arkenian.ruleengine.predicate.expression;

import com.arkenian.ruleengine.model.Subject;
import com.arkenian.ruleengine.predicate.RootSubjectPredicate;

import java.util.regex.Pattern;

public class P00000000000001 extends RootSubjectPredicate {
    private final Pattern pattern = Pattern.compile("[:upper:]{3}\\d{4}");

    @Override
    public boolean test(Subject subject) {
        return subject.getS000() != null && pattern.matcher(subject.getS000()).matches();
    }
}
