package pengq.common.mapper.annotation;

import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.core.annotation.AliasFor;
import tk.mybatis.spring.mapper.MapperFactoryBean;

import java.lang.annotation.*;

/**
 * Created By pengq On 2018/9/29 20:58
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Documented
@tk.mybatis.spring.annotation.MapperScan
public @interface MapperScan {
    @AliasFor(
            annotation = tk.mybatis.spring.annotation.MapperScan.class
    )
    String[] value() default {};

    String[] basePackages() default {};

    Class<?>[] basePackageClasses() default {};

    Class<? extends BeanNameGenerator> nameGenerator() default BeanNameGenerator.class;

    Class<? extends Annotation> annotationClass() default Annotation.class;

    Class<?> markerInterface() default Class.class;

    String sqlSessionTemplateRef() default "";

    String sqlSessionFactoryRef() default "";

    Class<? extends MapperFactoryBean> factoryBean() default MapperFactoryBean.class;

    String[] properties() default {};

    String mapperHelperRef() default "";
}

