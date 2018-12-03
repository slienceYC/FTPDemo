package com.dhht.ftp.dao;

import com.dhht.ftp.model.SealDepartmentPersonnel;

public interface SealDepartmentPersonnelMapper {
    int deleteByPrimaryKey(String id);

    int insert(SealDepartmentPersonnel record);

    int insertSelective(SealDepartmentPersonnel record);

    SealDepartmentPersonnel selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SealDepartmentPersonnel record);

    int updateByPrimaryKey(SealDepartmentPersonnel record);
}