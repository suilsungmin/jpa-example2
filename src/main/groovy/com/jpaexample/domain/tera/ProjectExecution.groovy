package com.jpaexample.domain.tera

import com.jpaexample.domain.code.ProjectExecutionStatus

import javax.persistence.*
import javax.persistence.Column

/**
 * Created with IntelliJ IDEA.
 * User: jsungnam
 * Date: 15. 2. 24
 * Time: 오전 10:53
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name="prj_exec_log")
@IdClass(ProjectExecutionPK)
class ProjectExecution implements Serializable {
    @Id
    @Column(name = "prj_id")
    Integer prjId
    @Id
    @Column(name= "exec_log_id")
    Integer execLogId
    Integer prjVerId
    @Column(name="begin_dt")
    @Temporal(TemporalType.DATE)
    Date beginDate
    @Column(name="end_dt")

    Date endDate
    @Column(name="final_status_cd")
    @Enumerated(EnumType.ORDINAL)
    ProjectExecutionStatus finalStatus
    Integer sequence
    @Column(name="execution_type")
    Integer executionType

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = BlockExecution)
    @JoinColumns([@JoinColumn(name="prj_id", referencedColumnName = "prj_id"),@JoinColumn(name="exec_log_id",referencedColumnName="exec_log_id")])
    List<BlockExecution> blockExecutions = []
}
