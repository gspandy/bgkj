package com.pagoda.bgkj.api.mm;

import com.pagoda.bgkj.api.dto.mm.*;
import com.pagoda.bgkj.api.*;
import io.swagger.annotations.*;

import java.io.Serializable;
import java.rmi.Remote;
import org.springframework.validation.annotation.Validated;

/**
 * TestAddress服务接口TestAddressService，可以添加自定义的业务接口。
 *
 * @author ???
 */
@Validated
@Api(value = "TestAddress", description = "TestAddress api")
public interface TestAddressService extends Remote, BaseTestAddressService {}
