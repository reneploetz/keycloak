package org.keycloak.test.framework.annotations;

import org.keycloak.test.framework.injection.LifeCycle;
import org.keycloak.test.framework.realm.DefaultRealmConfig;
import org.keycloak.test.framework.realm.RealmConfig;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface InjectRealm {

    Class<? extends RealmConfig> config() default DefaultRealmConfig.class;

    LifeCycle lifecycle() default LifeCycle.CLASS;

    String ref() default "";

    boolean createRealm() default true;

}
