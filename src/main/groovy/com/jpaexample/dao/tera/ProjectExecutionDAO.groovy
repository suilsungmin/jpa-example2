package com.jpaexample.dao.tera

import com.jpaexample.domain.tera.ProjectExecution
import org.springframework.data.jpa.repository.JpaRepository

/**
 * Created by smpark on 2017-01-12.
 */
interface ProjectExecutionDAO extends JpaRepository<ProjectExecution, Integer>{

}