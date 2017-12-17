package com.arkenian.ruleengine.predicate;

import java.util.Objects;
import java.util.function.Predicate;

public interface IComplexPredicate<T> extends Predicate<T> {

    default IComplexPredicate<T> xor(IComplexPredicate<? super T> other) {
        Objects.requireNonNull(other);
        return (t) -> test(t) ^ other.test(t);
    }
}
