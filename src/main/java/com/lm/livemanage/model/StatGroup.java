package com.lm.livemanage.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * 统计Group
 *
 * @author honggang.liu
 */
@Data
@AllArgsConstructor
public class StatGroup implements Serializable {

    @JsonProperty("stream_name")
    private String streamName;
    @JsonProperty("app_name")
    private String appName;
    @JsonProperty("audio_codec")
    private String audioCodec;
    @JsonProperty("video_codec")
    private String videoCodec;
    @JsonProperty("video_width")
    private int videoWidth;
    @JsonProperty("video_height")
    private int videoHeight;
    @JsonProperty("pub")
    private StatPub statPub;
    @JsonProperty("subs")
    private StatSub[] statSubs;
    @JsonProperty("pull")
    private StatPull statPull;

    @JsonProperty("in_frame_per_sec")
    private RecordPerSec[] fps;

}
