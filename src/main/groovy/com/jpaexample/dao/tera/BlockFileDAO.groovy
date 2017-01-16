package com.jpaexample.dao.tera

import com.jpaexample.domain.tera.Block
import com.jpaexample.domain.tera.BlockFile
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param

/**
 * Created by smpark on 2017-01-12.
 */
interface BlockFileDAO extends JpaRepository<BlockFile, Integer>{
    @Query("select b from BlockFile b where b.prjId = :#{#block.prjId} and b.prjVerId = :#{#block.prjVerId} and b.blockId = :#{#block.blockId}")
    List<BlockFile> findByPrjIdAndPrjVerIdAndBlockId(@Param("block") Block block)
}