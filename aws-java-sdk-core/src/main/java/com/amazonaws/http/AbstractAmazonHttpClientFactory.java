package com.amazonaws.http;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.metrics.RequestMetricCollector;

public abstract class AbstractAmazonHttpClientFactory implements AmazonHttpClientFactory {
    @Override
    public AmazonHttpClient create(ClientConfiguration config) {
        return create(config, null);
    }

    @Override
    public AmazonHttpClient create(ClientConfiguration config,
                                   RequestMetricCollector requestMetricCollector) {
        return create(config, requestMetricCollector, false);
    }

    @Override
    public AmazonHttpClient create(ClientConfiguration config,
                                   RequestMetricCollector requestMetricCollector,
                                   boolean useBrowserCompatibleHostNameVerifier) {
        return create(config, requestMetricCollector, useBrowserCompatibleHostNameVerifier, false);
    }
}
