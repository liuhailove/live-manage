package com.lm.livemanage.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author honggang.liu
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HlsMakeTsInfo extends EventCommonInfo {
    private String event;
    private String streamName;
    private String cwd;
    private String tsFile;
    private String liveM3u8File;
    private String recordM3u8File;
    private int id;
    private float duration;
}
