package com.lm.livemanage.controller;

import com.lm.livemanage.model.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 推流/拉流通知
 *
 * @author honggang.liu
 */
@RestController
public class NotifyController {

    /**
     * server启动通知
     *
     * @param lmInfo
     * @return
     */
    @PostMapping("/on_server_start")
    public String onServerStart(@RequestBody LmInfo lmInfo) {
        System.out.println(lmInfo);
        return "";
    }

    /**
     * 会话更新通知
     *
     * @param updateInfo
     * @return
     */
    @PostMapping("/on_update")
    public String onUpdate(@RequestBody UpdateInfo updateInfo) {
        System.out.println(updateInfo);
        return "";
    }

    /**
     * 开始推流通知
     *
     * @return
     */
    @PostMapping("/on_pub_start")
    @ResponseBody
    public String onPubStart(@RequestBody PubStartInfo pubStartInfo) {
        System.out.println(pubStartInfo);
        return "";
    }

    /**
     * 停止推流通知
     *
     * @return
     */
    @PostMapping("/on_pub_stop")
    public String onPubStop(@RequestBody PubStartInfo pubStartInfo) {
        System.out.println(pubStartInfo);
        return "";
    }

    /**
     * 开始拉流通知
     *
     * @return
     */
    @PostMapping("/on_sub_start")
    public String onSubStart(@RequestBody SubStartInfo subStartInfo) {
        System.out.println(subStartInfo);
        return "";
    }

    /**
     * 停止拉流通知
     *
     * @return
     */
    @PostMapping("/on_sub_stop")
    public String onSubStop(SubStopInfo subStopInfo) {
        System.out.println(subStopInfo);
        return "";
    }

    /**
     * 转发拉流开始
     *
     * @return
     */
    @PostMapping("/on_relay_pull_start")
    public String onRelayPullStart(@RequestBody PullStartInfo pullStartInfo) {
        System.out.println(pullStartInfo);
        return "";
    }

    /**
     * 停止转发拉流
     *
     * @return
     */
    @PostMapping("/on_relay_pull_stop")
    public String onRelayPullStop(@RequestBody PullStopInfo pullStopInfo) {
        System.out.println(pullStopInfo);
        return "";
    }

    /**
     * rtmp建连通知
     *
     * @return
     */
    @PostMapping("/on_rtmp_connect")
    public String onRtmpConnect(@RequestBody RtmpConnectInfo rtmpConnectInfo) {
        System.out.println(rtmpConnectInfo);
        return "";
    }

    /**
     * hls创建ts通知
     *
     * @return
     */
    @PostMapping("/on_hls_make_ts")
    public String onHlsMakeTs(@RequestBody HlsMakeTsInfo hlsMakeTsInfo) {
        System.out.println(hlsMakeTsInfo);
        return "";
    }
}
