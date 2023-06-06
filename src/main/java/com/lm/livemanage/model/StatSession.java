package com.lm.livemanage.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author honggang.liu
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StatSession implements Serializable {
    @JsonProperty("session_id")
    private String sessionId;
    @JsonProperty("protocol")
    private String protocol;
    @JsonProperty("base_type")
    private String baseType;
    @JsonProperty("remote_addr")
    private String remoteAddr;
    @JsonProperty("start_time")
    private String startTime;
    @JsonProperty("read_bytes_sum")
    private long readBytesSum;
    @JsonProperty("wrote_bytes_sum")
    private long wroteBytesSum;
    @JsonProperty("bitrate_kbits")
    private int bitrateKbits;
    @JsonProperty("read_bitrate_kbits")
    private int readBitrateKbits;
    @JsonProperty("write_bitrate_kbits")
    private int writeBitrateKbits;

    private SessionType typ;
}
