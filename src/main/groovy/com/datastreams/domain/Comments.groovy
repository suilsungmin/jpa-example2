package com.datastreams.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

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
