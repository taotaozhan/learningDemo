package com.springboot.base.config;

import java.io.File;
import java.util.ArrayList;

/**
 * @author zhangtao
 * @date 2019/11/15
 * @version 1.0
 */

public class GetFile {

  public static void gerAllFileName(String path, ArrayList<String> listFileName){
    File  file = new File(path);
    File[] files = file.listFiles();
    String[] names = file.list();

    if ( names != null ) {

    }

  }


}
