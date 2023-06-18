package com.as.AMB.menu.logic;

import com.as.AMB.menu.dao.MenuDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MenuLogic {
    @Autowired
    private MenuDAO menuDAO;

}
