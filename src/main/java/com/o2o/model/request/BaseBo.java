package com.o2o.model.request;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;


public class BaseBo {
    @JSONField(serialize = false, deserialize = false)
    private static Validator validator;

    public Validator getValidator() {
        setUp();
        return validator;
    }

    private static void setUp() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

    public <T> String valid(T model, Class<?>... groups) {

        Set<ConstraintViolation<T>> constraintViolations = this
                .getValidator().validate(model, groups);

        for (ConstraintViolation<T> c : constraintViolations) {
            return c.getPropertyPath() + ":" + c.getMessage();
        }
        return null;
    }
}
