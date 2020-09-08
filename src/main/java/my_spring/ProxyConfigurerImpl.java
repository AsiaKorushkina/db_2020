package my_spring;

import heroes.RandomUtil;
import org.reflections.ReflectionUtils;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyConfigurerImpl implements ProxyConfigurer {
    @Override
    public <T> T getProxy(T t) {
        Class<?> implClass = t.getClass();
        var methods = ReflectionUtils.getAllMethods(implClass);
        for (var method : methods) {
            if (method.isAnnotationPresent(Benchmark.class)) {
                return (T) Proxy.newProxyInstance(implClass.getClassLoader(), implClass.getInterfaces(), new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                        System.out.println("************* BENCHMARK STARTED for method " + method.getName() + " ****************");
                        long start = System.nanoTime();
                        Object retVal = method.invoke(t, args);
                        long end = System.nanoTime();
                        System.out.println(end - start);
                        System.out.println("************* BENCHMARK ENDED for method " + method.getName() + " ****************");
                        return retVal;
                    }
                });
            }
        }
        return t;
    }
}
