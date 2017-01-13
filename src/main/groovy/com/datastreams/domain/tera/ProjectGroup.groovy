package com.datastreams.domain.tera

import javax.persistence.*
import javax.persistence.Column
/**
 * Created with IntelliJ IDEA.
 * User: jsungnam
 * Date: 15. 2. 5
 * Time: 오전 11:23
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name="prj_grp")
class ProjectGroup implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    Integer prjGrpId
    Integer parentGrpId
    @Column(name="nm")
    String name
    @Column(name="desc1")
    String desc
    @Column(name="owner_nm")
    String ownerName
    @Column(name="cp_dt")
    @Temporal(TemporalType.DATE)
    Date createdDate
    @Column(name="up_dt")
    @Temporal(TemporalType.DATE)
    Date updatedDate
    @Column(name="perm")
    Integer permission
    @Column(name="grp_nm")
    String groupName
    Integer statusCd
}
