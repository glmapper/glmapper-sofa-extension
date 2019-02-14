package com.glmapper.bridge.custom;

import com.glmapper.bridge.datasource.DatasourceBean;

/**
 * @author: guolei.sgl (guolei.sgl@antfin.com) 2019/2/13 10:55 PM
 * @since:
 **/
public class OracleDatasourceBean implements DatasourceBean {
    @Override
    public void getDatasource() {
        System.out.println("oracle datasource");
    }
}
