package com.niit.vhrend.service.system.basic;

import com.niit.vhrend.mapper.JObLevelMapper;
import com.niit.vhrend.model.JObLevel;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @author Lenovo
 */
@Service
public class JobLevelService {
    @Resource
    JObLevelMapper jObLevelMapper;

    public List<JObLevel> getAllJobLevels(){
        return jObLevelMapper.getAllJobLevels();
    }
    public Integer addJobLevel(JObLevel jObLevel){
        jObLevel.setCreateDate(new Date());
        jObLevel.setEnabled(true);
        return jObLevelMapper.insertSelective(jObLevel);
    }
    public Integer updateJobLevelById(JObLevel jObLevel){
        return jObLevelMapper.updateByPrimaryKeySelective(jObLevel);
    }
     public Integer deleteJobLevelById(Integer id){
        return jObLevelMapper.deleteByPrimaryKey(id);
    }
    public Integer deleteJobLevelsByIds(Integer[] ids){
        return jObLevelMapper.deleteJobLevelsByIds(ids);
    }
}
