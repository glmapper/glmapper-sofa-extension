package com.glmapper.bridge.consumer;

import com.alipay.sofa.runtime.api.annotation.SofaReference;
import com.glmapper.bridge.service.SampleJvmService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author: guolei.sgl (guolei.sgl@antfin.com) 2019/2/13 11:52 AM
 * @since:
 **/
public class JvmServiceConsumer {

    @SofaReference(uniqueId = "annotationImpl")
    private SampleJvmService sampleJvmServiceByFieldAnnotation;

    public void init() {
        sampleJvmServiceByFieldAnnotation.hello();
    }


}
