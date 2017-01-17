package com.jpaexample.domain.tera

import com.jpaexample.domain.code.BlockStatusConverter
import com.jpaexample.domain.code.BlockTypeConverter
import com.jpaexample.domain.code.BlockStatus
import com.jpaexample.domain.code.BlockType

import javax.persistence.*
import javax.persistence.Column
/**
 * Created with IntelliJ IDEA.
 * User: jsungnam
 * Date: 15. 2. 6
 * Time: 오후 5:12
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name="block")
@DiscriminatorValue("B")
@IdClass(BlockPK)
class Block implements Serializable {
    @Id
    @Column(name = "prj_ver_id")
    Integer prjVerId
    @Id
    @Column(name = "prj_id")
    Integer prjId
    @Id
    @Column(name = "block_id")
    Integer blockId
    @Column(name="nm")
    String name
    @Column(name="block_kind_cd")
    @Convert(converter = BlockTypeConverter)
    BlockType blockType
    @Column(name="block_status_cd")
    @Convert(converter = BlockStatusConverter)
    BlockStatus blockStatus
    String parallel
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
    @OneToMany(mappedBy = "block")
    List<LoadingFile> dataFiles = []


//    @Transient
//    List<DataFile> dataFiles = []


//    @Any( metaColumn = @Column(name="block_kind_cd"))
//    @AnyMetaDef(idType = "long", metaType = "string",
//            metaValues = [
//                @MetaValue(targetEntity = BlockFile.class, value = "B"),
//                @MetaValue(targetEntity = UnloadingFile.class, value = "U"),
//                @MetaValue(targetEntity = LoadingFile.class, value = "L")
//            ])
//    @OneToMany
//    @JoinColumns([@JoinColumn(name = "block_id"),@JoinColumn(name = "prj_id"), @JoinColumn(name = "prj_ver_id")])
//    List<Object> datafiles = []
//    @Any
//    @ManyToAny(
//            metaColumn = @Column(name="block_kind_cd"),
//            metaDef = "FileMetaDef"
//    )
//
//    @Cascade(org.hibernate.annotations.CascadeType.ALL)
//    @JoinTable(name = "block_datas",
//            joinColumns = [@JoinColumn(name = "block_id"),@JoinColumn(name = "prj_id"), @JoinColumn(name = "prj_ver_id")]
//    )
//    List<DataFile> dataFiles = []

//    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    @JoinColumns([@JoinColumn(name="prj_ver_id"),@JoinColumn(name="prj_id"), @JoinColumn(name="block_id") ])
//    List<DataFile> dataFiles = []


//    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    List<DataFile> getDataFile(){
//        if(this.blockType == BlockType.UNLOAD) {
//            this.dataFiles = dao.getUnloadingFiles(it)
//        } else if(this.blockType == BlockType.LOAD) {
//
//        } else {
//            this.dataFiles = dao.getBlockFiles(it)
//        }
//
//    }
}
