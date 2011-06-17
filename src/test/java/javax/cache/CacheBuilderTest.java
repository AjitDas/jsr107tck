/**
 *  Copyright 2011 Terracotta, Inc.
 *  Copyright 2011 Oracle, Inc.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package javax.cache;

/**
 * Unit tests for CacheManager
 * <p/>
 *
 * Implementers of Cache should subclass this test, overriding {@link #getCacheBuilder()}
 *
 * @author ycosmado
 * @since 1.0
 */
public class CacheBuilderTest {
    // ---------- utilities ----------

    /**
     * Create a cache builder instance
     *
     * @return a cache builder
     */
    protected CacheBuilder getCacheBuilder() {
        return TestInstanceFactory.getInstance().getCacheBuilder();
    }
}
