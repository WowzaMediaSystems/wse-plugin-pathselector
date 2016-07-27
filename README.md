# MediaListPathSelector

The **ModuleMediaListPathSelector** module for [Wowza Streaming Engine™ media server software](https://www.wowza.com/products/streaming-engine) enables you to specify a different path for media content referenced in Synchronized Multimedia Integration Language (SMIL) files. Normally, the media content files must reside in the same location as the SMIL file or in a subfolder below it. This module allows the SMIL and media files to be separated.

## Prerequisites

Wowza Streaming Engine 4.0.0 or later is required.

## Usage

With VOD applications, when a SMIL file is read by Wowza Streaming Engine, the SMIL file location is prepended to all of the content paths defined in the SMIL file. This works if the referenced content is stored in the same folder as the SMIL file or in a subfolder below the folder that has the SMIL file.

Use this module in situations where the referenced content and SMIL file are stored in different directory paths or where the content is stored in a folder above the SMIL file folder in the same path. When the content files are processed, this module checks the path against a list of prefixes and removes any prepended prefixes that match so the original content path defined in the SMIL file is used.

## More resources

[Wowza Streaming Engine Server-Side API Reference](https://www.wowza.com/resources/WowzaStreamingEngine_ServerSideAPI.pdf)

[How to extend Wowza Streaming Engine using the Wowza IDE](https://www.wowza.com/forums/content.php?759-How-to-extend-Wowza-Streaming-Engine-using-the-Wowza-IDE)

Wowza Media Systems™ provides developers with a platform to create streaming applications and solutions. See [Wowza Developer Tools](https://www.wowza.com/resources/developers) to learn more about our APIs and SDK.

To use the compiled version of this module, see [How to use different locations for SMIL files and VOD assets (MediaListPathSelector)](https://www.wowza.com/forums/content.php?645-How-to-use-different-locations-for-SMIL-files-and-VOD-assets-%28ModuleMediaListPathSelector%29).

## Contact

[Wowza Media Systems, LLC](https://www.wowza.com/contact)

## License

This code is distributed under the [Wowza Public License](https://github.com/WowzaMediaSystems/wse-plugin-pathselector/blob/master/LICENSE.txt).

![alt tag](http://wowzalogs.com/stats/githubimage.php?plugin=wse-plugin-pathselector)
