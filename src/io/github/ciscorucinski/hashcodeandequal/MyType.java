package io.github.ciscorucinski.hashcodeandequal;

import java.util.Arrays;

@SuppressWarnings("unused")
public class MyType {

    private boolean booleanField;
    private byte byteField;
    private char charField;
    private short shortField;
    private int intField;
    private long longField;
    private float floatField;
    private double doubleField;
    private int[] arrayField;
    private String referenceField;
    private Object nullableReferenceField;

    MyType(boolean _bool, byte _byte, char _char, short _short, int _int, long _long, float _float,
           double _double, int[] _array, String _string, Object _object) {

        booleanField = _bool;
        byteField = _byte;
        charField = _char;
        shortField = _short;
        intField = _int;
        longField = _long;
        floatField = _float;
        doubleField = _double;
        arrayField = _array;
        referenceField = _string;
        nullableReferenceField = _object;
    }

    @Override
    public int hashCode() {

        // Start with a non-zero constant. Prime is preferred
        int result = 17;

        // Include a hash for each field.

        // Primitives

        result = 31 * result + (booleanField ? 1 : 0);                   // 1 bit   » 32-bit

        result = 31 * result + byteField;                                // 8 bits  » 32-bit
        result = 31 * result + charField;                                // 16 bits » 32-bit
        result = 31 * result + shortField;                               // 16 bits » 32-bit
        result = 31 * result + intField;                                 // 32 bits » 32-bit

        result = 31 * result + (int) (longField ^ (longField >>> 32));    // 64 bits » 32-bit

        result = 31 * result + Float.floatToIntBits(floatField);         // 32 bits » 32-bit

        long doubleFieldBits = Double.doubleToLongBits(doubleField);     // 64 bits (double) » 64-bit (long) » 32-bit (int)
        result = 31 * result + (int) (doubleFieldBits ^ (doubleFieldBits >>> 32));

        // Objects

        result = 31 * result + Arrays.hashCode(arrayField);              // var bits » 32-bit

        result = 31 * result + referenceField.hashCode();                // var bits » 32-bit (non-nullable)
        result = 31 * result +                                           // var bits » 32-bit (nullable)
                (nullableReferenceField == null
                        ? 0
                        : nullableReferenceField.hashCode());

        return result;

    }

    @Override
    public boolean equals(Object o) {

        // Optimization (not required).
        if (this == o) {
            return true;
        }

        // Return false if the other object has the wrong type, interface, or is null.
        if (!(o instanceof MyType)) {
            return false;
        }

        MyType lhs = (MyType) o; // lhs means "left hand side"

                // Primitive fields
        return     booleanField == lhs.booleanField
                && byteField    == lhs.byteField
                && charField    == lhs.charField
                && shortField   == lhs.shortField
                && intField     == lhs.intField
                && longField    == lhs.longField
                && floatField   == lhs.floatField
                && doubleField  == lhs.doubleField

                // Arrays

                && Arrays.equals(arrayField, lhs.arrayField)

                // Objects

                && referenceField.equals(lhs.referenceField)
                && (nullableReferenceField == null
                            ? lhs.nullableReferenceField == null
                            : nullableReferenceField.equals(lhs.nullableReferenceField));
    }

}
