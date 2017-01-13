package com.jpaexample.domain.tera
/**
 * Created by smpark on 2017-01-12.
 */
class BlockExecutionPK implements Serializable{
    Integer prjId
    Integer blockId
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
