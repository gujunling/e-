package com.briup.apps.ejling.service;

import com.briup.apps.ejling.bean.Address;

import java.util.List;

/**
 * @author gujunqi
 * @create 2019-06-10-15:37
 */
public interface IAddressService {
    List<Address> findAll();
}
