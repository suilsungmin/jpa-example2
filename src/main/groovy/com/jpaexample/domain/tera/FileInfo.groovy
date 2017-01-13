package com.jpaexample.domain.tera

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

/**
 * Created by smpark on 2017-01-12.
 */
@Entity
@Table(name="file_info")
class FileInfo implements Serializable{
    @Id
    private Integer id
    private String dataFile
}
