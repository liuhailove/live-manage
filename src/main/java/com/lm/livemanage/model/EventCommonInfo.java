package com.lm.livemanage.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 所有事件共有的字段
 *
 * @author honggang.liu
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EventCommonInfo implements Serializable {
    /**
     * 服务ID
     */
    @JsonProperty("server_id")
    private String serverId;
}
