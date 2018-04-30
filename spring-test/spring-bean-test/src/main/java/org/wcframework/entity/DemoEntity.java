package org.wcframework.entity;

import java.io.Serializable;

/**
 * @author haojia.wang
 * @version v1.0
 * @Package org.wcframework.entity
 * @Description 测试实体，使用xml配置注入实体
 * @date 2018/3/6 15:56
 */
public class DemoEntity implements Serializable{

    private static final long serialVersionUID = 626611689104546642L;

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
