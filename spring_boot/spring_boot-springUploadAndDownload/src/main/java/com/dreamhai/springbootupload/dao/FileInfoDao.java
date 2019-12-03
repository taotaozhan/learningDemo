package com.dreamhai.springbootupload.dao;

import com.dreamhai.springbootupload.po.FileInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Dreamhai
 * @desc
 * @date 2018-06-08 12:33
 */
public interface FileInfoDao extends JpaRepository<FileInfo, Long> {

  FileInfo findByFileName(String fileName);


  FileInfo findByFileNameAndValid(String fileName, Boolean valid);


  List<FileInfo> findByValid(Boolean valid);


  List<FileInfo> findByResourceId(String resourceId);


}
