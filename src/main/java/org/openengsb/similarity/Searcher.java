/**
 * Licensed to the Austrian Association for Software Tool Integration (AASTI)
 * under one or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information regarding copyright
 * ownership. The AASTI licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.openengsb.similarity;

import java.util.ArrayList;
import java.util.List;

import org.openengsb.core.api.edb.EDBObject;

public interface Searcher {

    /**
     * Checks the Index if there are colliding objects for one sample
     */
    List<String> findCollisions(EDBObject sample);

    /**
     * Checks the Index if there are colliding objects for a list of samples
     */
    List<ArrayList<String>> findCollisions(List<EDBObject> samples);

    /**
     * query the index with lucene syntax
     */
    ArrayList<String> query(String searchString);

}
