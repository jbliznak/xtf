package cz.xtf.junit5.annotations;

import cz.xtf.junit5.extensions.SinceVersionCondition;
import org.junit.jupiter.api.extension.ExtendWith;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE})
@Repeatable(SinceVersions.class)
@ExtendWith(SinceVersionCondition.class)
public @interface SinceVersion {

	String name();

	String image();

	String since();

	String jira() default "";
}
