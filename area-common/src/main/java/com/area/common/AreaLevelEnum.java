package com.area.common;

/**
 * 基本枚举类型
 * 省 PROVINCE
 * 市 CITY
 * 区 DISTRICT
 */
public enum AreaLevelEnum {
    PROVINCE(1),CITY(2),DISTRICT(3);

    private Integer areaLevel;

    AreaLevelEnum(Integer areaLevel) {
        this.areaLevel = areaLevel;
    }

    public Integer getAreaLevel() {
        return areaLevel;
    }

    public void setAreaLevel(Integer areaLevel) {
        this.areaLevel = areaLevel;
    }}
