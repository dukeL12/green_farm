package com.ruanku.farm.service;

import com.github.pagehelper.Page;
import com.ruanku.farm.pojo.Farm;

import java.util.List;

public interface FarmServiceInter {
    Page<Farm> find_farm();
    Page<Farm> find_farmByName(String searchByName);
    List<Farm> find_farmById(int farm_id);
}
