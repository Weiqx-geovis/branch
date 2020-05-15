package com.weiqingxin.branch.bean;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

/**
 * 请求用户反馈参数
 */
@Data
@FieldDefaults(level = AccessLevel.PUBLIC)
public class FeedRequest {

//    userid	string	用户ID	√	用户唯一标识
//    version	string	应用版本号
//    ip	string	客户端ip		若果客户端获取不到公网IP，可留空，由反馈H5侧获取
//    hardware	string	机型
//    os	string	系统版本
//    net	string	网络类型		1:wifi;2:2g;3:3g4:4g,未知的留空
//    imei	string	设备标识
//    deviceId	string	GUID
//    brand	string	厂商
//    root	string	是否已root		Android特有 0未知 1yes 2no
//    timestamp	string	时间戳		单位：毫秒

    String userid;
    String version;
    String ip;
    String hardware;
    String os;
    String net;
    String imei;
    String deviceId;
    String brand;
    String root;
    String timestamp;

}
