package com.example.zyp.springboot.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @ Author     ：ZYP
 * @ Date       ：Created in 18:00 2018/8/3
 * @ Description：${description}
 * @ Modified By：
 * @Version: $version$
 */
@Mapper
public interface ChartPstatistics {

    @Select("SELECT * FROM cod_order")
    List<ChartPstatistics> fiadAll();
}
