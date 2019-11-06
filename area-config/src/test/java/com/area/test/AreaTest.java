package com.area.test;

import com.area.AreaApplication;
import com.area.api.AreaApi;
import com.area.model.Area;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest(classes = AreaApplication.class)
@RunWith(SpringRunner.class)
public class AreaTest {

    public static final Logger LOGGER = LoggerFactory.getLogger(AreaTest.class);

    @Autowired
    AreaApi areaApi;

    @Test
    public void findAllProvince(){
        List<Area> provinces = areaApi.findProvince();
        provinces.forEach(e-> System.out.println(e));
    }
}
