package com.github.siboxd.fatturapa.model.digitalsignature;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import java.util.List;


/**
 * Transforms<br>
 * Generated using Android JAXB<br>
 *
 * @link https://github.com/yeshodhan/android-jaxb
 */
@Root(name = "Transforms")
@Namespace(reference = "http://www.w3.org/2000/09/xmldsig#")
public class Transforms {

    @ElementList(name = "Transform", entry = "Transform", inline = true, required = true)
    private List<Transform> transform;

    public Transforms() {
    }

    public List<Transform> getTransform() {
        return transform;
    }

    public void setTransform(List<Transform> transform) {
        this.transform = transform;
    }

}
