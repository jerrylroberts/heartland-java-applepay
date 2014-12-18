package com.hps.integrator.tests.testdata;

import com.hps.integrator.abstractions.IHpsServicesConfig;
import com.hps.integrator.services.HpsServicesConfig;

public class TestServicesConfig {
	
	public static final String SERVICE_URI = "https://posgateway.cert.secureexchange.net/Hps.Exchange.PosGateway/PosGatewayService.asmx?wsdl";

    public static IHpsServicesConfig validServicesConfig() {
        HpsServicesConfig config = new HpsServicesConfig();
        config.setSecretAPIKey("skapi_cert_MYl2AQAowiQAbLp5JesGKh7QFkcizOP2jcX9BrEMqQ");
        config.setDeveloperId("123456");
        config.setVersionNumber("1234");
        config.setServiceUri(SERVICE_URI);

        return config;
    }
}