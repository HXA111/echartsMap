package org.example.dao;

import org.apache.ibatis.annotations.Param;
import org.example.vo.cityStu;

import java.util.ArrayList;

public interface ICityStuDAO {
    //查询t_cityStu表，将数据以数组返回
    public ArrayList<cityStu> get();
}
