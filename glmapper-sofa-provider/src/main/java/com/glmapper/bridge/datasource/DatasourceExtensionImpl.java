package com.glmapper.bridge.datasource;

import com.alipay.sofa.runtime.api.annotation.SofaService;
import com.alipay.sofa.service.api.component.Extension;

/**
 * @author: guolei.sgl (guolei.sgl@antfin.com) 2019/2/13 10:46 PM
 * @since:
 **/
@SofaService
public class DatasourceExtensionImpl implements DatasourceExtension {
    // 需要被增强的成员变量
    private DatasourceBean datasourceBean;
    // 重写 DatasourceExtension 的 getDatasourceBean方法
    @Override
    public DatasourceBean getDatasourceBean() {
        return datasourceBean;
    }
    public void setDatasourceBean(DatasourceBean datasourceBean) {
        this.datasourceBean = datasourceBean;
    }
    // 用于获取数据源实例对象的方法，委托给 datasourceBean 来完成
    public void getDatasource(){
        datasourceBean.getDatasource();
    }
    // registerExtension
    public void registerExtension(Extension extension) throws Exception {
        Object[] contributions = extension.getContributions();
        String extensionPoint = extension.getExtensionPoint();
        if (contributions == null) {
            return;
        }
        for (Object contribution : contributions) {
            if ("datasourcePoint".equals(extensionPoint)) {
                datasourceBean = ((DatasourceExtensionDescriptor) contribution).getValue();
            }
        }
    }
}
