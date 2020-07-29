/*
 *  Copyright (c) 2020, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.connector.integration.test.base;

import org.apache.commons.io.FileUtils;
import org.wso2.carbon.automation.engine.exceptions.AutomationFrameworkException;
import org.wso2.carbon.automation.engine.extensions.ExecutionListenerExtension;

import java.io.File;
import java.io.IOException;

public class CopyConnectorZipToResources extends ExecutionListenerExtension {
    @Override
    public void initiate() throws AutomationFrameworkException {

    }

    @Override
    public void onExecutionStart() throws AutomationFrameworkException {
        try {
            String connectorZipPath = System.getProperty("connector_repo") + "/" + System.getProperty("connector_name") + "-connector-" + System.getProperty("connector_version") + ".zip";
            String resourcePath = System.getProperty("framework.resource.location") + "/artifacts/ESB/server/repository/deployment/server/synapse-libs";
            File source = new File(connectorZipPath);
            File dest = new File(resourcePath);
            FileUtils.copyFileToDirectory(source, dest);
        } catch (IOException e) {
            throw new AutomationFrameworkException("Error when copying newly built connector zip into test resources.", e);
        }
    }

    @Override
    public void onExecutionFinish() throws AutomationFrameworkException {

    }
}
