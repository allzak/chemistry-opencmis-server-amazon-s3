package org.apache.chemistry.opencmis.s3.server;

import org.apache.chemistry.opencmis.commons.server.CallContext;
import org.apache.chemistry.opencmis.commons.server.CmisService;
import org.apache.chemistry.opencmis.server.async.impl.AbstractAsyncServiceFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class S3ServiceFactoryImpl extends AbstractAsyncServiceFactory {

    private static final Logger LOG = LoggerFactory.getLogger(S3ServiceFactoryImpl.class);

    @Override
    public CmisService getService(CallContext callContext) {
        return null;
    }
}
