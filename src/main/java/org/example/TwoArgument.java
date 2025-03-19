package org.example;

@FunctionalInterface
public interface TwoArgument<T, U, R> {
    R myFunc(T t, U u);
}
