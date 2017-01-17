package com.jpaexample.domain.code

import com.jpaexample.domain.tera.DataFile

import javax.persistence.AttributeConverter

/**
 * Created by smpark on 2017-01-17.
 */
class DataFileConverter implements AttributeConverter<List<DataFile>, Integer>{
    @Override
    Integer convertToDatabaseColumn(List<DataFile> attribute) {
        return null
    }

    @Override
    List<DataFile> convertToEntityAttribute(Integer dbData) {
        return null
    }
}
