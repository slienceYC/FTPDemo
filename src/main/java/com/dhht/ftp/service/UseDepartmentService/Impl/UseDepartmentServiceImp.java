package com.dhht.ftp.service.UseDepartmentService.Impl;

import com.dhht.ftp.model.DepartmentPersonInfo;
import com.dhht.ftp.model.SealDepartmentPersonnel;
import com.dhht.ftp.model.ShareholderInfo;
import com.dhht.ftp.model.UseDepartmentModel;
import com.dhht.ftp.service.UseDepartmentService.UseDepartmentService;
import com.dhht.ftp.util.*;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service("useDepartmentService")
public class UseDepartmentServiceImp implements UseDepartmentService {

    private String[] type = new String[]{"01","02","03","04","05","99"};

    @Override
    public UseDepartmentModel createUseDepartment() {
        return createUseDepartmentModel();
    }

    public DepartmentPersonInfo createDepartmentPersonInfo(){
        DepartmentPersonInfo departmentPersonInfo = new DepartmentPersonInfo();
        departmentPersonInfo.setDepartmentPersonName(NameUtil.GeneratePersonName());
        departmentPersonInfo.setCertificateType("111");
        departmentPersonInfo.setCertificateNumber(new IdCardGenerator().generate());
        departmentPersonInfo.setTelPhone(PhoneGenertor.GenerateTelphone());
        departmentPersonInfo.setMobilePhone(PhoneGenertor.GenerateMobilephone());
        departmentPersonInfo.setEmailNumber(EmailGenerator.getEmail(6,12));
        return departmentPersonInfo;
    }

    public ShareholderInfo createShareholderInfo(){
        ShareholderInfo shareholderInfo = new ShareholderInfo();
        shareholderInfo.setShareholderName(NameUtil.GeneratePersonName());
        shareholderInfo.setCertificateType("111");
        shareholderInfo.setCertificateNumber(new IdCardGenerator().generate());
        shareholderInfo.setFundingDate(DateUtil.GenerateDate("2011-8-1","2018-11-11"));
        shareholderInfo.setFundingType("合股");
        shareholderInfo.setFundingAmount(NumberUtil.generatorNumber());
        shareholderInfo.setFundingProportion("20%");
        return shareholderInfo;
    }

    public UseDepartmentModel createUseDepartmentModel(){
        UseDepartmentModel useDepartmentModel = new UseDepartmentModel();
        String districtId = DistrictUtil.generatorAreaCode();
        String socialCode = SocialCodeCenerator.genertorCode(districtId);
        String nameAndFunction[] =NameUtil.GenerateUseDepartmentNameAndFunction();
        useDepartmentModel.setUseDepartmentCode(socialCode);
        useDepartmentModel.setUseDepartmentName(nameAndFunction[0]);
        useDepartmentModel.setDepartmentType(generateType());
        useDepartmentModel.setRegistrationDepartment("工商局");
        useDepartmentModel.setStartDate(DateUtil.GenerateDate("2011-8-1","2018-11-11"));
        useDepartmentModel.setOperatingPeriod("十年");
        useDepartmentModel.setAddress(DistrictUtil.generatorAreaName());
        useDepartmentModel.setPostalCode("310000");
        useDepartmentModel.setTelphone(PhoneGenertor.GenerateTelphone());
        useDepartmentModel.setManagementRange(nameAndFunction[1]);
        useDepartmentModel.setRegisteredCapital(NumberUtil.generatorNumber());
        useDepartmentModel.setCurrency("人民币");
        useDepartmentModel.setCurrencyAmount(NumberUtil.generatorNumber());
        useDepartmentModel.setBranchOfficeCode(SocialCodeCenerator.genertorCode(districtId));
        useDepartmentModel.setBranchOfficeName(nameAndFunction[0]+"分部");
        useDepartmentModel.setBranchSuperiorCode(socialCode);
        useDepartmentModel.setBranchSuperiorName(nameAndFunction[0]);
        useDepartmentModel.setContactPersonInfo(createDepartmentPersonInfo());
        useDepartmentModel.setLegalInfo(createDepartmentPersonInfo());
        useDepartmentModel.setFinanceInfo(createDepartmentPersonInfo());
        useDepartmentModel.setShareholderInfo(createShareholderInfo());
        return useDepartmentModel;
    }

    private String generateType(){
        Random random = new Random();
        int index = random.nextInt(type.length);
        return type[index];
    }

}
