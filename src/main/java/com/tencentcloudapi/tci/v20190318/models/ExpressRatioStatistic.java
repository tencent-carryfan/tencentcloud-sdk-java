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

public class ExpressRatioStatistic  extends AbstractModel{

    /**
    * 表情
    */
    @SerializedName("Express")
    @Expose
    private String Express;

    /**
    * 表情所占比例
    */
    @SerializedName("Ratio")
    @Expose
    private Float Ratio;

    /**
    * 出现次数
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
     * 获取表情
     * @return Express 表情
     */
    public String getExpress() {
        return this.Express;
    }

    /**
     * 设置表情
     * @param Express 表情
     */
    public void setExpress(String Express) {
        this.Express = Express;
    }

    /**
     * 获取表情所占比例
     * @return Ratio 表情所占比例
     */
    public Float getRatio() {
        return this.Ratio;
    }

    /**
     * 设置表情所占比例
     * @param Ratio 表情所占比例
     */
    public void setRatio(Float Ratio) {
        this.Ratio = Ratio;
    }

    /**
     * 获取出现次数
     * @return Count 出现次数
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * 设置出现次数
     * @param Count 出现次数
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Express", this.Express);
        this.setParamSimple(map, prefix + "Ratio", this.Ratio);
        this.setParamSimple(map, prefix + "Count", this.Count);

    }
}

