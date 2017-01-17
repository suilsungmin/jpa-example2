package com.jpaexample.common

import javax.persistence.AttributeConverter;
import java.text.SimpleDateFormat;
/**
 * Created by smpark on 2017-01-16.
 */

public class LocalDateTimePersistenceConverter implements AttributeConverter<String, Date> {
    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss")

    @Override
    Date convertToDatabaseColumn(String attribute) {
        return simpleDateFormat.parse(attribute)
    }

    @Override
    String convertToEntityAttribute(Date dbData) {
        return simpleDateFormat.format(dbData)
    }
}
