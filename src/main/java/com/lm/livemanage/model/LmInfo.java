package com.lm.livemanage.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * live-mall 信息
 *
 * @author honggang.liu
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LmInfo implements Serializable {
    /**
     * server id
     */
    @JsonProperty("server_id")
    private String serverId;
    @JsonProperty("bin_info")
    private String binInfo;
    /**
     * live mall 版本
     */
    @JsonProperty("lm_version")
    private String lmVersion;
    /**
     * api版本
     */
    @JsonProperty("api_version")
    private String apiVersion;
    /**
     * notify版本
     */
    @JsonProperty("notify_version")
    private String notifyVersion;
    /**
     * web ui版本
     */
    @JsonProperty("web_ui_version")
    private String webUiVersion;
    /**
     * 开始时间
     */
    @JsonProperty("start_time")
    private String startTime;
}
