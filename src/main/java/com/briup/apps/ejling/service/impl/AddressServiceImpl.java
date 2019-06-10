package com.briup.apps.ejling.service.impl;

import com.briup.apps.ejling.bean.Address;
import com.briup.apps.ejling.bean.AddressExample;
import com.briup.apps.ejling.dao.AddressMapper;
import com.briup.apps.ejling.service.IAddressService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author gujunqi
 * @create 2019-06-10-15:40
 */
@Service
public class AddressServiceImpl implements IAddressService {
    @Resource
    private AddressMapper addressMapper;
    @Override
    public List<Address> findAll() {
        AddressExample example= new AddressExample();
        return addressMapper.selectByExample(example);
    }
}
