package com.briup.apps.ejling.web.controller;

import com.briup.apps.ejling.bean.Address;
import com.briup.apps.ejling.service.IAddressService;
import com.briup.apps.ejling.utils.Message;
import com.briup.apps.ejling.utils.MessageUtil;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author gujunqi
 * @create 2019-06-10-15:52
 */
@RestController
@RequestMapping("/address")
public class AddressController {
@Autowired
    private IAddressService addressService;
@ApiOperation("查询所有地址")
    @GetMapping("findAll")
    public Message findAll(){
    List<Address> list=addressService.findAll();
    return MessageUtil.success("success",list);
}
}
