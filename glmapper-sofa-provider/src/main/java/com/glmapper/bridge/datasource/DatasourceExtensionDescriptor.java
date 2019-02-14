package com.glmapper.bridge.datasource;

import com.alipay.sofa.common.xmap.annotation.XObject;
import com.alipay.sofa.common.xmap.spring.XNodeSpring;

/**
 * @author: guolei.sgl (guolei.sgl@antfin.com) 2019/2/13 10:47 PM
 * @since:
 **/
@XObject("datasourcePoint")
public class DatasourceExtensionDescriptor {
    @XNodeSpring(value = "value", type = DatasourceBean.class)
    private DatasourceBean value;

    public DatasourceBean getValue() {
        return value;
    }
}
