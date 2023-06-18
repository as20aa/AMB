package com.as.AMB.menu.service;

import com.as.AMB.menu.logic.MenuLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/menu")
public class MenuService {
    @Autowired
    private MenuLogic menuLogic;

}
