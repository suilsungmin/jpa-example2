package com.datastreams.domain.code

/**
 * Created with IntelliJ IDEA.
 * User: jsungnam
 * Date: 15. 2. 10
 * Time: 오전 9:20
 * To change this template use File | Settings | File Templates.
 */
enum BlockType implements TeraCode {
    EXT_CMD(1), USER_SCL(2), SGM(3), CONVERTER(4), JOIN(5), TSS(6), MESSAGE(7),
    UNLOAD(8), LOAD(9), REPORT(10), USQL(11), CHECK(12), MEMO(13), TEMP(14),
    CONTROL(15), PRJ_EXEC(16), SPLIT_MERGE(17), INTERFACE(18), SAP(19), TRANSFER(20);

    BlockType(Integer code) {
        this.code = code;
    }
    @Override
    public Integer getCode() {
        return this.code;
    }

    private Integer code;
}
