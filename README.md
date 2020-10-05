# MediaListPathSelector

The **ModuleMediaListPathSelector** module for [Wowza Streaming Engine™ media server software](https://www.wowza.com/products/streaming-engine) enables you to specify a different path for media content referenced in Synchronized Multimedia Integration Language (SMIL) files. Normally, the media content files must reside in the same location as the SMIL file or in a subfolder below it. This module allows the SMIL and media files to be separated.

This repo includes a [compiled version](/lib/wse-plugin-pathselector.jar).

## Prerequisites

Wowza Streaming Engine 4.0.0 or later is required.

## Usage

With VOD applications, when a SMIL file is read by Wowza Streaming Engine, the SMIL file location is prepended to all of the content paths defined in the SMIL file. This works if the referenced content is stored in the same folder as the SMIL file or in a subfolder below the folder that has the SMIL file.

Use this module in situations where the referenced content and SMIL file are stored in different directory paths or where the content is stored in a folder above the SMIL file folder in the same path. When the content files are processed, this module checks the path against a list of prefixes and removes any prepended prefixes that match so the original content path defined in the SMIL file is used.

## More resources
To use the compiled version of this module, see [Store SMIL files and VOD assets in different locations with a Wowza Streaming Engine Java module](https://www.wowza.com/docs/how-to-use-different-locations-for-smil-files-and-vod-assets-modulemedialistpathselector).

[Wowza Streaming Engine Server-Side API Reference](https://www.wowza.com/resources/serverapi/)

[How to extend Wowza Streaming Engine using the Wowza IDE](https://www.wowza.com/docs/how-to-extend-wowza-streaming-engine-using-the-wowza-ide)

Wowza Media Systems™ provides developers with a platform to create streaming applications and solutions. See [Wowza Developer Tools](https://www.wowza.com/developer) to learn more about our APIs and SDK.

## Contact

[Wowza Media Systems, LLC](https://www.wowza.com/contact)

## License

This code is distributed under the [Wowza Public License](/LICENSE.txt).
