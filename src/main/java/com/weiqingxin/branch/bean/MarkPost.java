package com.weiqingxin.branch.bean;

import lombok.Data;

/**
 * @ClassName   : MarkPost
 * @Description : 标记颜色
 * @Author      : bruce
 * @Date        : 2020-02-25 15:02
 */
@Data
public class MarkPost {
    private String  cardid;     //卡号
    private Long    truecardid; //真卡号
    private Integer origcolour; //原来的颜色
    private Long    pointid;    //采集点（可以为空）
    private Integer colour;     //修改后颜色

    private String longitude;   //经度
    private String latitude;    //纬度

    private String record;      //修改数据

    private String captcha;     //短信验证码
    private String mobile;      //短信验证码
}