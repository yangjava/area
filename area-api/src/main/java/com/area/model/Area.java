package com.area.model;

public class Area {

    private Integer areaCode;

    private String areaName;

    private Integer areaLevel;

    private Integer parentCode;

    private String areaDesc;

    public Integer getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(Integer areaCode) {
        this.areaCode = areaCode;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public Integer getAreaLevel() {
        return areaLevel;
    }

    public void setAreaLevel(Integer areaLevel) {
        this.areaLevel = areaLevel;
    }

    public Integer getParentCode() {
        return parentCode;
    }

    public void setParentCode(Integer parentCode) {
        this.parentCode = parentCode;
    }

    public String getAreaDesc() {
        return areaDesc;
    }

    public void setAreaDesc(String areaDesc) {
        this.areaDesc = areaDesc;
    }

    @Override
    public String toString() {
        return "Area{" +
                "areaCode=" + areaCode +
                ", areaName='" + areaName + '\'' +
                ", areaLevel=" + areaLevel +
                ", parentCode=" + parentCode +
                ", areaDesc='" + areaDesc + '\'' +
                '}';
    }
}
