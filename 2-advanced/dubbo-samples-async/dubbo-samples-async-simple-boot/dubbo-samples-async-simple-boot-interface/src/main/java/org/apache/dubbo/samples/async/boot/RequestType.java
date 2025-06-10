package org.apache.dubbo.samples.async.boot;

public class RequestType {
    private String someName;
    private String someType;
    private SomeInnerType innerType;

    public String getSomeName() {
        return someName;
    }

    public void setSomeName(String someName) {
        this.someName = someName;
    }

    public String getSomeType() {
        return someType;
    }

    public void setSomeType(String someType) {
        this.someType = someType;
    }

    public SomeInnerType getInnerType() {
        return innerType;
    }

    public void setInnerType(SomeInnerType innerType) {
        this.innerType = innerType;
    }
}
