package com.jpaexample.dao

import com.jpaexample.domain.Todo
import org.springframework.data.jpa.repository.JpaRepository

/**
 * Created by smpark on 2017-01-13.
 */
interface TodoRepository extends JpaRepository<Todo, Integer>{

}
