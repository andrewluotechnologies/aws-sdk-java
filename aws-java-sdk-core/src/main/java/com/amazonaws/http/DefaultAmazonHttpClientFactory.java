package com.amazonaws.http;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.metrics.RequestMetricCollector;

public class DefaultAmazonHttpClientFactory extends AbstractAmazonHttpClientFactory {
    @Override
    public AmazonHttpClient create(ClientConfiguration config,
                                   RequestMetricCollector requestMetricCollector,
                                   boolean useBrowserCompatibleHostNameVerifier,
                                   boolean calculateCRC32FromCompressedData) {
        return new AmazonHttpClientImpl(config,
                requestMetricCollector,
                useBrowserCompatibleHostNameVerifier,
                calculateCRC32FromCompressedData);
    }
}
