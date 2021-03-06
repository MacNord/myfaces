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
package org.apache.myfaces.view.facelets.test.component;

import jakarta.faces.component.FacesComponent;
import jakarta.faces.component.UIPanel;

/**
 *
 * @author Leonardo Uribe
 */
@FacesComponent(value="oam.my.UIPanel2", createTag=true, tagName="myUIPanel2",
        namespace="http://my.coolorganization.org/tags")
public class MyUIPanel2 extends UIPanel
{
    
    public MyUIPanel2()
    {
        super();
        setRendererType("oam.my.UIPanel2");
    }
    
}
