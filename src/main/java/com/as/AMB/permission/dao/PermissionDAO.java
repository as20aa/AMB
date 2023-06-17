package com.as.AMB.permission.dao;

import com.as.AMB.permission.entity.PermissionVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PermissionDAO {
    int addPermission(PermissionVO permissionVO);
    int deletePermission(PermissionVO permissionVO);
    int updatePermission(PermissionVO permissionVO);
    List<PermissionVO> selectPermission(PermissionVO permissionVO);
}
