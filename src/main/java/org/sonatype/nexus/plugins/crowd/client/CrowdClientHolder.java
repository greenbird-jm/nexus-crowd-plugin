/*
 * Copyright (c) 2010 Sonatype, Inc. All rights reserved.
 *
 * This program is licensed to you under the Apache License Version 2.0,
 * and you may not use this file except in compliance with the Apache License Version 2.0.
 * You may obtain a copy of the Apache License Version 2.0 at http://www.apache.org/licenses/LICENSE-2.0.
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the Apache License Version 2.0 is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Apache License Version 2.0 for the specific language governing permissions and limitations there under.
 */
package org.sonatype.nexus.plugins.crowd.client;

import org.sonatype.nexus.plugins.crowd.caching.CachingAuthenticationManager;
import org.sonatype.nexus.plugins.crowd.client.rest.RestClient;

/**
 * Interface that allows the various client components of the Crowd plugin to
 * access the Crowd client library.
 *
 * @author Justin Edelson
 * @author Issa Gorissen
 */
public interface CrowdClientHolder {
    public boolean isConfigured();
    public CachingAuthenticationManager getAuthenticationManager();
    public RestClient getRestClient();
}
