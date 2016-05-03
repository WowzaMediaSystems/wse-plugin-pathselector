# ModuleSourceSelector

ModuleSourceSelector is a module for [Wowza Streaming Engine™ media server software](https://www.wowza.com/products/streaming-engine) that allows you to specify a different path for a Synchronized Multimedia Integration Language (SMIL) file from the adaptive bitrate streams that it references. Normally the SMIL file and the video on demand (VOD) assets are required to be stored in the same folder.

## Prerequisites

Wowza Streaming Engine 4.0.0 or later is required.

## Usage

This Media Reader can be added to a new or existing VOD application type.

It is a custom RandonAccessReader class that provides the following functionality:

* Different locations for the SMIL file and the content it references, including Media Cache sources.

## API Reference

[Wowza Streaming Engine Server-Side API Reference](https://www.wowza.com/resources/WowzaStreamingEngine_ServerSideAPI.pdf)

[How to extend Wowza Streaming Engine using the Wowza IDE](https://www.wowza.com/forums/content.php?759-How-to-extend-Wowza-Streaming-Engine-using-the-Wowza-IDE)

Wowza Media Systems™ provides developers with a platform to create streaming applications and solutions. See [Wowza Developer Tools](https://www.wowza.com/resources/developers) to learn more about our APIs and SDK.

To use the compiled version of this module, see [How to mix audio and video from different live sources (ModuleSourceSelector](https://www.wowza.com/forums/content.php?645-How-to-use-different-Media-Cache-Sources-for-SMIL-files-and-VOD-assets-%28MediaCacheSourceSelector%29).

## Contact

[Wowza Media Systems, LLC](https://www.wowza.com/contact)

## License

This code is distributed under the [Wowza Public License](https://github.com/WowzaMediaSystems/wse-plugin-sourceselector/blob/master/LICENSE.txt).
