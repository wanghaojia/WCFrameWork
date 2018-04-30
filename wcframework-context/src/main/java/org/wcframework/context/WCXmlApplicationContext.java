package org.wcframework.context;

import org.wcframework.util.Assert;

/**
 * @author haojia.wang
 * @Package org.wcframework.context
 * @Description 读取xml配置文件加载上下文
 * @date 2018/4/25 16:52
 */
public class WCXmlApplicationContext extends WCApplicationContext{

    /** 配置文件路径 */
    private String[] configLocations;

    public WCXmlApplicationContext(String... configLocations) {
        this(configLocations, true);
    }

    public WCXmlApplicationContext(String[] configLocations,boolean refresh){
        this.setConfigLocations(configLocations);
        if (refresh) {
            this.refresh();
        }
    }

    /**
     * 设置配置文件路径
     * @param locations 文件路径
     */
    public void setConfigLocations(String... locations) {
        if (locations != null) {
            Assert.noNullElements(locations, "Config locations must not be null");
            this.configLocations = new String[locations.length];

            for(int i = 0; i < locations.length; ++i) {
                this.configLocations[i] = this.resolvePath(locations[i]).trim();
            }
        } else {
            this.configLocations = null;
        }

    }

    /**
     * 对文件路径做处理
     * @param path
     * @return
     */
    protected String resolvePath(String path) {
        return this.getEnvironment().resolveRequiredPlaceholders(path);//处理文件路径中的占位符
    }
}
