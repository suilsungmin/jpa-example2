package com.datastreams.domain.tera

import com.datastreams.domain.code.RoleType


/**
 * Created by smpark on 2017-01-12.
 */
class BlockFilePK implements Serializable{

    Integer prjVerId

    Integer prjId

    Integer blockId

    RoleType roleType

    Integer sequence
    @Override
    public int hashCode(){
        return super.hashCode()
    }

    @Override
    public boolean equals(Object obj){
        super.equals(obj)
    }
}
