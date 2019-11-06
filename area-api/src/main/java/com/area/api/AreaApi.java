package com.area.api;

import com.area.model.Area;

import java.util.List;

/**
 * 区域查询API
 */
public interface AreaApi {
    /**
     * 查询所有的省
     * @return
     */
    List<Area> findProvince();
}
