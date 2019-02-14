package com.glmapper.bridge.datasource;

/**
 * @author: guolei.sgl (guolei.sgl@antfin.com) 2019/2/13 10:49 PM
 * @since:
 **/
public class DefaultDataSourceBean implements DatasourceBean {
    @Override
    public void getDatasource() {
        System.out.println("mysql datasource");
    }
}
