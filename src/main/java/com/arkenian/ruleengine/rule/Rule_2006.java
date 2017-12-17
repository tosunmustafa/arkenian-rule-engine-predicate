package com.arkenian.ruleengine.rule;

import com.arkenian.ruleengine.model.Subject;
import com.arkenian.ruleengine.predicate.RootSubjectPredicate;
import com.arkenian.ruleengine.predicate.expression.ExpressionInventory;


public class Rule_2006 extends RootSubjectPredicate {
    @Override
    public boolean test(Subject subject) {
        return ExpressionInventory.E00000000000006.predicate()
                .and(ExpressionInventory.E00000000000007.predicate())
                .and(ExpressionInventory.E00000000000011.predicate())
                .and(ExpressionInventory.E00000000000014.predicate()).test(subject);
    }
}
