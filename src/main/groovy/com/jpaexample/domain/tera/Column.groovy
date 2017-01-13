package com.jpaexample.domain.tera

import java.sql.ResultSet

/**
 * Created with IntelliJ IDEA.
 * User: jsungnam
 * Date: 15. 4. 6
 * Time: 오전 10:31
 * To change this template use File | Settings | File Templates.
 */
class Column {
    Column(ResultSet rs) {
        this.tableCategory = rs.getString("TABLE_CAT")
        this.tableSchema = rs.getString("TABLE_SCHEM")
        this.tableName = rs.getString("TABLE_NAME")
        this.columnName = rs.getString("COLUMN_NAME")
        this.dataType = rs.getInt("DATA_TYPE")
        this.typeName = rs.getString("TYPE_NAME")
        this.columnSize = rs.getInt("COLUMN_SIZE")
        this.decimalDigits = rs.getInt("DECIMAL_DIGITS")
        this.numPrecRadix = rs.getInt("NUM_PREC_RADIX")
        this.nullable = rs.getInt("NULLABLE")
        this.remarks = rs.getString("REMARKS")
        this.columnDef = rs.getString("COLUMN_DEF")
        this.charOctetLength = rs.getInt("CHAR_OCTET_LENGTH")
        this.ordinalPosition = rs.getInt("ORDINAL_POSITION")
        this.isNullable = rs.getString("IS_NULLABLE")
        this.scopeCatalog = rs.getString("SCOPE_CATALOG")
        this.scopeSchema = rs.getString("SCOPE_SCHEMA")
        this.scopeTable = rs.getString("SCOPE_TABLE")
        this.sourceDataType = rs.getInt("SOURCE_DATA_TYPE")
        this.isAutoIncrement = rs.getString("IS_AUTO_INCREMENT")
    }

    Column() {

    }

    String tableCategory
    String tableSchema
    String tableName
    String columnName
    Integer dataType
    String typeName
    Integer columnSize
    Integer decimalDigits
    Integer numPrecRadix
    Integer nullable
    String remarks
    String columnDef
    Integer charOctetLength
    Integer ordinalPosition
    String isNullable
    String scopeCatalog
    String scopeSchema
    String scopeTable
    Integer sourceDataType
    String isAutoIncrement
}
