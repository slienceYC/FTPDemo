package com.dhht.ftp.dao;

import com.dhht.ftp.model.SealUseDepartment;


public interface SealUseDepartmentMapper {
    int deleteByPrimaryKey(String id);

    int insert(SealUseDepartment record);

    int insertSelective(SealUseDepartment record);

    SealUseDepartment selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SealUseDepartment record);

    int updateByPrimaryKey(SealUseDepartment record);
}