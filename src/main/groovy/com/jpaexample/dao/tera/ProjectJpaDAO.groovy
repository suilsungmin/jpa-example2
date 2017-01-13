package com.jpaexample.dao.tera

import com.jpaexample.domain.tera.Project
import org.springframework.data.jpa.repository.JpaRepository

/**
 * Created by smpark on 2017-01-10.
 */
interface ProjectJpaDAO extends JpaRepository<Project ,Integer>{
    List<Project> findByprjGrpId(Integer PrjGrpId)
}
