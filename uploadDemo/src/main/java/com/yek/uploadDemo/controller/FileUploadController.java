package com.yek.uploadDemo.controller;

import com.yek.uploadDemo.bean.UploadBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * Created by yek on 2019-02-13.
 */
@Controller
public class FileUploadController {
    @PostMapping("/uploadObj")
    @ResponseBody
    public String upload(UploadBean file) { // 上传包装为对象时不需要加 @RequestBody
        System.out.println(file.getFilename());
        if (file.getBFile().isEmpty()) {
            return "上传失败，请选择文件";
        }

        String fileName = file.getBFile().getOriginalFilename();
        String filePath = "d:/temp/";
        File dest = new File(filePath + fileName);
        try {
            file.getBFile().transferTo(dest);
//            LOGGER.info("上传成功");
            return "上传成功";
        } catch (IOException e) {
//            LOGGER.error(e.toString(), e);
            e.printStackTrace();
        }
        return "上传失败！";
    }
    @PostMapping("/uploadObj")
    @ResponseBody
    public String upload(@RequestParam("file") MultipartFile file) {
        if (file.isEmpty()) {
            return "上传失败，请选择文件";
        }

        String fileName = file.getOriginalFilename();
        String filePath = "d:/temp/";
        File dest = new File(filePath + fileName);
        try {
            file.transferTo(dest);
//            LOGGER.info("上传成功");
            return "上传成功";
        } catch (IOException e) {
//            LOGGER.error(e.toString(), e);
            e.printStackTrace();
        }
        return "上传失败！";
    }
}
