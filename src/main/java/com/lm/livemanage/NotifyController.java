package com.lm.livemanage;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 推流/拉流通知
 *
 * @author honggang.liu
 */
@RestController
public class NotifyController {


    @PostMapping("/on_update")
    public String onUpdate() {
        return "";
    }

    /**
     * 开始推流通知
     *
     * @return
     */
    @PostMapping("/on_pub_start")
    public String onPubStart() {
        return "";
    }

    /**
     * 停止推流通知
     *
     * @return
     */
    @PostMapping("/on_pub_stop")
    public String onPubStop() {
        return "";
    }

    /**
     * 开始拉流通知
     *
     * @return
     */
    @PostMapping("/on_sub_start")
    public String onSubStart() {
        return "";
    }

    /**
     * 停止拉流通知
     *
     * @return
     */
    @PostMapping("/on_sub_stop")
    public String onSubStop() {
        return "";
    }

    /**
     * 转发拉流开始
     *
     * @return
     */
    @PostMapping("/on_relay_pull_start")
    public String onRelayPullStart() {
        return "";
    }

    /**
     * 停止转发拉流
     *
     * @return
     */
    @PostMapping("/on_relay_pull_stop")
    public String onRelayPullStop() {
        return "";
    }

    /**
     * rtmp建连通知
     *
     * @return
     */
    @PostMapping("/on_rtmp_connect")
    public String onRtmpConnect() {
        return "";
    }

    /**
     * 服务启动通知
     *
     * @return
     */
    @PostMapping("/on_server_start")
    public String onServerStart() {
        return "";
    }

    /**
     * hls创建ts通知
     *
     * @return
     */
    @PostMapping("/on_hls_make_ts")
    public String onHlsMakeTs() {
        return "";
    }
}
