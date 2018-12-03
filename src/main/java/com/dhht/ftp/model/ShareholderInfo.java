package com.dhht.ftp.model;

import lombok.Data;

import java.util.Date;

@Data
public class ShareholderInfo {
    private String shareholderName;

    private String certificateType;

    private String certificateNumber;

    private Date fundingDate;

    private String fundingType;

    private String fundingAmount;

    private String fundingProportion;

    private String national;

}
