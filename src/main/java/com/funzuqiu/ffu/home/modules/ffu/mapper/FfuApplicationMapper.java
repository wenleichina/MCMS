package com.funzuqiu.ffu.home.modules.ffu.mapper;

import com.funzuqiu.ffu.home.common.persistence.BaseMapper;
import com.funzuqiu.ffu.home.modules.ffu.entity.FfuApplication;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FfuApplicationMapper extends BaseMapper {

    FfuApplication getByPhone(String phone);

    int insert(FfuApplication entity);

    int update(FfuApplication entity);

}
