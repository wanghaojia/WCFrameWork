package org.wcframework.util;

/**
 * @author haojia.wang
 * @Package org.wcframework.util
 * @Description 验证条件，不满足条件抛出异常工具类
 * @date 2018/4/25 17:04
 */
public class Assert {

    /**
     * 非空验证，为空抛出异常
     * @param array 需要验证的数据
     * @param message 为空异常信息
     */
    public static void noNullElements(Object[] array, String message) {
        if (array != null) {
            for (Object element : array) {
                if (element == null) {
                    throw new IllegalArgumentException(message);
                }
            }
        }
    }

}
