package com.jpaexample.dao.tera

import com.jpaexample.domain.tera.NoteMemo
import com.jpaexample.domain.tera.Project
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param

/**
 * Created by smpark on 2017-01-12.
 */
interface NoteMemoDAO extends JpaRepository<NoteMemo, Integer>{
    @Query("select n from NoteMemo n where n.prjId = :#{#project.prjId} and n.prjVerId = :#{#project.curVerId}")
    List<NoteMemo> findByPrjIdAndPrjVerId(@Param("project") Project project)
}