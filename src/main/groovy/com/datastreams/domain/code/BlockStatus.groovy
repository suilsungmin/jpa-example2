package com.datastreams.domain.code

/**
 * Created with IntelliJ IDEA.
 * User: jsungnam
 * Date: 15. 2. 13
 * Time: 오후 5:50
 * To change this template use File | Settings | File Templates.
 */
enum BlockStatus implements TeraCode{
    COPIED(0), INITIALIZED(1), TESTING(2), RUNNING(3), FAIL(4), SUCCESS(5)

    private final Integer code

    BlockStatus(Integer code) {
        this.code = code
    }

    @Override
    Integer getCode() {
        return code
    }
}
