/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.snakeyaml.springboot;

import org.apache.camel.component.snakeyaml.SnakeYAMLDataFormat;
import org.apache.camel.model.dataformat.YAMLLibrary;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Camel SnakeYAML support
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@ConfigurationProperties(prefix = "camel.dataformat.yaml")
public class SnakeYAMLDataFormatConfiguration {

    /**
     * Which yaml library to use such. Is by default SnakeYAML
     */
    private YAMLLibrary library = YAMLLibrary.SnakeYAML;
    /**
     * Class name of the java type to use when unarmshalling
     */
    private String unmarshalTypeName;
    /**
     * BaseConstructor to construct incoming documents.
     */
    private String constructor;
    /**
     * Representer to emit outgoing objects.
     */
    private String representer;
    /**
     * DumperOptions to configure outgoing objects.
     */
    private String dumperOptions;
    /**
     * Resolver to detect implicit type
     */
    private String resolver;
    /**
     * Use ApplicationContextClassLoader as custom ClassLoader
     */
    private Boolean useApplicationContextClassLoader = true;
    /**
     * Force the emitter to produce a pretty YAML document when using the flow
     * style.
     */
    private Boolean prettyFlow = false;

    public YAMLLibrary getLibrary() {
        return library;
    }

    public void setLibrary(YAMLLibrary library) {
        this.library = library;
    }

    public String getUnmarshalTypeName() {
        return unmarshalTypeName;
    }

    public void setUnmarshalTypeName(String unmarshalTypeName) {
        this.unmarshalTypeName = unmarshalTypeName;
    }

    public String getConstructor() {
        return constructor;
    }

    public void setConstructor(String constructor) {
        this.constructor = constructor;
    }

    public String getRepresenter() {
        return representer;
    }

    public void setRepresenter(String representer) {
        this.representer = representer;
    }

    public String getDumperOptions() {
        return dumperOptions;
    }

    public void setDumperOptions(String dumperOptions) {
        this.dumperOptions = dumperOptions;
    }

    public String getResolver() {
        return resolver;
    }

    public void setResolver(String resolver) {
        this.resolver = resolver;
    }

    public Boolean getUseApplicationContextClassLoader() {
        return useApplicationContextClassLoader;
    }

    public void setUseApplicationContextClassLoader(
            Boolean useApplicationContextClassLoader) {
        this.useApplicationContextClassLoader = useApplicationContextClassLoader;
    }

    public Boolean getPrettyFlow() {
        return prettyFlow;
    }

    public void setPrettyFlow(Boolean prettyFlow) {
        this.prettyFlow = prettyFlow;
    }
}