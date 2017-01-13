package com.jpaexample.domain.tera

import com.jpaexample.domain.code.BlockStatus
import com.jpaexample.domain.code.BlockType

import javax.persistence.*
import javax.persistence.Column
/**
 * Created with IntelliJ IDEA.
 * User: jsungnam
 * Date: 15. 2. 25
 * Time: 오전 9:40
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name="note_memo")
@IdClass(NoteMemoPK)
class NoteMemo implements Serializable {
    private static final MASK = 0x0000FFFF
    @Id
    Integer prjId
    @Id
    Integer prjVerId
    @Id
    Integer blockId
    @Column(name="nm")
    String name
    @Column(name="block_kind_cd")
    @Enumerated(EnumType.ORDINAL)
    BlockType blockType
    @Column(name="block_status_cd")
    @Enumerated(EnumType.ORDINAL)
    BlockStatus blockStatus
    @Column(name="pos_x")
    Integer posX
    @Column(name="pos_y")
    Integer posY
    @Column(name="desc1")
    String desc
    @Column(name="cr_dt")
    @Temporal(TemporalType.DATE)
    Date createdDate
    @Column(name="up_dt")
    @Temporal(TemporalType.DATE)
    Date updatedDate
    String blockKindBefore
    String blockKindAfter

    Integer getWidth() {
        return takeLow4Bytes(posX)
    }

    Integer getHeight() {
        return takeLow4Bytes(posY)
    }

    Integer getX() {
        return shift4Bytes(posX)
    }

    Integer getY() {
        return shift4Bytes(posY)
    }

    //하위 4byte를 취함
    private static Integer takeLow4Bytes(Integer origin) {
        if(origin == null) {
            return null
        }
        return origin & MASK
    }

    //하위 4바이트를 버리고 나머지 바이트를 취함
    private static Integer shift4Bytes(Integer origin) {
        if(origin == null) {
            return null
        }
        return origin >> 16
    }
}
