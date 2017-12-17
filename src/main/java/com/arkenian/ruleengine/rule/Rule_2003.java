package com.arkenian.ruleengine.rule;

import com.arkenian.ruleengine.model.Subject;
import com.arkenian.ruleengine.predicate.RootSubjectPredicate;
import com.arkenian.ruleengine.predicate.rule.inventory.RuleInventory;


public class Rule_2003 extends RootSubjectPredicate {
    @Override
    public boolean test(Subject subject) {
        return RuleInventory.Rule_2001.getPredicate()
                .xor(RuleInventory.Rule_2002.getPredicate())
                .test(subject);
    }
}
