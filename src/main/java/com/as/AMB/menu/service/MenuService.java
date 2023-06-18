package com.as.AMB.menu.service;

import com.as.AMB.menu.entity.MenuVO;
import com.as.AMB.menu.logic.MenuLogic;
import com.as.AMB.util.Response;
import com.as.AMB.util.RestUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/menu")
public class MenuService {
    @Autowired
    private MenuLogic menuLogic;

    @RequestMapping(method=RequestMethod.POST, path="/addMenu")
    public Response addMenu(@RequestBody MenuVO menuVO) throws Exception {
        // you do not have to check the menu id
        int affectRows = menuLogic.addMenu(menuVO);
        if (affectRows!=1) {
            return RestUtil.Error("insert failed!");
        } else {
            return RestUtil.Ok();
        }
    }

    @RequestMapping(method=RequestMethod.POST, path="/deleteMenu")
    public Response deleteMenu(@RequestBody MenuVO menuVO) throws Exception {
        int affectRows = menuLogic.deleteMenu(menuVO);
        return RestUtil.Ok();
    }

    @RequestMapping(method=RequestMethod.POST, path="/updateMenu")
    public Response updateMenu(@RequestBody MenuVO menuVO) throws Exception {
        int affectRows = menuLogic.updateMenu(menuVO);
        if(affectRows==0) {
            return RestUtil.Error("update failed!");
        } else {
            return RestUtil.Ok();
        }
    }

    @RequestMapping(method=RequestMethod.POST, path="/selectMenu")
    public Response selectMenu(@RequestBody MenuVO menuVO) throws Exception {
        List<MenuVO> menuVOList = menuLogic.selectMenu(menuVO);
        return RestUtil.Ok(menuVOList);
    }
}
