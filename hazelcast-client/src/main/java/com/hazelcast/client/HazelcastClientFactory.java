/*
 * Copyright (c) 2008-2016, Hazelcast, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hazelcast.client;

import com.hazelcast.client.config.ClientConfig;
import com.hazelcast.client.impl.ClientConnectionManagerFactory;
import com.hazelcast.client.impl.HazelcastClientInstanceImpl;
import com.hazelcast.client.impl.HazelcastClientProxy;

/***
 * This is interface which provides capability for Hazelcast client factories customization;
 * It's implementation can be changed and passed to the HazelcastClientManager's constructors;
 */
public interface HazelcastClientFactory<T extends HazelcastClientInstanceImpl,
        V extends HazelcastClientProxy,
        C extends ClientConfig> {
    T createHazelcastInstanceClient(C config,
                                    ClientConnectionManagerFactory hazelcastClientFactory);

    V createProxy(T client);
}
