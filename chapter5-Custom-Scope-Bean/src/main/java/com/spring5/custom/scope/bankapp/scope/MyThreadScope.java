package com.spring5.custom.scope.bankapp.scope;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class MyThreadScope implements Scope {

    private final ThreadLocal<Object> myThreadScope = new ThreadLocal<Object>() {
        protected Map<String, Object> initialValue() {
            System.out.println("initialize ThreadLocal");
            return new HashMap<String, Object>();
        }
    };

    @SuppressWarnings("unchecked")
    @Override
    public Object get(String name, ObjectFactory<?> objectFactory) {
        Map<String, Object> scope = (Map<String, Object>) myThreadScope.get();
        System.out.println("getting object from scope.");
        Object object = scope.get(name);
        if (object == null) {
            object = objectFactory.getObject();
            scope.put(name, object);
        }
        return object;
    }

    @Override
    public String getConversationId() {
        return null;
    }

    @Override
    public void registerDestructionCallback(String name, Runnable callback) {
    }

    @Override
    public Object remove(String name) {
        System.out.println("removing object from scope.");
        @SuppressWarnings("unchecked")
        Map<String, Object> scope = (Map<String, Object>) myThreadScope.get();
        return scope.remove(name);
    }

    @Override
    public Object resolveContextualObject(String name) {
        return null;
    }
}
