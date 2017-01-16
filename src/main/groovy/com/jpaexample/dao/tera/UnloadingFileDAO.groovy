package com.jpaexample.dao.tera

import com.jpaexample.domain.tera.Block
import com.jpaexample.domain.tera.UnloadingFile
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param

/**
 * Created by smpark on 2017-01-12.
 */
interface UnloadingFileDAO extends JpaRepository<UnloadingFile,Integer> {
    @Query("select u from UnloadingFile u where u.prjId = :#{#block.prjId} and u.prjVerId = :#{#block.prjVerId} and u.blockId = :#{#block.blockId}")
    List<UnloadingFile> findByPrjIdAndPrjVerIdAndBlockId(@Param("block")Block block)
}
