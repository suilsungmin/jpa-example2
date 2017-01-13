package com.jpaexample.domain.tera

import com.jpaexample.domain.code.DepType
import com.jpaexample.domain.code.LinkType

import javax.persistence.*
import javax.persistence.Column
/**
 * Created with IntelliJ IDEA.
 * User: jsungnam
 * Date: 15. 2. 6
 * Time: 오후 5:14
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name="dep")
@IdClass(BlockDependencyPK)
class BlockDependency implements Serializable {
    @Id
    Integer prjId

    @Id
    Integer prjVerId

    @Id
    Integer blockId

    @Id
    Integer sequence

    String targetBlockId

    Integer linkKindCd

    @Column(name="dep_type_cd")
    @Enumerated(EnumType.ORDINAL)
    DepType depType

    @Column(name="link_type_cd")
    @Enumerated(EnumType.ORDINAL)
    LinkType linkType

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, targetEntity = LinePoint)
    @JoinColumns([@JoinColumn(name="prj_id"), @JoinColumn(name="prj_ver_id"),
            @JoinColumn(name="block_id") ,@JoinColumn(name="sequence")])
    List<LinePoint> linePoints = []
}
