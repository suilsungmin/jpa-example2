package com.datastreams.domain.tera

import javax.persistence.*
import javax.persistence.Column
import javax.validation.constraints.NotNull

/**
 * Created with IntelliJ IDEA.
 * User: jsungnam
 * Date: 15. 2. 5
 * Time: 오전 10:44
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name="prj")
class Project implements Serializable {
    @NotNull
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    Integer prjId
    Integer prjGrpId
    @Column(name="nm")
    String name
    @Column(name="last_exec_dt")
    @Temporal(TemporalType.DATE)
    Date lastExecDate
    @Column(name="desc11")
    String desc
    Integer prjStatusCd
    Integer curVerId
    @Column(name="owner_nm")
    String ownerName
    @Column(name="cr_dt")
    @Temporal(TemporalType.DATE)
    Date createdDate
    @Column(name="up_dt")
    @Temporal(TemporalType.DATE)
    Date updatedDate
    @Column(name="lock_user_nm")
    String lockUserName
    @Column(name="perm")
    Integer permission
    @Column(name="grp_nm")
    String groupName
    String favoriteYn
    String statusCd
    Integer smsId
    Integer emailId


}
