package com.glmapper.bridge.extension;

import com.alipay.sofa.common.xmap.annotation.XObject;
import com.alipay.sofa.common.xmap.spring.XNodeSpring;

/**
 * @author: guolei.sgl (guolei.sgl@antfin.com) 2019/2/13 6:15 PM
 * @since:
 **/
@XObject("simpleSpring")
public class SimpleBeanExtensionDescriptor {

    @XNodeSpring(value = "value", type = SimpleSpringBean.class)
    private SimpleSpringBean value;

    public SimpleSpringBean getValue() {
        return value;
    }
}
