package com.pagoda.bgkj.api.mm;

import com.pagoda.bgkj.api.dto.mm.*;
import com.pagoda.bgkj.api.*;
import io.swagger.annotations.*;

import java.io.Serializable;
import java.rmi.Remote;
import org.springframework.validation.annotation.Validated;

/**
 * testApplyTab服务接口testApplyTabService，可以添加自定义的业务接口。
 *
 * @author ???
 */
@Validated
@Api(value = "testApplyTab", description = "testApplyTab api")
public interface testApplyTabService extends Remote, BasetestApplyTabService {}
