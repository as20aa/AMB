package com.as.AMB.menu.logic;

import com.as.AMB.menu.dao.MenuDAO;
import com.as.AMB.menu.entity.MenuVO;
import com.as.AMB.util.Constants;
import com.as.AMB.util.sequence.SequenceUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MenuLogic {
    @Autowired
    private MenuDAO menuDAO;
    @Autowired
    private SequenceUtil sequenceUtil;

    @Transactional
    public int addMenu(MenuVO menuVO) throws Exception {
        // get menuId from sequenceUtil
        String menuId = sequenceUtil.generateId(Constants.SEQ_NAME_MENU_ID);
        menuVO.setMenuId(menuId);
        return menuDAO.insertMenu(menuVO);
    }

    @Transactional
    public int deleteMenu(MenuVO menuVO) throws Exception {
        return menuDAO.deleteMenu(menuVO);
    }

    @Transactional
    public int updateMenu(MenuVO menuVO) throws Exception {
        return menuDAO.updateMenu(menuVO);
    }

    @Transactional
    public List<MenuVO> selectMenu(MenuVO menuVO) throws Exception {
        return menuDAO.selectMenu(menuVO);
    }
}
