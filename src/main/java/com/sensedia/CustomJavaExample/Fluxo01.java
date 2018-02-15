package com.sensedia.CustomJavaExample;

import com.sensedia.interceptor.externaljar.annotation.ApiSuiteInterceptor;
import com.sensedia.interceptor.externaljar.annotation.InterceptorMethod;
import com.sensedia.interceptor.externaljar.dto.ApiCallData;

@ApiSuiteInterceptor
public class Fluxo01 {

	@InterceptorMethod
	public void setarHeaderRequest(ApiCallData apiCallData) {
		apiCallData.request.addHeader("exec01", "adicionado no request");
	}

	@InterceptorMethod
	public void setarHeaderResponse(ApiCallData apiCallData) {
		apiCallData.response.addHeader("exec02", "adicionado no response");
	}

}