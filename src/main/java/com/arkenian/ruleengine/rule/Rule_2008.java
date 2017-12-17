package com.arkenian.ruleengine.rule;

import com.arkenian.ruleengine.model.Subject;
import com.arkenian.ruleengine.predicate.RootSubjectPredicate;
import com.arkenian.ruleengine.predicate.expression.ExpressionInventory;


public class Rule_2008 extends RootSubjectPredicate {
    @Override
    public boolean test(Subject Subject) {
        return ExpressionInventory.E00000000000010.predicate().test(Subject);
    }
}
