/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
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
package org.apache.myfaces.config.impl.element;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.myfaces.config.element.FaceletsTemplateMapping;
import org.apache.myfaces.config.element.ViewPoolMapping;

/**
 * 
 * @author Leonardo Uribe
 * @since 2.1.0
 */
public class FacesConfigExtensionImpl extends org.apache.myfaces.config.element.FacesConfigExtension
{
    private static final long serialVersionUID = 7624583794474223864L;
    
    private List<org.apache.myfaces.config.element.FaceletsProcessing> _faceletsProcessingList;
    
    private List<ViewPoolMapping> viewPoolMappings;
    private transient List<ViewPoolMapping> unmodifiableViewPoolMappings;

    private List<FaceletsTemplateMapping> faceletsTemplateMappings;
    private transient List<FaceletsTemplateMapping> unmodifiableFaceletsTemplateMappings;
    
    @Override
    public List<org.apache.myfaces.config.element.FaceletsProcessing> getFaceletsProcessingList()
    {
        if (_faceletsProcessingList == null)
        {
            return Collections.emptyList();
        }
        return _faceletsProcessingList;
    }
    
    public void addFaceletsProcessing(org.apache.myfaces.config.element.FaceletsProcessing elem)
    {
        if (_faceletsProcessingList == null)
        {
            _faceletsProcessingList = new ArrayList<>(5);
        }
        _faceletsProcessingList.add(elem);
    }
    
    @Override
    public List<ViewPoolMapping> getViewPoolMappings()
    {
        if (viewPoolMappings == null)
        {
            return Collections.emptyList();
        }
        if (unmodifiableViewPoolMappings == null)
        {
            unmodifiableViewPoolMappings = 
                Collections.unmodifiableList(viewPoolMappings);
        }
        return unmodifiableViewPoolMappings;
    }
    
    public void addViewPoolMapping(ViewPoolMapping mapping)
    {
        if (viewPoolMappings == null)
        {
            viewPoolMappings = new ArrayList<>(5);
        }
        viewPoolMappings.add(mapping);
    }
    
    @Override
    public List<FaceletsTemplateMapping> getFaceletsTemplateMappings()
    {
        if (faceletsTemplateMappings == null)
        {
            return Collections.emptyList();
        }
        if (unmodifiableFaceletsTemplateMappings == null)
        {
            unmodifiableFaceletsTemplateMappings = 
                Collections.unmodifiableList(faceletsTemplateMappings);
        }
        return unmodifiableFaceletsTemplateMappings;
    }
    
    public void addFaceletsTemplateMapping(FaceletsTemplateMapping mapping)
    {
        if (faceletsTemplateMappings == null)
        {
            faceletsTemplateMappings = new ArrayList<>(5);
        }
        faceletsTemplateMappings.add(mapping);
    }
}
