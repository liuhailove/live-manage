package com.lm.livemanage.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 更新信息
 *
 * @author honggang.liu
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateInfo extends EventCommonInfo {

    /**
     * 组统计
     */
    @JsonProperty("groups")
    private StatGroup []groups;
}
