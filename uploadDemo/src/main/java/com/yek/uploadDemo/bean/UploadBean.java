package com.yek.uploadDemo.bean;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by Administrator on 2019-02-13.
 */
@Data
public class UploadBean {
    private String filename;
    private MultipartFile bFile;
}
