package com.jpaexample.domain.code

/**
 * Created with IntelliJ IDEA.
 * User: jsungnam
 * Date: 15. 2. 12
 * Time: 오전 11:07
 * To change this template use File | Settings | File Templates.
 */
public enum DepType implements TeraCode {
    SUCCESS(1), FAIL(2), COMPLETE(3), PIPE(4)


    DepType(Integer code) {
        this.code = code;
    }

    @Override
    public Integer getCode() {
        return this.code;
    }

    private Integer code;
}