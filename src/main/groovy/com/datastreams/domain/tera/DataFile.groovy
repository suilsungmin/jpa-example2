package com.datastreams.domain.tera

import javax.persistence.Column
import javax.persistence.Id
import javax.persistence.IdClass
import javax.persistence.MappedSuperclass

/**
 * Created with IntelliJ IDEA.
 * User: jsungnam
 * Date: 15. 2. 13
 * Time: 오후 5:13
 * To change this template use File | Settings | File Templates.
 */
//marker interface
@MappedSuperclass
@IdClass(DataFilePK)
public abstract class DataFile {
    @Id
    @Column(name = "prj_ver_id")
    Integer prjVerId
    @Id
    @Column(name = "prj_id")
    Integer prjId
    @Id
    @Column(name = "block_id")
    Integer blockId
}