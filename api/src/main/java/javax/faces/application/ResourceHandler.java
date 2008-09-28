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
package javax.faces.application;

import javax.faces.context.FacesContext;

/**
 * @author Simon Lessard (latest modification by $Author: slessard $)
 * @version $Revision: 696523 $ $Date: 2008-09-24 18:31:37 -0400 (mer., 17 sept. 2008) $
 * 
 * @since 2.0
 */
public abstract class ResourceHandler
{
    public static final String LOCALE_PREFIX = "javax.faces.resource.localePrefix";
    public static final String RESOURCE_EXCLUDES_DEFAULT_VALUE = ".class .jsp .jspx .properties .xhtml";
    public static final String RESOURCE_EXCLUDES_PARAM_NAME = "javax.faces.RESOURCE_EXLCUDES";
    public static final String RESOURCE_IDENTIFIER = "/javax.faces.resource";
    
    public abstract Resource createResource(String resourceName);
    
    public abstract Resource createResource(String resourceName, String libraryName);
    
    public abstract Resource createResource(String resourceName, String libraryName, String contentType);
    
    public abstract String getRendererTypeForResourceName(String resourceName);
    
    public abstract void handleResourceRequest(FacesContext context);
    
    public abstract boolean isResourceRequest(FacesContext context);
    
    public abstract  boolean libraryExists(String libraryName);
}
