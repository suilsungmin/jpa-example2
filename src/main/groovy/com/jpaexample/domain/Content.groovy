package com.jpaexample.domain

import javax.persistence.Column
import javax.persistence.DiscriminatorValue
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
@Entity
@Table(name="content")
@DiscriminatorValue("C")
class Content implements Info{
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id
    @Column(name = "content_id")
    Integer contentId
    String content
//    @OneToMany(fetch = FetchType.EAGER, targetEntity = Comments)
//    @JoinColumn(name = "comment_id")
//    List<String> content
}
