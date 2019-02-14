package com.glmapper.bridge.datasource;

/**
 * @author: guolei.sgl (guolei.sgl@antfin.com) 2019/2/13 10:45 PM
 * @since:
 **/
public interface DatasourceExtension {
    /**
     * 获取数据源 Bean 实例
     * @return
     */
    DatasourceBean getDatasourceBean();
}
