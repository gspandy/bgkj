package com.pagoda.bgkj.api.mm;

import com.pagoda.bgkj.api.dto.mm.*;
import com.pagoda.bgkj.api.*;
import io.swagger.annotations.*;

import java.io.Serializable;
import java.rmi.Remote;
import org.springframework.validation.annotation.Validated;

/**
 * TestOrder服务接口TestOrderService，可以添加自定义的业务接口。
 *
 * @author ???
 */
@Validated
@Api(value = "TestOrder", description = "TestOrder api")
public interface TestOrderService extends Remote, BaseTestOrderService {}
