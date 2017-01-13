package com.jpaexample.domain.tera
/**
 * Created by smpark on 2017-01-12.
 */
class BlockDatasPK implements Serializable{
    Integer prjId

    Integer prjVerId

    Integer blockId

//    Integer datafileBlockId
//
//    Integer datafilePrjId
//
//    Integer datafilePrjVerIdd

    @Override
    public int hashCode(){
        return super.hashCode()
    }

    @Override
    public boolean equals(Object obj){
        super.equals(obj)
    }
}
