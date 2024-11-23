
package com.api_gateway.exception;

import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.server.ServerWebExchange;
import org.springframework.web.server.WebExceptionHandler;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
public class GatewayExceptionHandler implements WebExceptionHandler {

  @Override
  public Mono<Void> handle(ServerWebExchange exchange, Throwable ex) {
    if (ex instanceof ResponseStatusException) {
      return Mono.error(ex);
    }
    return Mono.error(new RuntimeException("Error inesperado en el API Gateway"));
  }
}
