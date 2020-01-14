// IGNORE_BACKEND_FIR: JVM_IR
// TARGET_BACKEND: JVM
// reason - multifile tests are not supported in JS tests
//FILE: JavaClass.java
import org.jetbrains.annotations.*;

class JavaClass {
    public static @NotNull Long get() { return 2364137526064485012L; }
}

//FILE: test.kt

import JavaClass

fun box(): String {
    return if (JavaClass.get() > 0) "OK" else "fail"
}