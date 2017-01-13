package com.datastreams.dao.tera

import com.datastreams.domain.tera.BlockExecution
import org.springframework.data.jpa.repository.JpaRepository

/**
 * Created by smpark on 2017-01-13.
 */
interface BlockExecutionDAO extends JpaRepository<BlockExecution,Integer> {

}
