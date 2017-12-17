package com.arkenian.ruleengine.predicate.expression;

import com.arkenian.ruleengine.model.Subject;
import com.arkenian.ruleengine.predicate.RootSubjectPredicate;

import java.util.regex.Pattern;

public class P00000000000009 extends RootSubjectPredicate {
    private final Pattern pattern = Pattern.compile("AKQ[:lower:]{4}");

    @Override
    public boolean test(Subject subject) {
        return subject.getS001() != null && pattern.matcher(subject.getS001()).matches();
    }
}
