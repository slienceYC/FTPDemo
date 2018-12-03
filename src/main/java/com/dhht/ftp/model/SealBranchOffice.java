package com.dhht.ftp.model;

import lombok.Data;

@Data
public class SealBranchOffice {
    private String id;

    private String branchOfficeCode;

    private String branchOfficeName;

    private String superiorDepartmentCode;

    private String superiorDepartmentName;

    private String liaisonManName;

    private String liaisonManPhone;

    private String liaisonManIdType;

    private String liaisonManIdNo;


}