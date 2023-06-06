package com.lm.livemanage.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * session相关的事件的共有的字段
 *
 * @author honggang.liu
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class SessionEventCommonInfo extends EventCommonInfo implements Serializable {

    /**
     * 会话ID
     */
    @JsonProperty("session_id")
    private String sessionId;
    /**
     * 协议
     */
    @JsonProperty("protocol")
    private String protocol;
    /**
     * 类型
     */
    @JsonProperty("base_type")
    private String baseType;
    /**
     * 远程地址
     */
    @JsonProperty("remote_addr")
    private String remoteAddr;

    /**
     * url
     */
    @JsonProperty("url")
    private String url;
    /**
     * app name
     */
    @JsonProperty("app_name")
    private String appName;
    /**
     * 流name
     */
    @JsonProperty("stream_name")
    private String streamName;
    /**
     * url参数
     */
    @JsonProperty("url_param")
    private String urlParam;

    /**
     * 是否在会话中
     */
    @JsonProperty("has_in_session")
    private boolean hasInSession;
    /**
     * 是否已经离开会话
     */
    @JsonProperty("has_out_session")
    private String hasOutSession;

    /**
     * 读字节数
     */
    @JsonProperty("read_bytes_sum")
    private long readBytesSum;
    /**
     * 写字节数
     */
    @JsonProperty("write_bytes_sum")
    private long writeBytesSum;

}
