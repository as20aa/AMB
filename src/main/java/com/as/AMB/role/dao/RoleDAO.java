package com.as.AMB.role.dao;

import com.as.AMB.role.entity.RoleVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RoleDAO {
    int addRole(RoleVO roleVO);
    int deleteRole(RoleVO roleVO);
    int updateRole(RoleVO roleVO);
    List<RoleVO> select(RoleVO roleVO);
}
