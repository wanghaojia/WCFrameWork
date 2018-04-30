package org.wcframework.exception;

/**
 * @author haojia.wang
 * @Package org.wcframework
 * @Description 异常类
 * @date 2018/4/25 17:00
 */
public class WCException extends RuntimeException {

    public WCException(String msg) {
        super(msg);
    }

    public WCException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public Throwable getRootCause() {
        Throwable rootCause = null;

        for(Throwable cause = this.getCause(); cause != null && cause != rootCause; cause = cause.getCause()) {
            rootCause = cause;
        }

        return rootCause;
    }


    public boolean contains(Class<?> exType) {
        if (exType == null) {
            return false;
        } else if (exType.isInstance(this)) {
            return true;
        } else {
            Throwable cause = this.getCause();
            if (cause == this) {
                return false;
            } else if (cause instanceof WCException) {
                return ((WCException)cause).contains(exType);
            } else {
                while(cause != null) {
                    if (exType.isInstance(cause)) {
                        return true;
                    }

                    if (cause.getCause() == cause) {
                        break;
                    }

                    cause = cause.getCause();
                }

                return false;
            }
        }
    }


}
