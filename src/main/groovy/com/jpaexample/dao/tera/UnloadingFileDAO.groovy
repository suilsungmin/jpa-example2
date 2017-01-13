package com.jpaexample.dao.tera

import com.jpaexample.domain.tera.UnloadingFile
import org.springframework.data.jpa.repository.JpaRepository

/**
 * Created by smpark on 2017-01-12.
 */
interface UnloadingFileDAO extends JpaRepository<UnloadingFile,Integer> {
}
