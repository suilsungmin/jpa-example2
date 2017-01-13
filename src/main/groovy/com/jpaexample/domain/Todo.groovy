package com.jpaexample.domain

import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Transient

/**
 * Created by smpark on 2017-01-13.
 */
//@Entity
//@Table(name="todo")
//class Todo {
//    @Id @GeneratedValue(strategy = GenerationType.AUTO)
//    Integer id
//    @Any(
//            metaColumn=@Column(name="content_type"),
//            fetch=FetchType.EAGER
//    )
//    @AnyMetaDef(
//            idType="int", metaType="string" ,
//            metaValues=[
//                    @MetaValue(targetEntity=Content.class, value = "C"),
//                    @MetaValue(targetEntity=NonContent.class, value = "N")
//            ]
//    )
//    @Cascade(value = org.hibernate.annotations.CascadeType.ALL)
//    @JoinColumn(name="content_id" )
//    @JsonIgnoreProperties(["hibernateLazyInitializer", "handler"])
//    Info info
//}
//@Entity
//@Table(name="todo")
class Todo {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id

    String type

    @Transient
    List<Info> infos
}