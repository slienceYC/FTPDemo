package com.dhht.ftp.model;

import lombok.Data;

import java.util.Date;

@Data
public class SealUseDepartment {
    private String id;

    private String useDepartmentCode;

    private String useDepartmentName;

    private String nationName;

    private String englishName;

    private String departmentType;

    private String districtId;

    private String telphone;

    private String address;

    private String postalCode;

    private String departmentStatus;

    private String idcardReverseId;

    private String idcardFrontId;

    private String businessLicenseId;

    private Boolean isDelete;

    private Integer version;

    private String flag;

    private Date updatetime;

    private Date foundDate;

    private Date startDate;

    private Date endDate;

    private String registrationDepartment;

    private String managementRange;

    private String registeredCapital;

    private String specialBusinessLicenceScanning;

    private String useDepartmentTaxNo;

    private Boolean isRecord;

    private Boolean isPermission;

    private String operatingPeriod;

    private String currency;

    private String currencyAmount;


}