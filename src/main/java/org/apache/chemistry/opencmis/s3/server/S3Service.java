package org.apache.chemistry.opencmis.s3.server;

import org.apache.chemistry.opencmis.commons.data.*;
import org.apache.chemistry.opencmis.commons.definitions.TypeDefinition;
import org.apache.chemistry.opencmis.commons.definitions.TypeDefinitionList;
import org.apache.chemistry.opencmis.commons.enums.IncludeRelationships;
import org.apache.chemistry.opencmis.commons.impl.server.AbstractCmisService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigInteger;
import java.util.List;

public class S3Service extends AbstractCmisService {

    private static final Logger LOG = LoggerFactory.getLogger(S3Service.class);


    @Override
    public List<RepositoryInfo> getRepositoryInfos(ExtensionsData extensionsData) {
        return null;
    }

    @Override
    public TypeDefinitionList getTypeChildren(String s, String s1, Boolean aBoolean, BigInteger bigInteger, BigInteger bigInteger1, ExtensionsData extensionsData) {
        return null;
    }

    @Override
    public TypeDefinition getTypeDefinition(String s, String s1, ExtensionsData extensionsData) {
        return null;
    }

    @Override
    public ObjectInFolderList getChildren(String s, String s1, String s2, String s3, Boolean aBoolean, IncludeRelationships includeRelationships, String s4, Boolean aBoolean1, BigInteger bigInteger, BigInteger bigInteger1, ExtensionsData extensionsData) {
        return null;
    }

    @Override
    public List<ObjectParentData> getObjectParents(String s, String s1, String s2, Boolean aBoolean, IncludeRelationships includeRelationships, String s3, Boolean aBoolean1, ExtensionsData extensionsData) {
        return null;
    }

    @Override
    public ObjectData getObject(String s, String s1, String s2, Boolean aBoolean, IncludeRelationships includeRelationships, String s3, Boolean aBoolean1, Boolean aBoolean2, ExtensionsData extensionsData) {
        return null;
    }
}
