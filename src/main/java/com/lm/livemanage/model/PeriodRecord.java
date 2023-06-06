package com.lm.livemanage.model;

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
public class PeriodRecord implements Serializable {
    private RecordPerSec[] ringBuf;
    private int nRecord;
}
