package com.arkenian.ruleengine.predicate.rule.inventory;

import com.arkenian.ruleengine.model.Subject;
import com.arkenian.ruleengine.predicate.IComplexPredicate;
import com.arkenian.ruleengine.rule.Rule_2001;
import com.arkenian.ruleengine.rule.Rule_2002;
import com.arkenian.ruleengine.rule.Rule_2003;
import com.arkenian.ruleengine.rule.Rule_2004;
import com.arkenian.ruleengine.rule.Rule_2005;
import com.arkenian.ruleengine.rule.Rule_2006;
import com.arkenian.ruleengine.rule.Rule_2007;
import com.arkenian.ruleengine.rule.Rule_2008;
import com.arkenian.ruleengine.rule.Rule_2009;
import com.arkenian.ruleengine.rule.Rule_2010;

public enum RuleInventory {

    Rule_2001(2001L, new Rule_2001()),
    Rule_2002(2002L, new Rule_2002()),
    Rule_2003(2003L, new Rule_2003()),
    Rule_2004(2004L, new Rule_2004()),
    Rule_2005(2005L, new Rule_2005()),
    Rule_2006(2006L, new Rule_2006()),
    Rule_2007(2007L, new Rule_2007()),
    Rule_2008(2008L, new Rule_2008()),
    Rule_2009(2009L, new Rule_2009()),
    Rule_2010(2010L, new Rule_2010());

    private final Long ruleId;
    private final IComplexPredicate<Subject> predicate;

    RuleInventory(Long ruleId, IComplexPredicate<Subject> predicate) {
        this.ruleId = ruleId;
        this.predicate = predicate;
    }

    public IComplexPredicate<Subject> getPredicate() {
        return predicate;
    }

    public Long ruleId() {
        return ruleId;
    }
}
