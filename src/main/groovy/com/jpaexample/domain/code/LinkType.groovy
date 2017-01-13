package com.jpaexample.domain.code

/**
 * Created with IntelliJ IDEA.
 * User: jsungnam
 * Date: 15. 2. 12
 * Time: 오전 10:55
 * To change this template use File | Settings | File Templates.
 */
enum LinkType implements TeraCode {
    BEZIER(0), POLYLINE(1), PERPENDICULAR(2)

    private final Integer code

    LinkType(Integer code) {
        this.code = code
    }

    @Override
    Integer getCode() {
        return code
    }
}
