package com.dhht.ftp.model;

import lombok.Data;

import java.util.Date;

@Data
public class SealDepartmentPersonnel {
    private String id;

    private String departmentCode;

    private String departmentName;

    private String personType;

    private String name;

    private String idCradType;

    private String idCardNo;

    private String phone;

    private String telphone;

    private String email;

    private Date investmentTime;

    private String investmentStyle;

    private String subscribedCapital;

    private String investmentRate;

    private String nationality;


}