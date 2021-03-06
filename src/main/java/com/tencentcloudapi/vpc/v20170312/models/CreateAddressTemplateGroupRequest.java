/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAddressTemplateGroupRequest  extends AbstractModel{

    /**
    * IP地址模版集合名称。
    */
    @SerializedName("AddressTemplateGroupName")
    @Expose
    private String AddressTemplateGroupName;

    /**
    * IP地址模版实例ID，例如：ipm-mdunqeb6。
    */
    @SerializedName("AddressTemplateIds")
    @Expose
    private String [] AddressTemplateIds;

    /**
     * 获取IP地址模版集合名称。
     * @return AddressTemplateGroupName IP地址模版集合名称。
     */
    public String getAddressTemplateGroupName() {
        return this.AddressTemplateGroupName;
    }

    /**
     * 设置IP地址模版集合名称。
     * @param AddressTemplateGroupName IP地址模版集合名称。
     */
    public void setAddressTemplateGroupName(String AddressTemplateGroupName) {
        this.AddressTemplateGroupName = AddressTemplateGroupName;
    }

    /**
     * 获取IP地址模版实例ID，例如：ipm-mdunqeb6。
     * @return AddressTemplateIds IP地址模版实例ID，例如：ipm-mdunqeb6。
     */
    public String [] getAddressTemplateIds() {
        return this.AddressTemplateIds;
    }

    /**
     * 设置IP地址模版实例ID，例如：ipm-mdunqeb6。
     * @param AddressTemplateIds IP地址模版实例ID，例如：ipm-mdunqeb6。
     */
    public void setAddressTemplateIds(String [] AddressTemplateIds) {
        this.AddressTemplateIds = AddressTemplateIds;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AddressTemplateGroupName", this.AddressTemplateGroupName);
        this.setParamArraySimple(map, prefix + "AddressTemplateIds.", this.AddressTemplateIds);

    }
}

