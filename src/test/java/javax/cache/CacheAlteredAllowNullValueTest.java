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
 * Test Cache using Altered Null Value strategy.
 * TODO: This test must be deleted once we commit to a design
 *
 * @see javax.cache.implementation.RICache#DEFAULT_ALLOW_NULL_VALUE
 */
public class CacheAlteredAllowNullValueTest extends CacheTest {
    protected boolean isAllowNullValue() {
        return !super.isAllowNullValue();
    }
}