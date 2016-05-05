/*
 * This code and all components (c) Copyright 2006 - 2016, Wowza Media Systems, LLC. All rights reserved.
 * This code is licensed pursuant to the Wowza Public License version 1.0, available at www.wowza.com/legal.
 */
package com.wowza.wms.plugin.pathselector;

import java.io.IOException;

import com.wowza.io.DirectRandomAccessReader;
import com.wowza.io.IRandomAccessReader;
import com.wowza.io.ITrackRandomAccessReaderPerformance;
import com.wowza.util.IOPerformanceCounter;
import com.wowza.wms.application.IApplicationInstance;
import com.wowza.wms.logging.WMSLoggerFactory;
import com.wowza.wms.stream.IMediaReader;
import com.wowza.wms.stream.IMediaStream;

public class RandomAccessReaderMediaListPathSelector implements IRandomAccessReader, ITrackRandomAccessReaderPerformance
{
	public static final String CLASS_NAME = "RandomAccessReaderMediaListPathSelector";

	private IRandomAccessReader reader = null;
	private String prefixes = "";

	private IRandomAccessReader getReader(IApplicationInstance appInstance)
	{
		IRandomAccessReader localReader = null;

		String readerClassName = appInstance.getProperties().getPropertyStr(ModuleMediaListPathSelector.PROP_NAME_PREFIX + "RandomAccessReaderClass", ModuleMediaListPathSelector.SOURCE_SELECTOR_RANDOM_ACCESS_READER_CLASS);
		if (!readerClassName.equals(ModuleMediaListPathSelector.SOURCE_SELECTOR_RANDOM_ACCESS_READER_CLASS))
		{
			try
			{
				Class<?> readerClass = Class.forName(readerClassName);
				if (readerClass != null)
					localReader = (IRandomAccessReader)readerClass.newInstance();
			}
			catch (Exception e)
			{
				WMSLoggerFactory.getLoggerObj(appInstance).error(CLASS_NAME + ".getReader() Cannot load randomAccessReaderClass :" + readerClassName);
			}
		}
		else
		{
			localReader = new DirectRandomAccessReader();
		}
		return localReader;
	}

	@Override
	public void init(IApplicationInstance appInstance, IMediaStream stream, String basePath, String mediaName, String mediaExtension)
	{
		reader = getReader(appInstance);
		prefixes = appInstance.getProperties().getPropertyStr(ModuleMediaListPathSelector.PROP_NAME_PREFIX + "Prefixes", prefixes);

		if (appInstance.getMediaReaderContentType(mediaExtension) != IMediaReader.CONTENTTYPE_MEDIALIST) // SMIL
		{
			for (String prefix : prefixes.split(","))
			{
				prefix = prefix.trim();
				int idx = mediaName.indexOf(prefix);
				if (idx >= 0)
				{
					mediaName = mediaName.substring(idx, mediaName.length());
					break;
				}
			}

		}
		reader.init(appInstance, stream, basePath, mediaName, mediaExtension);
	}

	@Override
	public void setStreamIOTracker(IOPerformanceCounter ioPerforamnceCounter)
	{
		if (reader instanceof ITrackRandomAccessReaderPerformance)
			((ITrackRandomAccessReaderPerformance)reader).setStreamIOTracker(ioPerforamnceCounter);
	}

	@Override
	public void setClientIOTracker(IOPerformanceCounter ioPerforamnceCounter)
	{
		if (reader instanceof ITrackRandomAccessReaderPerformance)
			((ITrackRandomAccessReaderPerformance)reader).setClientIOTracker(ioPerforamnceCounter);
	}

	@Override
	public void open() throws IOException
	{
		reader.open();
	}

	@Override
	public void close() throws IOException
	{
		reader.close();
	}

	@Override
	public boolean isOpen()
	{
		return reader.isOpen();
	}

	@Override
	public long getFilePointer()
	{
		return reader.getFilePointer();
	}

	@Override
	public void seek(long pos)
	{
		reader.seek(pos);
	}

	@Override
	public int read(byte[] buf, int off, int size)
	{
		return reader.read(buf, off, size);
	}

	@Override
	public int getDirecton()
	{
		return reader.getDirecton();
	}

	@Override
	public void setDirecton(int directon)
	{
		reader.setDirecton(directon);
	}

	@Override
	public String getBasePath()
	{
		return reader.getBasePath();
	}

	@Override
	public String getMediaName()
	{
		return reader.getMediaName();
	}

	@Override
	public String getMediaExtension()
	{
		return reader.getMediaExtension();
	}

	@Override
	public boolean exists()
	{
		return reader.exists();
	}

	@Override
	public long lastModified()
	{
		return reader.lastModified();
	}

	@Override
	public long length()
	{
		return reader.length();
	}

	@Override
	public String getPath()
	{
		return reader.getPath();
	}
}
