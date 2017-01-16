package com.jpaexample.dao.tera

import com.jpaexample.domain.tera.BlockFile
import org.springframework.data.jpa.repository.JpaRepository

/**
 * Created by smpark on 2017-01-12.
 */
interface BlockFileDAO extends JpaRepository<BlockFile, Integer>{
    List<BlockFile> findByPrjIdAndPrjVerIdAndBlockId(Integer prjId, Integer prjVerId, Integer blockId)
}