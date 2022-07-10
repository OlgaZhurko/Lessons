package com.company.ext.lessons7.predicate;

import java.util.Objects;

public interface Predicate <T>{

    boolean nic(T t);

    default Predicate<T> and(Predicate<? super T> other) {
        Objects.requireNonNull(other);
        return (t) -> nic(t) && other.nic(t);
    }

    default Predicate<T> or(Predicate<? super T> other){
        Objects.requireNonNull(other);
        return (t) -> nic(t) || other.nic(t);
    }
}
