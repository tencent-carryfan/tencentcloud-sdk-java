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
package com.tencentcloudapi.tci.v20190318.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WordTimePair  extends AbstractModel{

    /**
    * 单词的起始时间
    */
    @SerializedName("Mbtm")
    @Expose
    private Long Mbtm;

    /**
    * 	单词的结束时间
    */
    @SerializedName("Metm")
    @Expose
    private Long Metm;

    /**
     * 获取单词的起始时间
     * @return Mbtm 单词的起始时间
     */
    public Long getMbtm() {
        return this.Mbtm;
    }

    /**
     * 设置单词的起始时间
     * @param Mbtm 单词的起始时间
     */
    public void setMbtm(Long Mbtm) {
        this.Mbtm = Mbtm;
    }

    /**
     * 获取	单词的结束时间
     * @return Metm 	单词的结束时间
     */
    public Long getMetm() {
        return this.Metm;
    }

    /**
     * 设置	单词的结束时间
     * @param Metm 	单词的结束时间
     */
    public void setMetm(Long Metm) {
        this.Metm = Metm;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Mbtm", this.Mbtm);
        this.setParamSimple(map, prefix + "Metm", this.Metm);

    }
}

