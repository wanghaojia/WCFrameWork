package org.wcframework.entity;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @author haojia.wang
 * @version v1.0
 * @Package org.wcframework.entity
 * @Description 测试实体，使用注解方式注入实体
 * @date 2018/3/9 11:53
 */
@Component
public class DemoAnnotationEntity  implements Serializable {

    private static final long serialVersionUID = 1273822905598363157L;

    /** 测试参数1，类型：String */
    private String param1;

    /** 测试参数2，类型：Integer */
    private Integer param2;

    /** 测试参数3、类型：Boolean */
    private Boolean param3;

    public String getParam1() {
        return param1;
    }

    public void setParam1(String param1) {
        this.param1 = param1;
    }

    public Integer getParam2() {
        return param2;
    }

    public void setParam2(Integer param2) {
        this.param2 = param2;
    }

    public Boolean getParam3() {
        return param3;
    }

    public void setParam3(Boolean param3) {
        this.param3 = param3;
    }

}
