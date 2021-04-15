package com.naxiang.findcode.mapper;

import com.naxiang.findcode.vo.MasterVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MasterMapper {
    List<MasterVO> getMasterByCode(String masterCode);
}
