package com.khipu.auth;

import com.khipu.Pair;
import com.khipu.ApiClient;

import java.util.Map;
import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-06T16:08:59.116-03:00")
public interface Authentication {
  /** Apply authentication settings to header and query params. */
  void applyToParams(ApiClient apiClient, String basePath, String path, String method, List<Pair> queryParams, Map<String, String> headerParams, Map<String, Object> formParams);
}