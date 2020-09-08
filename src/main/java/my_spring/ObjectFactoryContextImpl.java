package my_spring;

public class ObjectFactoryContextImpl implements ObjectFactoryContext {
    private static final ObjectFactory objectFactory = ObjectFactory.getInstance();

    public ObjectFactoryContextImpl(){}

    public ObjectFactoryContextImpl(Config config) {
        objectFactory.setConfig(config);

    }


    @Override
    public <T> T getObjectFactoryInstance(Class<T> c) {
        return objectFactory.createObject(c);
    }
}
