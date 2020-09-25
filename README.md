# FatturaPA Model [![Build Status](https://travis-ci.com/EnricoSiboni/fatturapa-model.svg?branch=master)](https://travis-ci.com/EnricoSiboni/fatturapa-model) [![Release](https://jitpack.io/v/EnricoSiboni/fatturapa-model.svg)](https://jitpack.io/#EnricoSiboni/fatturapa-model) [![License: MIT](https://img.shields.io/badge/License-MIT-lightgray.svg)](https://github.com/EnricoSiboni/fatturapa-model/blob/master/LICENSE)
Model classes for Italian Electronic Invoicing ([Fatturazione Elettronica](https://www.fatturapa.gov.it/export/fatturazione/it/normativa/f-2.htm)) with annotations to be transformed to XML format thanks to [SimpleXML](http://simple.sourceforge.net/) framework.

## Work in progress...

At the moment it contains classes generated automatically from **Official** Italian E-Invoice [XML Schema Definition](https://www.fatturapa.gov.it/export/fatturazione/sdi/fatturapa/v1.2.1/Schema_del_file_xml_FatturaPA_versione_1.2.1.xsd) thanks to [android-jaxb project](https://github.com/EnricoSiboni/android-jaxb) conversion tool.


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
    implementation 'com.github.EnricoSiboni:fatturapa-model:{latest-version}'
}
```
Where *latest-version* can be a version number (found in releases page) or branch name adding `-SNAPSHOT` at the end, to fetch that branch version.

More detail at [JitPack.io documentation](https://jitpack.io/docs/#building-with-jitpack)

---

**Note:** For usage in *Android* environment you should exclude a dependnecy that would conflict with your build, when creating an APK, in that way:
```gradle
dependencies {
    implementation 'com.github.EnricoSiboni:fatturapa-model:{latest-version}', {
        exclude group: "xpp3", module: "xpp3"
    }
}
```

That's because Android has internally the same classes, and that results in name clashes.
