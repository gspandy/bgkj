package com.pagoda.bgkj.api.ww;

import com.pagoda.bgkj.api.dto.ww.*;
import com.pagoda.bgkj.api.*;
import io.swagger.annotations.*;

import java.io.Serializable;
import java.rmi.Remote;
import org.springframework.validation.annotation.Validated;

/**
 * TestMM服务接口TestMMService，可以添加自定义的业务接口。
 *
 * @author ???
 */
@Validated
@Api(value = "TestMM", description = "TestMM api")
public interface TestMMService extends Remote, BaseTestMMService {}
