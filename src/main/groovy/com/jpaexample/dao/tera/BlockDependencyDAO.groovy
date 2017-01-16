package com.jpaexample.dao.tera

import com.jpaexample.domain.tera.BlockDependency
import com.jpaexample.domain.tera.Project
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param

/**
 * Created by smpark on 2017-01-12.
 */
interface BlockDependencyDAO extends JpaRepository<BlockDependency, Integer>{
    @Query(value="select b from BlockDependency b where b.prjId = :#{#project.prjId} and b.prjVerId = :#{#project.curVerId}")
    List<BlockDependency> findByPrjIdAndPrjVerId(@Param("project") Project project)
}