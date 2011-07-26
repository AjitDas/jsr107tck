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
package manager;

import java.util.HashMap;
import java.util.Map;

import javax.cache.interceptor.CacheRemoveAll;
import javax.cache.interceptor.CacheRemoveEntry;
import javax.cache.interceptor.CacheResult;
import javax.cache.interceptor.CacheKeyParam;


import domain.Blog;

/**
 * 
 * @author Rick Hightower
 * 
 */
public class UsingDefaultCacheNameBlogManagerImpl implements BlogManager {

    /**
     * 
     */
    private static Map<String, Blog> map = new HashMap<String, Blog>();

    /**
     * 
     */
    @CacheResult
    public Blog getEntryCached(String title) {
        return map.get(title);
    }

    /**
     * 
     */
    public Blog getEntryRaw(String title) {
        return map.get(title);
    }

    /** (non-Javadoc)
     * @see manager.BlogManager#clearEntryFromCache(java.lang.String)
     */
    @CacheRemoveEntry(cacheName="manager.UsingDefaultCacheNameBlogManagerImpl.getEntryCached(java.lang.String)")
    public void clearEntryFromCache(String title) {
    }

    /** (non-Javadoc)
     * @see manager.BlogManager#clearEntry(java.lang.String)
     */
    public void clearEntry(String title) {
        map.put(title, null);
    }

    /** (non-Javadoc)
     * @see manager.BlogManager#clearCache()
     */
    @CacheRemoveAll(cacheName="manager.UsingDefaultCacheNameBlogManagerImpl.getEntryCached(java.lang.String)")
    public void clearCache() {
    }

    /** (non-Javadoc)
     * @see manager.BlogManager#createEntry(domain.Blog)
     */
    public void createEntry(Blog blog) {
        map.put(blog.getTitle(), blog);
    }
    
    /**
     * 
     */
    @CacheResult
    public Blog getEntryCached(String randomArg, @CacheKeyParam String title, String randomArg2) {
        return map.get(title);
    }


}