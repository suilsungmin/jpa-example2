package com.datastreams.domain.tera

import com.datastreams.domain.code.BlockType

import javax.persistence.Column
import javax.persistence.*
/**
 * Created by smpark on 2017-01-12.
 */
@Entity
@Table(name="block_datas")
@IdClass(BlockDatasPK)
class BlockDatas implements Serializable{
    @Id
    @Column(name = "prj_id")
    Integer prjId
    @Id
    @Column(name="prj_ver_id")
    Integer prjVerId
    @Id
    @Column(name="block_id")
    Integer blockId;

    @Column(name="block_kind_cd")
    @Enumerated(EnumType.ORDINAL)
    BlockType blockType;

//    @Id
//    @Column(name = "datafile_block_id")
//    Integer datafileBlockId
//    @Id
//    @Column(name="datafile_prj_id")
//    Integer datafilePrjId
//    @Id
//    @Column(name="datafile_prj_ver_id")
//    Integer datafilePrjVerIdd


}
