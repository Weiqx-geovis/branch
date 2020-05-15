package com.weiqingxin.branch.bean;

import com.tsit.hljwyj.mapper.entity.PointStat;

/**
 * @ClassName : PointResponse
 * @Description : 采集点返回
 * @Author : bruce
 * @Date : 2020-02-28 05:32
 */
public class PointResponse {
    private String pointId;
    private String name;

    private PointStat pointStat;


    public PointResponse(String pointId, String name, PointStat pointStat) {
        this.pointId   = pointId;
        this.name      = name;
        this.pointStat = pointStat;
    }
}