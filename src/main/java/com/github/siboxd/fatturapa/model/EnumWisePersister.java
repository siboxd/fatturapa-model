package com.github.siboxd.fatturapa.model;

import org.simpleframework.xml.core.Persister;
import org.simpleframework.xml.stream.Format;
import org.simpleframework.xml.transform.Matcher;
import org.simpleframework.xml.transform.Transform;

/**
 * A Persister which will use the Enum toString to determine the values to be written and parsed in xml files
 */
public class EnumWisePersister extends Persister {

    public EnumWisePersister() {
        super(enumWiseMatcher);
    }

    public EnumWisePersister(Format format) {
        super(enumWiseMatcher, format);
    }

    private static final Matcher enumWiseMatcher;

    static {
        enumWiseMatcher = new Matcher() {
            @SuppressWarnings("rawtypes")
            @Override
            public Transform match(Class type) throws Exception {
                if (type.isEnum()) {
                    return new MyEnumTransform(type);
                }
                return null;
            }
        };
    }

    /**
     * A custom transform object which will use Enum toString to determine enum values
     */
    @SuppressWarnings("rawtypes")
    private static class MyEnumTransform implements Transform<Enum> {
        private final Class type;

        public MyEnumTransform(Class type) {
            this.type = type;
        }

        public Enum read(String value) throws Exception {
            for (Object o : type.getEnumConstants()) {
                if (o.toString().equals(value)) {
                    return (Enum) o;
                }
            }
            return null;
        }

        public String write(Enum value) throws Exception {
            return value.toString();
        }
    }
}


