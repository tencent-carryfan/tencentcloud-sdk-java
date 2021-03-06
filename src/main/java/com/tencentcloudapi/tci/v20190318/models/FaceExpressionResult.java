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

public class FaceExpressionResult  extends AbstractModel{

    /**
    * 表情置信度
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * 表情识别结果
    */
    @SerializedName("Expression")
    @Expose
    private String Expression;

    /**
     * 获取表情置信度
     * @return Confidence 表情置信度
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * 设置表情置信度
     * @param Confidence 表情置信度
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * 获取表情识别结果
     * @return Expression 表情识别结果
     */
    public String getExpression() {
        return this.Expression;
    }

    /**
     * 设置表情识别结果
     * @param Expression 表情识别结果
     */
    public void setExpression(String Expression) {
        this.Expression = Expression;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamSimple(map, prefix + "Expression", this.Expression);

    }
}

