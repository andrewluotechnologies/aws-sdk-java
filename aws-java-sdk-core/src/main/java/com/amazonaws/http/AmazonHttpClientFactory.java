package com.amazonaws.http;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.metrics.RequestMetricCollector;

public interface AmazonHttpClientFactory {
    AmazonHttpClient create(ClientConfiguration config);
    AmazonHttpClient create(ClientConfiguration config,
                            RequestMetricCollector requestMetricCollector);
    AmazonHttpClient create(ClientConfiguration config,
                            RequestMetricCollector requestMetricCollector,
                            boolean useBrowserCompatibleHostNameVerifier);
    AmazonHttpClient create(ClientConfiguration config,
                            RequestMetricCollector requestMetricCollector,
                            boolean useBrowserCompatibleHostNameVerifier,
                            boolean calculateCRC32FromCompressedData);
}
