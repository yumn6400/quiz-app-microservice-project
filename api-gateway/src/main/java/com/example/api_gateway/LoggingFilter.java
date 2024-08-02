package com.example.api_gateway;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@Component
@Order(1) // Order is important if you have multiple filters
public class LoggingFilter implements GlobalFilter {

    private static final Logger logger = LoggerFactory.getLogger(LoggingFilter.class);

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        String requestPath = exchange.getRequest().getPath().toString();
        String method = exchange.getRequest().getMethod().name();
        String host = exchange.getRequest().getURI().getHost();
        int port = exchange.getRequest().getURI().getPort();

        logger.info("Request received: Path={}, Method={}, Host={}, Port={}", requestPath, method, host, port);

        return chain.filter(exchange);
    }
}
