package com.lm.livemanage.model;

import java.io.Serializable;

/**
 * 每秒记录数
 * @author honggang.liu
 */
public class RecordPerSec implements Serializable {
    /**
     * unix秒
     */
    private long unixSec;
    private int v;

    public long getUnixSec() {
        return unixSec;
    }

    public void setUnixSec(long unixSec) {
        this.unixSec = unixSec;
    }

    public int getV() {
        return v;
    }

    public void setV(int v) {
        this.v = v;
    }
}
