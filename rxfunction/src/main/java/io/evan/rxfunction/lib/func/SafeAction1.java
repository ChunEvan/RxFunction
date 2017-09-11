package io.evan.rxfunction.lib.func;

/**
 * Created by Evan on 2017/9/11 下午3:38.
 */

public interface SafeAction1<T> extends Function {
    void call(T arg) throws Exception;
}
