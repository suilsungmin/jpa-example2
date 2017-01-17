package com.jpaexample.domain.code

import com.jpaexample.domain.code.BlockStatus

import javax.persistence.AttributeConverter

/**
 * Created by smpark on 2017-01-17.
 */
class BlockStatusConverter implements AttributeConverter<BlockStatus, Integer>{
    @Override
    Integer convertToDatabaseColumn(BlockStatus attribute) {
        return attribute.code
    }

    @Override
    BlockStatus convertToEntityAttribute(Integer dbData) {
        return BlockStatus.values().find {
            return it.code == dbData
        }
    }
}
