package com.jpaexample.domain.tera

import javax.persistence.Column
import javax.persistence.DiscriminatorValue
import javax.persistence.Entity
import javax.persistence.Table

/**
 * Created with IntelliJ IDEA.
 * User: jsungnam
 * Date: 15. 2. 13
 * Time: 오후 5:18
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name="loading2")
@DiscriminatorValue("L")
class LoadingFile extends DataFile {
    @Column(name="db_nm")
    String dbName
    Integer dbTypeCd
    String nativeDsn
    @Column(name="user_db_nm")
    String userDbName
    @Column(name="user_nm")
    String userName
    String passwd
    String logFile
    String badFile
    String dataFile
    String targetTable
    String options
    Integer ffdId
    String dateFormat
    Integer connectType
    String ctlFile
    Integer tableFfdId
    Integer loadTypeCd
    Integer ifiller1
    Integer ifiller2
    Integer ifiller3
    String sfiller1
    String sfiller2
    String sfiller3
    Integer ifiller4
    Integer ifiller5
    Integer ifiller6
    Integer ifiller7
    Integer ifiller8
    Integer ifiller9
    Integer ifiller10
    String sfiller4
    String sfiller5
    String sfiller6
    String sfiller7
    String sfiller8
    String sfiller9
    String sfiller10
    Integer dataTypeCd
    Long maxErrors
    Integer keepNull
    Integer tableLevelLock
}
