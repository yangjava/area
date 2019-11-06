package com.area.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "common_area")
@Data
public class AreaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer areaCode;

    private String areaName;

    private Integer areaLevel;

    private Integer parentCode;

    private String areaDesc;

}
