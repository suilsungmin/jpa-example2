package com.jpaexample.domain.code

/**
 * Created with IntelliJ IDEA.
 * User: jsungnam
 * Date: 15. 2. 13
 * Time: 오후 5:53
 * To change this template use File | Settings | File Templates.
 */
enum RoleType implements TeraCode {
    ALL(0), STDIN(1), STDOUT(2), STDERR(3), JUDGE(4)

    private final Integer code

    RoleType(Integer code) {
        this.code = code
    }

    @Override
    Integer getCode() {
        return code  //To change body of implemented methods use File | Settings | File Templates.
    }
}
