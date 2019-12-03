package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @author
 * @date 2019/10/19
 */
@RestController
public class UploadAndDownloadController {

  private static final Logger LOG = LoggerFactory.getLogger(UploadAndDownloadController.class);

  @RequestMapping("/upload")
  public String upload(@RequestParam("file") MultipartFile file) {

    try {
      if (file.isEmpty()) {
        return "文件为空";
      }
      //获取文件名
      //获取文件后缀名
      String fileName = file.getOriginalFilename();
      LOG.info("上传的文件名为:" + fileName);
      String suffixName = fileName.substring(fileName.lastIndexOf("."));
      LOG.info("文件的后缀名：" + suffixName);
      // 设置文件储存路径
      String filePath = "D://aim//";
      String path = filePath + fileName + suffixName;

      File dest = new File(path);
      // 检测是否存在目录
      if (!dest.getParentFile().exists()) {
        // 新建文件夹
        dest.getParentFile().mkdirs();
      }
      file.transferTo(dest);// 文件写入
      return "上传成功";
    } catch (IllegalStateException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return "上传成功";
  }


}
