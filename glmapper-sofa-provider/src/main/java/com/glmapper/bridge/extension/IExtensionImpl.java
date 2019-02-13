package com.glmapper.bridge.extension;

import com.alipay.sofa.runtime.api.annotation.SofaService;
import com.alipay.sofa.service.api.component.Extension;

/**
 * @author: guolei.sgl (guolei.sgl@antfin.com) 2019/2/13 2:48 PM
 * @since:
 **/
@SofaService
public class IExtensionImpl implements IExtension {

    private String word;

    private SimpleSpringBean                 simpleSpringBean;

    @Override
    public String say() {
        return word;
    }

    @Override
    public SimpleSpringBean getSimpleSpringBean() {
        return simpleSpringBean;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public void setSimpleSpringBean(SimpleSpringBean simpleSpringBean) {
        this.simpleSpringBean = simpleSpringBean;
    }

    public void registerExtension(Extension extension) throws Exception {
        Object[] contributions = extension.getContributions();
        String extensionPoint = extension.getExtensionPoint();

        if (contributions == null) {
            return;
        }

        for (Object contribution : contributions) {
            if ("word".equals(extensionPoint)) {
                setWord(((ExtensionDescriptor) contribution).getValue());
            }else if ("simpleSpring".equals(extensionPoint)) {
                simpleSpringBean = ((SimpleBeanExtensionDescriptor) contribution).getValue();
            }
        }
    }
}
