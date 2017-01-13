package com.datastreams.dao.tera

import com.datastreams.domain.tera.UnloadingFile
import org.springframework.data.jpa.repository.JpaRepository

/**
 * Created by smpark on 2017-01-12.
 */
interface UnloadingFileDAO extends JpaRepository<UnloadingFile,Integer> {
}
