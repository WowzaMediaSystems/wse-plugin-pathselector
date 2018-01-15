/*
 * This code and all components (c) Copyright 2006 - 2018, Wowza Media Systems, LLC. All rights reserved.
 * This code is licensed pursuant to the Wowza Public License version 1.0, available at www.wowza.com/legal.
 */
package com.wowza.wms.plugin.pathselector;

import com.wowza.wms.application.*;
import com.wowza.wms.module.*;
import com.wowza.wms.stream.IMediaReader;

public class ModuleMediaListPathSelector extends ModuleBase
{
	public static final String MODULE_NAME = "ModuleMediaListPathSelector";
	public static final String PROP_NAME_PREFIX = "pathSelector";
	
	public static final String SOURCE_SELECTOR_RANDOM_ACCESS_READER_CLASS = "com.wowza.wms.plugin.pathselector.RandomAccessReaderMediaListPathSelector";
	
	public void onAppStart(IApplicationInstance appInstance)
	{
		String randomAccessReaderClass = appInstance.getMediaReaderProperties().getPropertyStr("randomAccessReaderClass", IMediaReader.DEFAULT_RANDOMACCESSREADER);
		if(!SOURCE_SELECTOR_RANDOM_ACCESS_READER_CLASS.equals(randomAccessReaderClass))
		{
			appInstance.getMediaReaderProperties().setProperty("randomAccessReaderClass", SOURCE_SELECTOR_RANDOM_ACCESS_READER_CLASS);
		}
		appInstance.getProperties().setProperty(PROP_NAME_PREFIX + "RandomAccessReaderClass", randomAccessReaderClass);
	}
	
}
