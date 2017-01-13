package com.datastreams.dao.tera

import com.datastreams.domain.tera.ProjectGroup
import org.springframework.data.jpa.repository.JpaRepository

/**
 * Created by smpark on 2017-01-12.
 */
interface ProjectGroupDAO extends JpaRepository<ProjectGroup, Integer>{
    List<ProjectGroup> findByprjGrpId(Integer prjGrpId);
}
