/*
 * Copyright 2015 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
*/

package org.drools.core.util;

public interface Predicate<T> {
    boolean apply(T item);

    public static class PassAll implements Predicate<Object> {
        public static final PassAll INSTANCE = new PassAll();

        public boolean apply(Object item) {
            return true;
        }
    }
}
