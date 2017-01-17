package com.jpaexample.domain.code

import javax.persistence.AttributeConverter

/**
 * Created by smpark on 2017-01-17.
 */
class DepTypeConverter implements AttributeConverter<DepType,Integer> {

    @Override
    Integer convertToDatabaseColumn(DepType attribute) {
        return attribute.code
    }

    @Override
    DepType convertToEntityAttribute(Integer dbData) {
        return DepType.values().find {
            return it.code == dbData
        }
    }
}