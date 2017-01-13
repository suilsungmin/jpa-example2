package com.datastreams.domain

import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.OneToMany
import javax.persistence.Table

/**
 * Created by smpark on 2017-01-13.
 */
//@Entity
//@Table(name="content")
class Content extends Info{
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id
    @OneToMany(fetch = FetchType.EAGER, targetEntity = Comments)
    @JoinColumn(name = "comment_id")
    List<String> content
}
