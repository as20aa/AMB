package com.as.AMB.menu.dao;

import com.as.AMB.menu.entity.MenuVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MenuDAO {
    int insertMenu(MenuVO menuVO);
    int deleteMenu(MenuVO menuVO);
    int updateMenu(MenuVO menuVO);
    List<MenuVO> selectMenu(MenuVO menuVO);
}
