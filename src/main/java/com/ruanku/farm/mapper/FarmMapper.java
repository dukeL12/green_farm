package com.ruanku.farm.mapper;


import com.github.pagehelper.Page;
import com.ruanku.farm.pojo.Farm;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


/**
 * @author dalaoyang
 * @Description
 * @project springboot_learn
 * @package com.dalaoyang.dao
 * @email 397600342@qq.com
 * @date 2018/6/22
 */
@Mapper
public interface FarmMapper {

    Page<Farm> find_farm();
    Page<Farm> find_farmByName(String searchByName);
    List<Farm> find_farmById(int farm_id);
}

