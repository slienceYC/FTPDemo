package com.dhht.ftp.service.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 
 * @author crazy
 *
 */

@Component
@ConfigurationProperties(prefix="jiaohu")
@Data
public class FtpConfig {

  // 主机ip
  private String FTP_HOST;
  // 端口号
  private Integer FTP_PORT;
  // ftp用户名
  private String FTP_USER;
  // ftp密码
  private String FTP_PWD;
  // ftp中的目录
  private String FTP_NEW_PATH;

  private String FTP_OLD_PATH;

  private String TEMP_DATA_DIR;

}