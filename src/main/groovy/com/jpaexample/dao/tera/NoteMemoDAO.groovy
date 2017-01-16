package com.jpaexample.dao.tera

import com.jpaexample.domain.tera.NoteMemo
import org.springframework.data.jpa.repository.JpaRepository

/**
 * Created by smpark on 2017-01-12.
 */
interface NoteMemoDAO extends JpaRepository<NoteMemo, Integer>{
    List<NoteMemo> findByPrjIdAndPrjVerId(Integer prjId , Integer prjVerId)
}