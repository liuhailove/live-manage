package com.lm.livemanage.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * 所有事件共有的字段
 *
 * @author honggang.liu
 */
public class EventCommonInfo implements Serializable {
    /**
     * 服务ID
     */
    private String serverId;
}
