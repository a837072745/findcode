package com.naxiang.findcode.service;

import com.naxiang.findcode.mapper.MasterMapper;
import com.naxiang.findcode.vo.MasterVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MasterService {

    @Autowired
    private MasterMapper masterMapper;

    public List<MasterVO> getMasterByCode(String masterCode) {
        return masterMapper.getMasterByCode(masterCode);
    }


}
