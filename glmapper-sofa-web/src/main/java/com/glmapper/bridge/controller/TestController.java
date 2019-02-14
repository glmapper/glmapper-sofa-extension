/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.glmapper.bridge.controller;
import com.alipay.sofa.runtime.api.annotation.SofaReference;
import com.glmapper.bridge.datasource.DatasourceExtension;
import com.glmapper.bridge.extension.IExtension;
import com.glmapper.bridge.service.SampleJvmService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * @author: guolei.sgl (guolei.sgl@antfin.com) 2019/2/13 11:52 AM
 * @since:
 **/
@RestController
public class TestController {

    @SofaReference
    private SampleJvmService sampleJvmService;

    @SofaReference
    private IExtension extension;
    @SofaReference
    DatasourceExtension datasourceExtension;

    @RequestMapping("/extension")
    public String annotationImplService() throws IOException {
        String say = extension.say();
        extension.getSimpleSpringBean().test();
        System.out.println(say);
        System.out.println( extension.getSimpleSpringBean().test());

        datasourceExtension.getDatasourceBean().getDatasource();

        return sampleJvmService.hello();
    }

}
