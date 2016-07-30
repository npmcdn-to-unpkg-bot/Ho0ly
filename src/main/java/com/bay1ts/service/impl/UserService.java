package com.bay1ts.service.impl;

import com.bay1ts.dao.GroupAuthoritiesMapper;
import com.bay1ts.dao.GroupMembersMapper;
import com.bay1ts.dao.UserMapper;
import com.bay1ts.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.oauth2.common.exceptions.UnauthorizedUserException;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Created by chenu on 2016/7/28.
 */
@Service
public class UserService implements com.bay1ts.service.UserService,UserDetailsService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private GroupMembersMapper groupMembersMapper;
    @Autowired
    private GroupAuthoritiesMapper groupAuthoritiesMapper;
    private boolean enableGroups=true;

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserExample userExample=new UserExample();
        userExample.or().andUsernameEqualTo(username);
        User user=userMapper.selectByExample(userExample).get(0);
        //获取权限

        if ("".equals(user.getUsername())){
            throw new UsernameNotFoundException("该用户不存在");
        }
        Set<GrantedAuthority> dbAuthsSet = new HashSet<GrantedAuthority>();


        if (enableGroups) {
            dbAuthsSet.addAll(loadGroupAuthorities(user.getUsername()));
        }

        List<GrantedAuthority> dbAuths = new ArrayList<GrantedAuthority>(dbAuthsSet);


        if (dbAuths.size() == 0) {
            throw new UsernameNotFoundException("该用户不存在,没有权限");
        }

        return createUserDetails(username,user,dbAuthsSet);
    }


    public UserDetails getCurrentUser(){
        try {
            UserDetails userDetails=(UserDetails)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
            return loadUserByUsername(userDetails.getUsername());
        }catch (Exception e){
            throw new UnauthorizedUserException("请登录");
        }

    }
    private UserDetails createUserDetails(String username, User user, Set<GrantedAuthority> dbAuths) {
        return new User(user.getUserId(),username,user.getPassword(),user.getRealname(),user.getEmail(),dbAuths,true,true,true,user.isEnabled());
    }

    private Collection<? extends GrantedAuthority> loadGroupAuthorities(String username) {
        UserExample userExample=new UserExample();
        userExample.or().andUsernameEqualTo(username);
        User user=userMapper.selectByExample(userExample).get(0);

        GroupMembersExample groupMembersExample =new GroupMembersExample();
        groupMembersExample.or().andUserIdEqualTo(user.getUserId());
        List<GroupMembers> list= groupMembersMapper.selectByExample(groupMembersExample);
        Set<GrantedAuthority> set=new HashSet<GrantedAuthority>();

        for (GroupMembers groupMembers:list){
            System.out.println(groupMembers.getGroupId()+"--");
            GroupAuthoritiesExample groupAuthoritiesExample=new GroupAuthoritiesExample();
            groupAuthoritiesExample.or().andGroupIdEqualTo(groupMembers.getGroupId());
            set.add(new SimpleGrantedAuthority(groupAuthoritiesMapper.selectByExample(groupAuthoritiesExample).get(0).getAuthority()));
        }

        return set;
    }
}
