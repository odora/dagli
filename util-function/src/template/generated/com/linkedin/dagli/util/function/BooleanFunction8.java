// AUTOGENERATED CODE.  DO NOT MODIFY DIRECTLY!  Instead, please modify the util/function/Function.ftl file.
// See the README in the module's src/template directory for details.
package com.linkedin.dagli.util.function;

import com.linkedin.dagli.util.exception.Exceptions;


@FunctionalInterface
public interface BooleanFunction8<A, B, C, D, E, F, G, H> extends FunctionBase {
  boolean apply(A value1, B value2, C value3, D value4, E value5, F value6, G value7, H value8);

  /**
   * Returns a new function that wraps this "original" function.  The wrapping function will return false
   * without calling the original function if any argument is null.  If no argument is null, the original function will
   * be called as normal and its return value will be returned by the wrapping function.
   *
   * This is useful when you have a function that cannot accept a null as an argument but are satisfied to just return
   * a default value in such instances.
   *
   * @return a new function that calls this one if all arguments or non-null, or returns a default value otherwise.
   */
  default BooleanFunction8<A, B, C, D, E, F, G, H> returnFalseOnNullArgument() {
    return new BooleanDefaultOnNullArgument8<>(this);
  }

  default BooleanFunction8<A, B, C, D, E, F, G, H> negate() {
    return BooleanNegatedFunction8.negate(this);
  }

  static <A, B, C, D, E, F, G, H> BooleanFunction8<A, B, C, D, E, F, G, H> unchecked(
      Checked<A, B, C, D, E, F, G, H, ?> checkedFunction) {
    return (A value1, B value2, C value3, D value4, E value5, F value6, G value7, H value8) -> {
      try {
        return checkedFunction.apply(value1, value2, value3, value4, value5, value6, value7, value8);
      } catch (Throwable e) {
        throw Exceptions.asRuntimeException(e);
      }
    };
  }

  @FunctionalInterface
  interface Checked<A, B, C, D, E, F, G, H, X extends Throwable> extends FunctionBase {
    boolean apply(A value1, B value2, C value3, D value4, E value5, F value6, G value7, H value8) throws X;
  }

  interface Serializable<A, B, C, D, E, F, G, H> extends BooleanFunction8<A, B, C, D, E, F, G, H>, java.io.Serializable {
    /**
     * Creates a new, safely-serializable function from this one if this is a method reference (e.g. Object::toString),
     * or simply returns this if this is a function object.  If this is something not safely serializable (e.g. a
     * lambda), an exception will be thrown.
     *
     * "Safely-serializable" means that a function can be deserialized in a way that is not inherently brittle.
     * We recommend only serializing functions when they are safely-serializable, but note that this is not a guarantee;
     * as with Serializable objects in general it's always possible to create something (safely-)serializable that will
     * not serialize, e.g. an instance method with a captured instance (e.g. new Object()::toString) where the captured
     * instance is not itself serializable.
     *
     * Function objects that wrap functions and implement BooleanFunction8.Serializable should override this method
     * when appropriate.  Generally such an implementation will simply create a new instance wrapping
     * wrappedFunction.safelySerializable() instead of wrappedFunction.
     *
     * Anonymous lambdas, such as "{@code a -> a + 5}", are *not* safely-serializable, even if they are technically
     * serializable, as they are extraordinarily fragile and will only deserialize correctly under these conditions:
     * (1) the class in which they were created must exist in both serializing and deserializing programs.
     * (2) the ORDER in which the lambdas are defined must not change.  The names of the generated anonymous classes are
     * dependent upon the position in which the lambda appears in the file!
     * (3) the JVM should be consistent, as different JVMs are in principle free to generate different class names.
     */
    default Serializable<A, B, C, D, E, F, G, H> safelySerializable() {
      try {
        return new BooleanMethodReference8<A, B, C, D, E, F, G, H>(this);
      } catch (java.lang.RuntimeException e) {
        if (e.getCause() instanceof java.lang.NoSuchMethodException) {
          // must be a function object
          return this;
        } else {
          // anonymous lambda or something went wrong
          throw e;
        }
      }
    }

    @Override
    default Serializable<A, B, C, D, E, F, G, H> returnFalseOnNullArgument() {
      return new BooleanDefaultOnNullArgument8(this);
    }

    @Override
    default Serializable<A, B, C, D, E, F, G, H> negate() {
      return BooleanNegatedFunction8.Serializable.negate(this);
    }

  }
}
