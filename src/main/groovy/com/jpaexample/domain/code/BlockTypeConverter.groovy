package com.jpaexample.domain.code

import javax.persistence.AttributeConverter
/**
 * Created by smpark on 2017-01-17.
 */
class BlockTypeConverter implements AttributeConverter<BlockType,Integer> {

    @Override
    Integer convertToDatabaseColumn(BlockType attribute) {
        return attribute.code
    }

    @Override
    BlockType convertToEntityAttribute(Integer dbData) {
        return BlockType.values().find {
            return it.code == dbData
        }
    }
}
