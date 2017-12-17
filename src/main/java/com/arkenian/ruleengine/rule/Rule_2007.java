package com.arkenian.ruleengine.rule;

import com.arkenian.ruleengine.model.Subject;
import com.arkenian.ruleengine.predicate.RootSubjectPredicate;
import com.arkenian.ruleengine.predicate.expression.ExpressionInventory;


public class Rule_2007 extends RootSubjectPredicate {
    @Override
    public boolean test(Subject subject) {
        return ExpressionInventory.E00000000000008.predicate().test(subject);
    }
}
