package etu1769.framework.util;

public class Mapping {
    String className;
    String method;

    public Mapping(String className, String method){
        setClassName(className);
        setMethod(method);
    }
    public String getClassName(){
        return className;
    }
    public String getMethod() {
        return method;
    }
    public void setClassName(String className) {
        this.className = className;
    }
    public void setMethod(String method) {
        this.method = method;
    }
}
