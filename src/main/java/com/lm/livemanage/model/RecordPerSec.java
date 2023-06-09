package com.lm.livemanage.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 每秒记录数
 *
 * @author honggang.liu
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RecordPerSec implements Serializable {
    /**
     * unix秒
     */
    @JsonProperty("unix_sec")
    private long unixSec;
    @JsonProperty("v")
    private int v;
}
