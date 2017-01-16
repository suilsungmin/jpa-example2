package com.jpaexample.dao.tera

import com.jpaexample.domain.tera.Block
import com.jpaexample.domain.tera.LoadingFile
import com.jpaexample.domain.tera.Project
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param

/**
 * Created by smpark on 2017-01-12.
 */
interface LoadingFileDAO extends JpaRepository<LoadingFile,Integer>{
    @Query("select l from LoadingFile l where l.prjId = :#{#block.prjId} and l.prjVerId = :#{#block.prjVerId} and l.blockId = :#{#block.blockId}")
    List<LoadingFile> findByPrjIdAndPrjVerIdAndBlockId(@Param("block")Block block)
}