package my_spring;

public interface ObjectFactoryContext {
    <T> T getObjectFactoryInstance(Class<T> c);
}
