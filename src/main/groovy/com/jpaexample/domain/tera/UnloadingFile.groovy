package com.jpaexample.domain.tera

import javax.persistence.Column
import javax.persistence.DiscriminatorValue
import javax.persistence.Entity
import javax.persistence.Table

/**
 * Created with IntelliJ IDEA.
 * User: jsungnam
 * Date: 15. 2. 13
 * Time: 오후 5:17
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name="unload2")
@DiscriminatorValue("U")
class UnloadingFile extends DataFile{
    @Column(name = "db_nm")
    String dbName
    Integer dbTypeCd
    @Column(name="sybase_native_dsn")
    String sybaseNativeDsn
    Integer ffdId
    @Column(name="user_db_nm")
    String userDbName
    @Column(name = "user_nm")
    String userName
    String passwd
    String query
    String outfile1
    Integer type
    String delim
    String field1
    String field2
    String field3
    String field4
    String field5
    String field6
    String field7
    String field8
    String field9
    Integer connectType
    String sybaseQuoteYn
    String ffdUseYn
    Integer tableFfdId
    String lineDelimYn
    Integer ifiller1
    Integer ifiller2
    Integer ifiller3
    String sfiller1
    String sfiller2
    String sfiller3
    Integer ifiller4
    Integer ifiller5
    Integer ifiller6
    String sfiller4
    String sfiller5
    String sfiller6
    String options
    Integer dataTypeCd
    String timestampFormat
    String timeFormat
//    String enfRowDelim
//    String useRsc
//    String rscOptions
//    String condClause
//    @Column(name = "dfs_nm")
//    String dfsName
}
