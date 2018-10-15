package com.foo;

/**
 *
 * @author Aishwarya_Bommisetty
 *
 * @param <T>
 */
@FunctionalInterface
public interface Finder<T> {
    /**
     *
     * @param obj the object to be fetched
     * @return boolean value
     */
   boolean check(T obj);
}
