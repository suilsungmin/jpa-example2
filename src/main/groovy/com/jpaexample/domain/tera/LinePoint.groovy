package com.jpaexample.domain.tera

import javax.persistence.*
import javax.persistence.Column
/**
 * Created with IntelliJ IDEA.
 * User: jsungnam
 * Date: 15. 2. 10
 * Time: 오후 8:12
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name="arrow_dtl")
@IdClass(LinePointPK)
class LinePoint implements Serializable {
    @Id
    @Column(name="prj_id")
    Integer prjId
    @Id
    @Column(name="prj_ver_id")
    Integer prjVerId
    @Id
    @Column(name="block_id")
    Integer blockId

    @Id
    @Column(name = "sequence")
    Integer sequence

    @Id
    @Column(name="sequence2")
    Integer sequence2

    @Column(name="pos_x")
    Integer posX
    @Column(name="pos_y")
    Integer posY
}
