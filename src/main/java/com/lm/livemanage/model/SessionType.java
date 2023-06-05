package com.lm.livemanage.model;

/**
 * 会话类型
 *
 * @author honggang.liu
 */
public class SessionType {

    private int val;

    private SessionType(int i) {
        this.val = i;
    }

    public static final SessionType SessionTypeCustomizePub = new SessionType(SessionType.SessionProtocolCustomize << 8 | SessionType.SessionBaseTypePub);
    public static final SessionType SessionTypeRtmpServerSession = new SessionType(SessionType.SessionProtocolRtmp << 8 | SessionType.SessionBaseTypePubSub);
    public static final SessionType SessionTypeRtmpPush = new SessionType(SessionType.SessionProtocolRtmp << 8 | SessionType.SessionBaseTypePush);
    public static final SessionType SessionTypeRtmpPull = new SessionType(SessionType.SessionProtocolRtmp << 8 | SessionType.SessionBaseTypePull);
    public static final SessionType SessionTypeRtspPub = new SessionType(SessionType.SessionProtocolRtsp << 8 | SessionType.SessionBaseTypePub);
    public static final SessionType SessionTypeRtspSub = new SessionType(SessionType.SessionProtocolRtsp << 8 | SessionType.SessionBaseTypeSub);
    public static final SessionType SessionTypeRtspPush = new SessionType(SessionType.SessionProtocolRtsp << 8 | SessionType.SessionBaseTypePush);
    public static final SessionType SessionTypeRtspPull = new SessionType(SessionType.SessionProtocolRtsp << 8 | SessionType.SessionBaseTypePull);
    public static final SessionType SessionTypeFlvSub = new SessionType(SessionType.SessionProtocolFlv << 8 | SessionType.SessionBaseTypeSub);
    public static final SessionType SessionTypeFlvPull = new SessionType(SessionType.SessionProtocolFlv << 8 | SessionType.SessionBaseTypePull);
    public static final SessionType SessionTypeTsSub = new SessionType(SessionType.SessionProtocolTs << 8 | SessionType.SessionBaseTypeSub);
    public static final SessionType SessionTypePsPub = new SessionType(SessionType.SessionProtocolPs << 8 | SessionType.SessionBaseTypePub);
    public static final SessionType SessionTypeHlsSub = new SessionType(SessionType.SessionProtocolHls << 8 | SessionType.SessionBaseTypeSub);


    public static final int SessionProtocolCustomize = 1;
    public static final int SessionProtocolRtmp = 2;
    public static final int SessionProtocolRtsp = 3;
    public static final int SessionProtocolFlv = 4;
    public static final int SessionProtocolTs = 5;
    public static final int SessionProtocolPs = 6;
    public static final int SessionProtocolHls = 7;

    public static final int SessionBaseTypePubSub = 1;
    public static final int SessionBaseTypePub = 2;
    public static final int SessionBaseTypeSub = 3;
    public static final int SessionBaseTypePush = 4;
    public static final int SessionBaseTypePull = 5;

    public static final String SessionProtocolCustomizeStr = "CUSTOMIZE";
    public static final String SessionProtocolRtmpStr = "RTMP";
    public static final String SessionProtocolRtspStr = "RTSP";
    public static final String SessionProtocolFlvStr = "FLV";
    public static final String SessionProtocolTsStr = "TS";
    public static final String SessionProtocolPsStr = "PS";
    public static final String SessionProtocolHlsStr = "HLS";

    public static final String SessionBaseTypePubSubStr = "PUBSUB";
    public static final String SessionBaseTypePubStr = "PUB";
    public static final String SessionBaseTypeSubStr = "SUB";
    public static final String SessionBaseTypePushStr = "PUSH";
    public static final String SessionBaseTypePullStr = "PULL";
}
