package com.jpaexample.dao.tera

import com.jpaexample.domain.tera.Block
import com.jpaexample.domain.tera.Project
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param

/**
 * Created by smpark on 2017-01-13.
 */
interface BlockDAO extends JpaRepository<Block,Integer>{
    @Query(value = "select b from Block b where b.prjId =:#{#project.prjId} and b.prjVerId = :#{#project.curVerId}")
    List<Block> findByPrjIdAndPrjVerId(@Param("project") Project project)
}