package com.glmapper.bridge.extension;

/**
 * @author: guolei.sgl (guolei.sgl@antfin.com) 2019/2/13 7:39 PM
 * @since:
 **/
public class ExtensionSimpleSpringBean extends SimpleSpringBean {
    @Override
    public String test() {
        return "extension value";
    }
}
