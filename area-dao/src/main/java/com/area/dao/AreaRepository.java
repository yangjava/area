package com.area.dao;

import com.area.entity.AreaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AreaRepository extends JpaRepository<AreaEntity,Integer> {

    List<AreaEntity> findByAreaLevel(Integer areaLevel);

}
