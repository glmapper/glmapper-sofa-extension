package com.glmapper.bridge.extension;

/**
 * 定义一个具有扩展能力的 bean
 * @author: guolei.sgl (guolei.sgl@antfin.com) 2019/2/13 2:47 PM
 * @since:
 **/
public interface IExtension {
    String say();

    SimpleSpringBean getSimpleSpringBean();
}
