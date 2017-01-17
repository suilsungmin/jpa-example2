package com.jpaexample.domain.tera

import com.jpaexample.domain.code.BlockStatus
import com.jpaexample.domain.code.BlockStatusConverter

import javax.persistence.*
import javax.persistence.Column
/**
 * Created with IntelliJ IDEA.
 * User: jsungnam
 * Date: 15. 2. 24
 * Time: 오전 8:59
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name="block_exec_log")
@IdClass(BlockExecutionPK)
class BlockExecution implements Serializable{
    @Id @Column(name="prj_id")
    Integer prjId
    @Id
    Integer blockId
    @Id
    Integer sequence
    @Column(name="exec_log_id")
    Integer execLogId
    @Column(name="log_stdout_nm")
    String logStdoutName
    String logStdout
    Integer logStatusCd
    @Column(name="exit_status_cd")
    @Convert(converter = BlockStatusConverter)
    BlockStatus exitStatus
    String outputAmt
    String memAvgAmt
    String memMaxAmt
    String cpuAvgAmt
    String cpuMaxAmt
    String memoryArea
    @Column(name="begin_dt")
    @Temporal(TemporalType.TIMESTAMP)
    Date beginDate
    @Column(name="end_dt")
    @Temporal(TemporalType.TIMESTAMP)
    Date endDate
    @Column(name="cr_dt")
    @Temporal(TemporalType.TIMESTAMP)
    Date createdDate
    @Column(name="log_stderr_nm")
    String logStderrName
    String logStderr
}
