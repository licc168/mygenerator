package com.licc.common.exception.handler;


/**
 * 统一异常处理
 */

public class WebApplicationExceptionMapper
      {

 /* @Override
  public Response toResponse(Throwable e) {
    e.printStackTrace();
    // 自定义业务异常
    if (e instanceof EbaseRuntimeException) {
      return RestResult.failure(((EbaseRuntimeException) e).getErrorCode(), e.getMessage());
    }
    // 参数异常
    if (e instanceof IllegalArgumentException) {
      return RestResult.failure(CommonErrorCode.ILLEGAL_ARGUMENT, e.getMessage());
    }
    // 未知异常
    return RestResult.failure(CommonErrorCode.UNKNOW, e.getMessage());
  }*/

}