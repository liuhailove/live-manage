package com.lm.livemanage.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author honggang.liu
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RtmpConnectInfo extends EventCommonInfo {

    @JsonProperty("session_id")
    private String sessionId;
    @JsonProperty("remote_addr")
    private String remoteAddr;
    @JsonProperty("app")
    private String app;
    @JsonProperty("flash_ver")
    private String flashVer;
    @JsonProperty("tc_url")
    private String tcUrl;
}
