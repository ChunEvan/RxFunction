package io.evan.rxfunction.lib.func;

/**
 * Created by Evan on 2017/9/11 下午3:38.
 */

public interface SafeFunc0<R> extends Function {
    R call() throws Exception;
}
