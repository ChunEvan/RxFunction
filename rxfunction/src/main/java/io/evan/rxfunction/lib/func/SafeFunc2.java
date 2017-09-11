package io.evan.rxfunction.lib.func;

/**
 * Created by Evan on 2017/9/11 下午3:38.
 */

public interface SafeFunc2<T1, T2, R> extends Function {
    R call(T1 arg1, T2 arg2) throws Exception;
}
