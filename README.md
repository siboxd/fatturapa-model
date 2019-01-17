# FatturaPA Model [![Build Status](https://travis-ci.com/siboXD/fatturapa-model.svg?branch=master)](https://travis-ci.com/siboXD/fatturapa-model) [![Release](https://jitpack.io/v/siboxd/fatturapa-model.svg)](https://jitpack.io/#siboxd/fatturapa-model)
Model classes for Italian Elotronic Invoicing ([Fatturazione Elettronica](https://www.fatturapa.gov.it/export/fatturazione/it/normativa/f-2.htm)) with annotations to be transformed to XML format thanks to [SimpleXML](http://simple.sourceforge.net/) framework.

## Work in progress...

At the moment it contains classes generated automatically from **Official** Italian E-Invoice [XML Schema Definition](https://www.fatturapa.gov.it/export/fatturazione/sdi/fatturapa/v1.2.1/Schema_del_file_xml_FatturaPA_versione_1.2.1.xsd) thanks to [android-jaxb project](https://github.com/siboXD/android-jaxb) conversion tool.


### Usage

Add it to your `build.gradle`, specifying repository, with:
```gradle
allprojects {
    repositories {
        maven { url "https://jitpack.io" }
    }
}
```
and adding dependency with:

```gradle
dependencies {
    implementation 'com.github.siboxd:fatturapa-model:{latest-version}'
}
```
Where *latest-version* can be a version number (found in releases page) or branch name adding `-SNAPSHOT` at the end, to fetch that branch version.

More detail at [JitPack.io documentation](https://jitpack.io/docs/#building-with-jitpack)
