package com.jpaexample.domain

import javax.persistence.DiscriminatorValue
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

/**
 * Created by smpark on 2017-01-13.
 */
@Entity
@Table(name="nonconent")
@DiscriminatorValue("N")
class NonContent implements Info{
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id
    String nonContent
}
