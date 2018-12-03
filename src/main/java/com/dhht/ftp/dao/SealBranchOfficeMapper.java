package com.dhht.ftp.dao;

import com.dhht.ftp.model.SealBranchOffice;

public interface SealBranchOfficeMapper {
    int deleteByPrimaryKey(String id);

    int insert(SealBranchOffice record);

    int insertSelective(SealBranchOffice record);

    SealBranchOffice selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SealBranchOffice record);

    int updateByPrimaryKey(SealBranchOffice record);
}