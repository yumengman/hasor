/*
 * Copyright 2008-2009 the original 赵永春(zyc@hasor.net).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.hasor.rsf.runtime;
import net.hasor.rsf.metadata.ServiceMetaData;
/**
 * 注册中心
 * @version : 2014年11月30日
 * @author 赵永春(zyc@hasor.net)
 */
public interface RegisterCenter {
    /**获取RsfBinder*/
    public RsfBinder getRsfBinder();
    //
    /**获取元信息所描述的服务对象。*/
    public Object getBean(ServiceMetaData metaData);
    /**根据服务名获取服务描述。*/
    public ServiceMetaData getService(String name, String group, String version);
    /**获取服务上配置有效的过滤器。*/
    public RsfFilter[] getRsfFilters(ServiceMetaData metaData);
    /**获取已经注册的所有服务名称。*/
    public String[] getServiceNames();
}