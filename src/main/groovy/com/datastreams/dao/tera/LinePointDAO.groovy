package com.datastreams.dao.tera

import com.datastreams.domain.tera.LinePoint
import org.springframework.data.jpa.repository.JpaRepository

/**
 * Created by smpark on 2017-01-13.
 */
interface LinePointDAO extends JpaRepository<LinePoint, Integer> {

}