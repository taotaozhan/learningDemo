package com.example.fileuploadanddownload.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author zhangtao
 * @date 创建时间
 */
@Controller
@RequestMapping("/file")
public class FileController {
  @RequestMapping("/upload")
  @ResponseBody
  public String upload(@RequestParam("file")MultipartFile file){
    //获取文件名
    String fileName = file.getOriginalFilename();
    //获取后缀名
    return "chenggong";
  }
}
