package com.area.service.impl;

import com.area.common.AreaLevelEnum;
import com.area.dao.AreaRepository;
import com.area.entity.AreaEntity;
import com.area.model.Area;
import com.area.service.AreaService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class AreaServiceImpl implements AreaService {

    @Autowired
    private AreaRepository areaRepository;

    @Override
    public List<Area> findProvince() {
        List<AreaEntity> all = areaRepository.findByAreaLevel(AreaLevelEnum.PROVINCE.getAreaLevel());
        List<Area> areaList=new ArrayList<>();
        if(all!=null&&!all.isEmpty()){
            all.stream().forEach(areaEntity -> {
                Area area=new Area();
                BeanUtils.copyProperties(areaEntity,area);
                areaList.add(area);
            });
            return areaList;
        }
        return null;
    }
}
