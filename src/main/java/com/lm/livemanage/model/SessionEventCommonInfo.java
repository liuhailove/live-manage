package com.lm.livemanage.model;

import org.apache.tomcat.util.net.openssl.ciphers.Protocol;
import sun.reflect.generics.tree.BaseType;

import java.io.Serializable;

/**
 * session相关的事件的共有的字段
 *
 * @author honggang.liu
 */
public class SessionEventCommonInfo implements Serializable {

    /**
     * 服务ID
     */
    private String serverId;

    /**
     * 会话ID
     */
    private String sessionId;
    /**
     * 协议
     */
    private String protocol;
    /**
     * 类型
     */
    private String baseType;
    /**
     *  远程地址
     */
    private String remoteAddr;

    /**
     * url
     */
    private String url;
    /**
     * app name
     */
    private String appName;
    /**
     * 流name
     */
    private String streamName;
    /**
     * url参数
     */
    private String urlParam;

    /**
     * 是否在会话中
     */
    private boolean hasInSession;
    /**
     * 是否已经离开会话
     */
    private String hasOutSession;

    /**
     * 读字节数
     */
    private long readBytesSum;
    /**
     * 写字节数
     */
    private long writeBytesSum;

    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getBaseType() {
        return baseType;
    }

    public void setBaseType(String baseType) {
        this.baseType = baseType;
    }

    public String getRemoteAddr() {
        return remoteAddr;
    }

    public void setRemoteAddr(String remoteAddr) {
        this.remoteAddr = remoteAddr;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getStreamName() {
        return streamName;
    }

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    public String getUrlParam() {
        return urlParam;
    }

    public void setUrlParam(String urlParam) {
        this.urlParam = urlParam;
    }

    public boolean isHasInSession() {
        return hasInSession;
    }

    public void setHasInSession(boolean hasInSession) {
        this.hasInSession = hasInSession;
    }

    public String getHasOutSession() {
        return hasOutSession;
    }

    public void setHasOutSession(String hasOutSession) {
        this.hasOutSession = hasOutSession;
    }

    public long getReadBytesSum() {
        return readBytesSum;
    }

    public void setReadBytesSum(long readBytesSum) {
        this.readBytesSum = readBytesSum;
    }

    public long getWriteBytesSum() {
        return writeBytesSum;
    }

    public void setWriteBytesSum(long writeBytesSum) {
        this.writeBytesSum = writeBytesSum;
    }
}
