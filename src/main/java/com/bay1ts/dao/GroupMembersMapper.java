package com.bay1ts.dao;

import com.bay1ts.domain.GroupMembers;
import com.bay1ts.domain.GroupMembersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GroupMembersMapper {
    int countByExample(GroupMembersExample example);

    int deleteByExample(GroupMembersExample example);

    int deleteByPrimaryKey(Long ugId);

    int insert(GroupMembers record);

    int insertSelective(GroupMembers record);

    List<GroupMembers> selectByExample(GroupMembersExample example);

    GroupMembers selectByPrimaryKey(Long ugId);

    int updateByExampleSelective(@Param("record") GroupMembers record, @Param("example") GroupMembersExample example);

    int updateByExample(@Param("record") GroupMembers record, @Param("example") GroupMembersExample example);

    int updateByPrimaryKeySelective(GroupMembers record);

    int updateByPrimaryKey(GroupMembers record);
}