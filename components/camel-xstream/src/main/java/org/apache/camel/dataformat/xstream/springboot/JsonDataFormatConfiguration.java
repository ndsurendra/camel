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
package org.apache.camel.dataformat.xstream.springboot;

import org.apache.camel.dataformat.xstream.JsonDataFormat;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Camel XStream support
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@ConfigurationProperties(prefix = "camel.dataformat.json")
public class JsonDataFormatConfiguration {

    /**
     * Lookup and use the existing ObjectMapper with the given id when using
     * Jackson.
     */
    private String objectMapper;
    /**
     * To enable pretty printing output nicely formatted. Is by default false.
     */
    private Boolean prettyPrint = false;
    /**
     * Which json library to use such.
     */
    private JsonLibrary library = JsonLibrary.XStream;
    /**
     * Class name of the java type to use when unarmshalling
     */
    private String unmarshalTypeName;
    /**
     * When marshalling a POJO to JSON you might want to exclude certain fields
     * from the JSON output. With Jackson you can use JSON views to accomplish
     * this. This option is to refer to the class which has JsonView annotations
     */
    private Class jsonView;
    /**
     * If you want to marshal a pojo to JSON and the pojo has some fields with
     * null values. And you want to skip these null values you can set this
     * option to NOT_NULL
     */
    private String include;
    /**
     * Used for JMS users to allow the JMSType header from the JMS spec to
     * specify a FQN classname to use to unmarshal to.
     */
    private Boolean allowJmsType = false;
    /**
     * Refers to a custom collection type to lookup in the registry to use. This
     * option should rarely be used but allows to use different collection types
     * than java.util.Collection based as default.
     */
    private String collectionTypeName;
    /**
     * To unarmshal to a List of Map or a List of Pojo.
     */
    private Boolean useList = false;
    /**
     * Whether to enable the JAXB annotations module when using jackson. When
     * enabled then JAXB annotations can be used by Jackson.
     */
    private Boolean enableJaxbAnnotationModule = false;
    /**
     * To use custom Jackson modules com.fasterxml.jackson.databind.Module
     * specified as a String with FQN class names. Multiple classes can be
     * separated by comma.
     */
    private String moduleClassNames;
    /**
     * To use custom Jackson modules referred from the Camel registry. Multiple
     * modules can be separated by comma.
     */
    private String moduleRefs;
    /**
     * Set of features to enable on the Jackson
     * com.fasterxml.jackson.databind.ObjectMapper. The features should be a
     * name that matches a enum from
     * com.fasterxml.jackson.databind.SerializationFeature
     * com.fasterxml.jackson.databind.DeserializationFeature or
     * com.fasterxml.jackson.databind.MapperFeature Multiple features can be
     * separated by comma
     */
    private String enableFeatures;
    /**
     * Set of features to disable on the Jackson
     * com.fasterxml.jackson.databind.ObjectMapper. The features should be a
     * name that matches a enum from
     * com.fasterxml.jackson.databind.SerializationFeature
     * com.fasterxml.jackson.databind.DeserializationFeature or
     * com.fasterxml.jackson.databind.MapperFeature Multiple features can be
     * separated by comma
     */
    private String disableFeatures;
    /**
     * Adds permissions that controls which Java packages and classes XStream is
     * allowed to use during unmarshal from xml/json to Java beans. A permission
     * must be configured either here or globally using a JVM system property.
     * The permission can be specified in a syntax where a plus sign is allow
     * and minus sign is deny. Wildcards is supported by using . as prefix. For
     * example to allow com.foo and all subpackages then specfy com.foo..
     * Multiple permissions can be configured separated by comma such as
     * com.foo.-com.foo.bar.MySecretBean. The following default permission is
     * always included: -java.lang.java.util. unless its overridden by
     * specifying a JVM system property with they key
     * org.apache.camel.xstream.permissions.
     */
    private String permissions;

    public String getObjectMapper() {
        return objectMapper;
    }

    public void setObjectMapper(String objectMapper) {
        this.objectMapper = objectMapper;
    }

    public Boolean getPrettyPrint() {
        return prettyPrint;
    }

    public void setPrettyPrint(Boolean prettyPrint) {
        this.prettyPrint = prettyPrint;
    }

    public JsonLibrary getLibrary() {
        return library;
    }

    public void setLibrary(JsonLibrary library) {
        this.library = library;
    }

    public String getUnmarshalTypeName() {
        return unmarshalTypeName;
    }

    public void setUnmarshalTypeName(String unmarshalTypeName) {
        this.unmarshalTypeName = unmarshalTypeName;
    }

    public Class getJsonView() {
        return jsonView;
    }

    public void setJsonView(Class jsonView) {
        this.jsonView = jsonView;
    }

    public String getInclude() {
        return include;
    }

    public void setInclude(String include) {
        this.include = include;
    }

    public Boolean getAllowJmsType() {
        return allowJmsType;
    }

    public void setAllowJmsType(Boolean allowJmsType) {
        this.allowJmsType = allowJmsType;
    }

    public String getCollectionTypeName() {
        return collectionTypeName;
    }

    public void setCollectionTypeName(String collectionTypeName) {
        this.collectionTypeName = collectionTypeName;
    }

    public Boolean getUseList() {
        return useList;
    }

    public void setUseList(Boolean useList) {
        this.useList = useList;
    }

    public Boolean getEnableJaxbAnnotationModule() {
        return enableJaxbAnnotationModule;
    }

    public void setEnableJaxbAnnotationModule(Boolean enableJaxbAnnotationModule) {
        this.enableJaxbAnnotationModule = enableJaxbAnnotationModule;
    }

    public String getModuleClassNames() {
        return moduleClassNames;
    }

    public void setModuleClassNames(String moduleClassNames) {
        this.moduleClassNames = moduleClassNames;
    }

    public String getModuleRefs() {
        return moduleRefs;
    }

    public void setModuleRefs(String moduleRefs) {
        this.moduleRefs = moduleRefs;
    }

    public String getEnableFeatures() {
        return enableFeatures;
    }

    public void setEnableFeatures(String enableFeatures) {
        this.enableFeatures = enableFeatures;
    }

    public String getDisableFeatures() {
        return disableFeatures;
    }

    public void setDisableFeatures(String disableFeatures) {
        this.disableFeatures = disableFeatures;
    }

    public String getPermissions() {
        return permissions;
    }

    public void setPermissions(String permissions) {
        this.permissions = permissions;
    }
}