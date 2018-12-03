package com.dhht.ftp.model;

import lombok.Data;

import java.util.Date;

@Data
public class UseDepartmentModel {

    private String useDepartmentCode;

    private String useDepartmentName;

    private String registrationDepartment;

    private String departmentType;

    private String telphone;

    private Date startDate;

    private String address;

    private String postalCode;

    private String managementRange;

    private String registeredCapital;

    private String operatingPeriod;

    private String currency;

    private String currencyAmount;

    private String branchOfficeCode;

    private String branchOfficeName;

    private String branchSuperiorCode;

    private String branchSuperiorName;

    private DepartmentPersonInfo contactPersonInfo;

    private DepartmentPersonInfo LegalInfo;

    private DepartmentPersonInfo FinanceInfo;

    private ShareholderInfo shareholderInfo;


}
