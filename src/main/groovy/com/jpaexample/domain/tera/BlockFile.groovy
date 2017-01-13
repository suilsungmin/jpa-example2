package com.jpaexample.domain.tera

import com.jpaexample.domain.code.RoleType

import javax.persistence.*
import javax.persistence.Column
/**
 * Created with IntelliJ IDEA.
 * User: jsungnam
 * Date: 15. 2. 13
 * Time: 오후 5:17
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name="block_vs_file")
@DiscriminatorValue("BLOCK")
class BlockFile extends DataFile {
    @Id
    @Column(name="role_type_cd")
    @Enumerated(EnumType.ORDINAL)
    RoleType roleType
    @Id
    Integer sequence
    Integer fileTypeCd
    Integer ffdId
    Integer ffdKindCd
    Integer ffdType
    Integer ffdLength
    String ffdSep
    Integer ffdScopeCd
    Integer condTypeCd
    String samplingUseYn
    @Column(name="raw_file_nm")
    String rawFileName
    String cond
    String postCond
    String descFile
    Integer fileId
    Integer samplingTypeCd
    Integer samplingAmt
    Integer recSkip
    Integer maxRec
    Integer groupbyKeyId
    String splitYn
    Integer splitKeyId
    Integer recLength
    @Column(name="alias_nm")
    String aliasName
    Integer sortKeyId
    @Column(name="perm")
    Integer permission
    String lineDelimYn
    Integer ifiller1
    Integer ifiller2
    Integer ifiller3
    Integer ifiller4
    String sfiller1
    String sfiller2
    String sfiller3
    Integer sortTypeCd
    String splitTypeCd
    Integer splitMergeSeq
    Integer splitTypeFilesize
    Integer splitTypeReccnt
    /*
        DB마다 다른부분
        String comp
        @Column(name = "dfs_nm")
        String dfsName
    */

}
