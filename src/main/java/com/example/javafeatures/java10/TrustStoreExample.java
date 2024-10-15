package com.example.javafeatures.java10;

import javax.net.ssl.*;
import java.security.KeyStore;
import java.io.FileInputStream;

public class TrustStoreExample {
    public static void main(String[] args) throws Exception {
        // Load the KeyStore
        KeyStore trustStore = KeyStore.getInstance("JKS");
        try (FileInputStream trustStoreStream = new FileInputStream("path/to/truststore.jks")) {
            trustStore.load(trustStoreStream, "password".toCharArray());
        }

        // Create TrustManagerFactory
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init(trustStore);

        // Create SSLContext
        SSLContext sslContext = SSLContext.getInstance("TLS");
        sslContext.init(null, trustManagerFactory.getTrustManagers(), null);

        // Use SSLContext in an HTTPS connection
        HttpsURLConnection.setDefaultSSLSocketFactory(sslContext.getSocketFactory());

        // Now you can perform HTTPS requests securely with the trust store loaded
    }
}