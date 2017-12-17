package com.arkenian.ruleengine.predicate.expression;

import com.arkenian.ruleengine.model.Subject;
import com.arkenian.ruleengine.predicate.IComplexPredicate;

public enum ExpressionInventory {
    E00000000000001(new P00000000000001()),
    E00000000000002(new P00000000000002()),
    E00000000000003(new P00000000000003()),
    E00000000000004(new P00000000000004()),
    E00000000000005(new P00000000000005()),
    E00000000000006(new P00000000000006()),
    E00000000000007(new P00000000000007()),
    E00000000000008(new P00000000000008()),
    E00000000000009(new P00000000000009()),
    E00000000000010(new P00000000000010()),
    E00000000000011(new P00000000000011()),
    E00000000000012(new P00000000000012()),
    E00000000000013(new P00000000000013()),
    E00000000000014(new P00000000000014()),
    E00000000000015(new P00000000000015()),
    E00000000000016(new P00000000000016()),
    E00000000000017(new P00000000000017()),
    E00000000000018(new P00000000000018()),
    E00000000000019(new P00000000000019());

    private final IComplexPredicate<Subject> predicate;

    ExpressionInventory(IComplexPredicate<Subject> predicate) {
        this.predicate = predicate;
    }

    public IComplexPredicate<Subject> predicate() {
        return predicate;
    }
}
