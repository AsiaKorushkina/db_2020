package my_spring;

public interface ProxyConfigurer {
    <T> T getProxy(T t);
}
