package com.jpaexample.domain

import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

/**
 * Created by smpark on 2017-01-13.
 */
//@Entity
//@Table(name="comments")
class Comments {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id
    String comment
}
