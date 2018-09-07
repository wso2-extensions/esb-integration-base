/*
* Copyright (c) 2018, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
* WSO2 Inc. licenses this file to you under the Apache License,
* Version 2.0 (the "License"); you may not use this file except
* in compliance with the License.
* you may obtain a copy of the License at
*
*   http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing,
* software distributed under the License is distributed on an
* "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
* KIND, either express or implied.  See the License for the
* specific language governing permissions and limitations
* under the License.
*/
package org.wso2.connector.integration.test.base;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.wso2.carbon.automation.engine.exceptions.AutomationFrameworkException;
import org.wso2.carbon.automation.engine.extensions.ExecutionListenerExtension;
import static org.wso2.connector.integration.test.base.ConnectorIntegrationTestBase.addCertificatesToTestKeyStore;

import java.io.IOException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;

/**
 * This class use to add certificates to the key store.
 */
public class KeyStoreManagerExtension extends ExecutionListenerExtension {

    private static final Log log = LogFactory.getLog(KeyStoreManagerExtension.class);

    public void initiate() throws AutomationFrameworkException {
        try {
            addCertificatesToTestKeyStore("wso2carbon.jks", "wso2carbon");
        } catch (CertificateException e) {
            log.error("Failed to add the certificate to the carbon keystore.", e);
        } catch (NoSuchAlgorithmException e) {
            log.error("Failed to add the certificate to the carbon keystore.", e);
        } catch (KeyStoreException e) {
            log.error("Error occurred while trying to load the carbon keystore.", e);
        } catch (IOException e) {
            log.error("Failed to find the certificate.", e);
        }
    }

    public void onExecutionStart() throws AutomationFrameworkException {

    }

    public void onExecutionFinish() throws AutomationFrameworkException {

    }
}
