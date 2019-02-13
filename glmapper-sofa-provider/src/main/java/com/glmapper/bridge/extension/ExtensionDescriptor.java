package com.glmapper.bridge.extension;

import com.alipay.sofa.common.xmap.annotation.XNode;
import com.alipay.sofa.common.xmap.annotation.XObject;

/**
 *
 * 定义一个扩展点
 *
 * @author: guolei.sgl (guolei.sgl@antfin.com) 2019/2/13 2:51 PM
 * @since:
 **/
@XObject("word")
public class ExtensionDescriptor {

    @XNode("value")
    private String value;

    public String getValue() {
        return value;
    }
}
