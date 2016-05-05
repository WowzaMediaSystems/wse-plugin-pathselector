# MediaListPathSelector

MediaListPathSelector is a module for [Wowza Streaming Engine™ media server software](https://www.wowza.com/products/streaming-engine) that allows you to specify a different path for the media content in a Synchronized Multimedia Integration Language (SMIL) file. Normally, the media files must reside in teh same location as the SMIL file or in a sub folder below it. This module allows the SMIL file and media files to be separated.

## Prerequisites

Wowza Streaming Engine 4.0.0 or later is required.

## Usage

With a VOD application, when a SMIL file is read by Wowza Streaming Engine, the location of the SMIL file will be prepended to all of the content paths listed in the SMIL file. If the actual content location is the same as for the SMIL file or in a subfolder below the SMIL file then this is OK but if the content is located on a different path or in a folder above the SMIL file folder then it can cause problems. When the actual media file is processed, this module will check the media file path against a list of prefixes and strip of any prefix that matches so the original media path defined in the SMIL file will be used.

## API Reference

[Wowza Streaming Engine Server-Side API Reference](https://www.wowza.com/resources/WowzaStreamingEngine_ServerSideAPI.pdf)

[How to extend Wowza Streaming Engine using the Wowza IDE](https://www.wowza.com/forums/content.php?759-How-to-extend-Wowza-Streaming-Engine-using-the-Wowza-IDE)

Wowza Media Systems™ provides developers with a platform to create streaming applications and solutions. See [Wowza Developer Tools](https://www.wowza.com/resources/developers) to learn more about our APIs and SDK.

To use the compiled version of this module, see [How to use different locations for SMIL files and VOD assets (MediaListPathSelector)](https://www.wowza.com/forums/content.php?645-How-to-use-different-locations-for-SMIL-files-and-VOD-assets-(MediaListPathSelector)).

## Contact

[Wowza Media Systems, LLC](https://www.wowza.com/contact)

## License

This code is distributed under the [Wowza Public License](https://github.com/WowzaMediaSystems/wse-plugin-sourceselector/blob/master/LICENSE.txt).
