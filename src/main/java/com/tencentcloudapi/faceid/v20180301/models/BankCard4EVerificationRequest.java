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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BankCard4EVerificationRequest  extends AbstractModel{

    /**
    * 姓名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 银行卡
    */
    @SerializedName("BankCard")
    @Expose
    private String BankCard;

    /**
    * 手机号码
    */
    @SerializedName("Phone")
    @Expose
    private String Phone;

    /**
    * 身份证号码
    */
    @SerializedName("IdCard")
    @Expose
    private String IdCard;

    /**
    * 证件类型，请确认该证件为开户时使用的证件类型，未用于开户的证件信息不支持验证。（不填默认0）
0 身份证
1 军官证
2 护照
3 港澳证
4 台胞证
5 警官证
6 士兵证
7 其它证件
    */
    @SerializedName("CertType")
    @Expose
    private Integer CertType;

    /**
     * 获取姓名
     * @return Name 姓名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * 设置姓名
     * @param Name 姓名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 获取银行卡
     * @return BankCard 银行卡
     */
    public String getBankCard() {
        return this.BankCard;
    }

    /**
     * 设置银行卡
     * @param BankCard 银行卡
     */
    public void setBankCard(String BankCard) {
        this.BankCard = BankCard;
    }

    /**
     * 获取手机号码
     * @return Phone 手机号码
     */
    public String getPhone() {
        return this.Phone;
    }

    /**
     * 设置手机号码
     * @param Phone 手机号码
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    /**
     * 获取身份证号码
     * @return IdCard 身份证号码
     */
    public String getIdCard() {
        return this.IdCard;
    }

    /**
     * 设置身份证号码
     * @param IdCard 身份证号码
     */
    public void setIdCard(String IdCard) {
        this.IdCard = IdCard;
    }

    /**
     * 获取证件类型，请确认该证件为开户时使用的证件类型，未用于开户的证件信息不支持验证。（不填默认0）
0 身份证
1 军官证
2 护照
3 港澳证
4 台胞证
5 警官证
6 士兵证
7 其它证件
     * @return CertType 证件类型，请确认该证件为开户时使用的证件类型，未用于开户的证件信息不支持验证。（不填默认0）
0 身份证
1 军官证
2 护照
3 港澳证
4 台胞证
5 警官证
6 士兵证
7 其它证件
     */
    public Integer getCertType() {
        return this.CertType;
    }

    /**
     * 设置证件类型，请确认该证件为开户时使用的证件类型，未用于开户的证件信息不支持验证。（不填默认0）
0 身份证
1 军官证
2 护照
3 港澳证
4 台胞证
5 警官证
6 士兵证
7 其它证件
     * @param CertType 证件类型，请确认该证件为开户时使用的证件类型，未用于开户的证件信息不支持验证。（不填默认0）
0 身份证
1 军官证
2 护照
3 港澳证
4 台胞证
5 警官证
6 士兵证
7 其它证件
     */
    public void setCertType(Integer CertType) {
        this.CertType = CertType;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "BankCard", this.BankCard);
        this.setParamSimple(map, prefix + "Phone", this.Phone);
        this.setParamSimple(map, prefix + "IdCard", this.IdCard);
        this.setParamSimple(map, prefix + "CertType", this.CertType);

    }
}

