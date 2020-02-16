package com.karl.imdemo.mapper;

import com.karl.imdemo.domain.TUserRs;
import com.karl.imdemo.example.TUserRsExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TUserRsMapper {
    long countByExample(TUserRsExample example);

    int deleteByExample(TUserRsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TUserRs record);

    int insertSelective(TUserRs record);

    List<TUserRs> selectByExample(TUserRsExample example);

    TUserRs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TUserRs record, @Param("example") TUserRsExample example);

    int updateByExample(@Param("record") TUserRs record, @Param("example") TUserRsExample example);

    int updateByPrimaryKeySelective(TUserRs record);

    int updateByPrimaryKey(TUserRs record);
}