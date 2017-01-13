package com.datastreams.domain.code

/**
 * Created with IntelliJ IDEA.
 * User: jsungnam
 * Date: 15. 3. 2
 * Time: 오전 10:34
 * To change this template use File | Settings | File Templates.
 */
public enum ProjectExecutionStatus implements TeraCode {
    STOPPED(-1), CREATED(0), SUCCEED(1), FAILED(2), RUNNING(3)

    private Integer code;

    ProjectExecutionStatus(Integer code) {
        this.code = code
    }

    @Override
    Integer getCode() {
        return code
    }
}