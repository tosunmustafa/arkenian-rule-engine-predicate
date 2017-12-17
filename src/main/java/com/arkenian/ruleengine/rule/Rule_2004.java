package com.arkenian.ruleengine.rule;

import com.arkenian.ruleengine.model.Subject;
import com.arkenian.ruleengine.predicate.RootSubjectPredicate;
import com.arkenian.ruleengine.predicate.expression.ExpressionInventory;


public class Rule_2004 extends RootSubjectPredicate {
    @Override
    public boolean test(Subject subject) {
        return ExpressionInventory.E00000000000002.predicate()
                .and(ExpressionInventory.E00000000000003.predicate())
                .and(ExpressionInventory.E00000000000004.predicate())
                .and(ExpressionInventory.E00000000000005.predicate())
                .and(ExpressionInventory.E00000000000006.predicate())
                .and(ExpressionInventory.E00000000000007.predicate())
                .and(ExpressionInventory.E00000000000012.predicate())
                .or(ExpressionInventory.E00000000000014.predicate())
                .and(ExpressionInventory.E00000000000016.predicate())
                .test(subject);
    }
}
