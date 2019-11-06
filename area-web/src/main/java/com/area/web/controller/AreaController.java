package com.area.web.controller;

import com.area.model.Area;
import com.area.service.AreaService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class AreaController {

    private AreaService areaService;

    @GetMapping("/findProvince")
    public String findProvince(){
        List<Area> province = areaService.findProvince();
        return "SUCCESS";
    }
}
