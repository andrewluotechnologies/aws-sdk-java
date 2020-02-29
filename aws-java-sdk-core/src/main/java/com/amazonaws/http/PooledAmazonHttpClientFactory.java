package com.amazonaws.http;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.metrics.RequestMetricCollector;

import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

public class PooledAmazonHttpClientFactory extends AbstractAmazonHttpClientFactory {
    private class Parameters {
        ClientConfiguration config;
        RequestMetricCollector requestMetricCollector;
        boolean useBrowserCompatibleHostNameVerifier;
        boolean calculateCRC32FromCompressedData;

        public Parameters(ClientConfiguration config, RequestMetricCollector requestMetricCollector, boolean useBrowserCompatibleHostNameVerifier, boolean calculateCRC32FromCompressedData) {
            this.config = config;
            this.requestMetricCollector = requestMetricCollector;
            this.useBrowserCompatibleHostNameVerifier = useBrowserCompatibleHostNameVerifier;
            this.calculateCRC32FromCompressedData = calculateCRC32FromCompressedData;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Parameters that = (Parameters) o;

            if (useBrowserCompatibleHostNameVerifier != that.useBrowserCompatibleHostNameVerifier) return false;
            if (calculateCRC32FromCompressedData != that.calculateCRC32FromCompressedData) return false;
            if (config != null ? !config.equals(that.config) : that.config != null) return false;
            return requestMetricCollector != null ? requestMetricCollector.equals(that.requestMetricCollector) : that.requestMetricCollector == null;
        }

        @Override
        public int hashCode() {
            int result = config != null ? config.hashCode() : 0;
            result = 31 * result + (requestMetricCollector != null ? requestMetricCollector.hashCode() : 0);
            result = 31 * result + (useBrowserCompatibleHostNameVerifier ? 1 : 0);
            result = 31 * result + (calculateCRC32FromCompressedData ? 1 : 0);
            return result;
        }
    }

    private Map<Parameters, WeakReference<AmazonHttpClient>> pool = Collections.synchronizedMap(new WeakHashMap<Parameters, WeakReference<AmazonHttpClient>>());

    @Override
    public AmazonHttpClient create(ClientConfiguration config,
                                   RequestMetricCollector requestMetricCollector,
                                   boolean useBrowserCompatibleHostNameVerifier,
                                   boolean calculateCRC32FromCompressedData) {
        WeakReference<AmazonHttpClient> clientRef = pool.get(new Parameters(config, requestMetricCollector, useBrowserCompatibleHostNameVerifier, calculateCRC32FromCompressedData));
        AmazonHttpClient client = null;
        if (clientRef != null) {
            client = clientRef.get();
        }

        if (client == null) {
            client = new AmazonHttpClientImpl(config,
                                             requestMetricCollector,
                                             useBrowserCompatibleHostNameVerifier,
                                             calculateCRC32FromCompressedData);
        }
        return client;
    }
}
