package com.jpaexample.dao.tera

import com.jpaexample.domain.tera.Block
import org.springframework.data.jpa.repository.JpaRepository

/**
 * Created by smpark on 2017-01-13.
 */
interface BlockDAO extends JpaRepository<Block,Integer>{
    List<Block> findByPrjIdAndPrjVerId(Integer prjId, Integer prjVerId)
}