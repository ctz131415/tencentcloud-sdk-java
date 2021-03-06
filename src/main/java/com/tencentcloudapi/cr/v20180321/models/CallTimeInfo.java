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
package com.tencentcloudapi.cr.v20180321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CallTimeInfo extends AbstractModel{

    /**
    * 产品开始拨打时间，HHmmss格式
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 产品结束拨打时间，HHmmss格式
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get 产品开始拨打时间，HHmmss格式 
     * @return StartTime 产品开始拨打时间，HHmmss格式
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 产品开始拨打时间，HHmmss格式
     * @param StartTime 产品开始拨打时间，HHmmss格式
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 产品结束拨打时间，HHmmss格式 
     * @return EndTime 产品结束拨打时间，HHmmss格式
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 产品结束拨打时间，HHmmss格式
     * @param EndTime 产品结束拨打时间，HHmmss格式
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

