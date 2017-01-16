package com.jpaexample.dao.tera

import com.jpaexample.domain.tera.LoadingFile
import org.springframework.data.jpa.repository.JpaRepository

/**
 * Created by smpark on 2017-01-12.
 */
interface LoadingFileDAO extends JpaRepository<LoadingFile,Integer>{
    List<LoadingFile> findByPrjIdAndPrjVerIdAndBlockId(Integer prjId, Integer prjVerId, Integer blockId)
}