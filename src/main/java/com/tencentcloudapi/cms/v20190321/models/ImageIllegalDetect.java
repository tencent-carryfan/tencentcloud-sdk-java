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
package com.tencentcloudapi.cms.v20190321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageIllegalDetect  extends AbstractModel{

    /**
    * 恶意类型
100：正常 
20001：政治
20002：色情 
20006：涉毒违法
20007：谩骂 
24001：暴恐
21000：综合
    */
    @SerializedName("EvilType")
    @Expose
    private Long EvilType;

    /**
    * 处置判定 0：正常 1：可疑
    */
    @SerializedName("HitFlag")
    @Expose
    private Long HitFlag;

    /**
    * 关键词明细
    */
    @SerializedName("Keywords")
    @Expose
    private String [] Keywords;

    /**
    * 违法标签：返回违法特征中文描述，如赌桌，枪支
    */
    @SerializedName("Labels")
    @Expose
    private String [] Labels;

    /**
    * 违法分：分值范围 0-100，分数越高违法倾向越明显
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
     * 获取恶意类型
100：正常 
20001：政治
20002：色情 
20006：涉毒违法
20007：谩骂 
24001：暴恐
21000：综合
     * @return EvilType 恶意类型
100：正常 
20001：政治
20002：色情 
20006：涉毒违法
20007：谩骂 
24001：暴恐
21000：综合
     */
    public Long getEvilType() {
        return this.EvilType;
    }

    /**
     * 设置恶意类型
100：正常 
20001：政治
20002：色情 
20006：涉毒违法
20007：谩骂 
24001：暴恐
21000：综合
     * @param EvilType 恶意类型
100：正常 
20001：政治
20002：色情 
20006：涉毒违法
20007：谩骂 
24001：暴恐
21000：综合
     */
    public void setEvilType(Long EvilType) {
        this.EvilType = EvilType;
    }

    /**
     * 获取处置判定 0：正常 1：可疑
     * @return HitFlag 处置判定 0：正常 1：可疑
     */
    public Long getHitFlag() {
        return this.HitFlag;
    }

    /**
     * 设置处置判定 0：正常 1：可疑
     * @param HitFlag 处置判定 0：正常 1：可疑
     */
    public void setHitFlag(Long HitFlag) {
        this.HitFlag = HitFlag;
    }

    /**
     * 获取关键词明细
     * @return Keywords 关键词明细
     */
    public String [] getKeywords() {
        return this.Keywords;
    }

    /**
     * 设置关键词明细
     * @param Keywords 关键词明细
     */
    public void setKeywords(String [] Keywords) {
        this.Keywords = Keywords;
    }

    /**
     * 获取违法标签：返回违法特征中文描述，如赌桌，枪支
     * @return Labels 违法标签：返回违法特征中文描述，如赌桌，枪支
     */
    public String [] getLabels() {
        return this.Labels;
    }

    /**
     * 设置违法标签：返回违法特征中文描述，如赌桌，枪支
     * @param Labels 违法标签：返回违法特征中文描述，如赌桌，枪支
     */
    public void setLabels(String [] Labels) {
        this.Labels = Labels;
    }

    /**
     * 获取违法分：分值范围 0-100，分数越高违法倾向越明显
     * @return Score 违法分：分值范围 0-100，分数越高违法倾向越明显
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * 设置违法分：分值范围 0-100，分数越高违法倾向越明显
     * @param Score 违法分：分值范围 0-100，分数越高违法倾向越明显
     */
    public void setScore(Long Score) {
        this.Score = Score;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EvilType", this.EvilType);
        this.setParamSimple(map, prefix + "HitFlag", this.HitFlag);
        this.setParamArraySimple(map, prefix + "Keywords.", this.Keywords);
        this.setParamArraySimple(map, prefix + "Labels.", this.Labels);
        this.setParamSimple(map, prefix + "Score", this.Score);

    }
}

