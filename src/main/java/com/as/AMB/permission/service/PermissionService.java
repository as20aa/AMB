package com.as.AMB.permission.service;

import com.as.AMB.permission.entity.PermissionVO;
import com.as.AMB.permission.logic.PermissionLogic;
import com.as.AMB.util.Response;
import com.as.AMB.util.RestUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/permission")
public class PermissionService {
    @Autowired
    private PermissionLogic permissionLogic;

    @RequestMapping(method= RequestMethod.POST, path="/addPermission")
    public Response addPermission(@RequestBody PermissionVO permissionVO) {
        int affectRows=permissionLogic.addPermission(permissionVO);
        if(affectRows!=1){
            return RestUtil.Error("add permission failed!");
        } else {
            return RestUtil.Ok();
        }
    }

    @RequestMapping(method=RequestMethod.POST, path="/deletePermission")
    public Response deletePermission(@RequestBody PermissionVO permissionVO) {
        permissionLogic.deletePermission(permissionVO);
        return RestUtil.Ok();
    }

    @RequestMapping(method=RequestMethod.POST, path="/updatePermission")
    public Response updatePermission(@RequestBody PermissionVO permissionVO) {
        permissionLogic.updatePermission(permissionVO);
        return RestUtil.Ok();
    }

    @RequestMapping(method=RequestMethod.POST, path="/selectPermission")
    public Response selectPermission(@RequestBody PermissionVO permissionVO) {
        List<PermissionVO> permissionVOList = permissionLogic.selectPermission(permissionVO);
        return RestUtil.Ok(permissionVOList);
    }
}
