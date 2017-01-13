package com.datastreams.domain.tera

/**
 * Created by smpark on 2017-01-12.
 */
class LinePointPK implements Serializable{

    Integer prjId

    Integer prjVerId

    Integer blockId

    Integer sequence

    Integer sequence2

    @Override
    public int hashCode(){
        return super.hashCode()
    }

    @Override
    public boolean equals(Object obj){
        super.equals(obj)
    }
}
