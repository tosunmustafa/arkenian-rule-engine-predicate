package com.arkenian.ruleengine.rule;


import com.arkenian.ruleengine.model.Subject;
import com.arkenian.ruleengine.predicate.IComplexPredicate;
import com.arkenian.ruleengine.predicate.expression.ExpressionInventory;

public class Rule_2001 implements IComplexPredicate<Subject> {
    @Override
    public boolean test(Subject subject) {
        return ExpressionInventory.E00000000000001.predicate()
                .or(ExpressionInventory.E00000000000002.predicate())
                .and(ExpressionInventory.E00000000000003.predicate())
                .and(ExpressionInventory.E00000000000004.predicate())
                .and(ExpressionInventory.E00000000000018.predicate())
                .and(ExpressionInventory.E00000000000019.predicate())
                .test(subject);
    }
}
