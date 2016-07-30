package com.bay1ts.dao;

import com.bay1ts.domain.GroupAuthorities;
import com.bay1ts.domain.GroupAuthoritiesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GroupAuthoritiesMapper {
    int countByExample(GroupAuthoritiesExample example);

    int deleteByExample(GroupAuthoritiesExample example);

    int deleteByPrimaryKey(Long gaId);

    int insert(GroupAuthorities record);

    int insertSelective(GroupAuthorities record);

    List<GroupAuthorities> selectByExample(GroupAuthoritiesExample example);

    GroupAuthorities selectByPrimaryKey(Long gaId);

    int updateByExampleSelective(@Param("record") GroupAuthorities record, @Param("example") GroupAuthoritiesExample example);

    int updateByExample(@Param("record") GroupAuthorities record, @Param("example") GroupAuthoritiesExample example);

    int updateByPrimaryKeySelective(GroupAuthorities record);

    int updateByPrimaryKey(GroupAuthorities record);
}