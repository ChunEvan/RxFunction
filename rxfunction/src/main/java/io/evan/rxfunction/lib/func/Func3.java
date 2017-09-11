package io.evan.rxfunction.lib.func;

/**
 * Created by Evan on 2017/9/11 下午3:38.
 */

public interface Func3<T1, T2, T3, R> extends Function {
    R call(T1 arg1, T2 arg2, T3 arg3);
}
