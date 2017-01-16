package com.jpaexample.dao.tera

import com.jpaexample.domain.tera.Project
import com.jpaexample.domain.tera.ProjectExecution
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param

/**
 * Created by smpark on 2017-01-12.
 */
interface ProjectExecutionDAO extends JpaRepository<ProjectExecution, Integer>{
    @Query("select p from ProjectExecution p where p.prjId = :#{#project.prjId} and p.prjVerId = :#{#project.curVerId}")
    List<ProjectExecution> findByPrjIdAndPrjVerId(@Param("project") Project project)
}