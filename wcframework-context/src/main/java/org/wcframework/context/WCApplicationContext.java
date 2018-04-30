package org.wcframework.context;

import org.wcframework.util.WCEnvironment;

/**
 * @author haojia.wang
 * @Package org.wcframework.context
 * @Description 上下文
 * @date 2018/4/25 16:34
 */
public abstract class WCApplicationContext {

    private WCEnvironment environment;

    /**
     * 刷新上下文
     */
    public void refresh(){

    }

    public WCEnvironment getEnvironment() {
        if (this.environment == null) {
            this.environment = this.createEnvironment();
        }
        return this.environment;
    }

    protected WCEnvironment createEnvironment() {
        return new WCEnvironment();
    }
}
