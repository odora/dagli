// AUTOGENERATED CODE.  DO NOT MODIFY DIRECTLY!  Instead, please modify the util/function/Function.ftl file.
// See the README in the module's src/template directory for details.
package com.linkedin.dagli.util.function;

import com.linkedin.dagli.util.exception.Exceptions;


@FunctionalInterface
public interface Function3<A, B, C, R> extends FunctionBase {
  R apply(A value1, B value2, C value3);

  /**
   * Returns a new function that wraps this "original" function.  The wrapping function will return null
   * without calling the original function if any argument is null.  If no argument is null, the original function will
   * be called as normal and its return value will be returned by the wrapping function.
   *
   * This is useful when you have a function that cannot accept a null as an argument but are satisfied to just return
   * a default value in such instances.
   *
   * @return a new function that calls this one if all arguments or non-null, or returns a default value otherwise.
   */
  default Function3<A, B, C, R> returnNullOnNullArgument() {
    return new DefaultOnNullArgument3<>(this);
  }

  /**
   * Composes this function with another by mapping the result of this function.  The returned function is equivalent
   * to {@code mapper.apply(this.apply(...))}.
   *
   * This method is analogous to {@link java.util.function.Function#andThen(Function)}.
   *
   * @param mapper the function that will map the result of this one in the returned composed function
   * @param <Q> the type of the result of the composed function
   * @return a composed function equivalent to {@code mapper.apply(this.apply(...))}
   */
  default <Q> Function3<A, B, C, Q> andThen(Function1<? super R, ? extends Q> mapper) {
    return new ComposedFunction3<>(this, mapper);
  }

  /**
   * Composes this function with another by mapping the result of this function.  The returned function is equivalent
   * to {@code mapper.apply(this.apply(...))}.
   *
   * This method is analogous to {@link java.util.function.Function#andThen(Function)}.
   *
   * @param mapper the function that will map the result of this one in the returned composed function
   * @return a composed function equivalent to {@code mapper.apply(this.apply(...))}
   */
  default VoidFunction3<A, B, C> andThenToVoid(VoidFunction1<? super R> mapper) {
    return new VoidComposedFunction3<>(this, mapper);
  }

  /**
   * Composes this function with another by mapping the result of this function.  The returned function is equivalent
   * to {@code mapper.apply(this.apply(...))}.
   *
   * This method is analogous to {@link java.util.function.Function#andThen(Function)}.
   *
   * @param mapper the function that will map the result of this one in the returned composed function
   * @return a composed function equivalent to {@code mapper.apply(this.apply(...))}
   */
  default BooleanFunction3<A, B, C> andThenToBoolean(BooleanFunction1<? super R> mapper) {
    return new BooleanComposedFunction3<>(this, mapper);
  }

  /**
   * Composes this function with another by mapping the result of this function.  The returned function is equivalent
   * to {@code mapper.apply(this.apply(...))}.
   *
   * This method is analogous to {@link java.util.function.Function#andThen(Function)}.
   *
   * @param mapper the function that will map the result of this one in the returned composed function
   * @return a composed function equivalent to {@code mapper.apply(this.apply(...))}
   */
  default ByteFunction3<A, B, C> andThenToByte(ByteFunction1<? super R> mapper) {
    return new ByteComposedFunction3<>(this, mapper);
  }

  /**
   * Composes this function with another by mapping the result of this function.  The returned function is equivalent
   * to {@code mapper.apply(this.apply(...))}.
   *
   * This method is analogous to {@link java.util.function.Function#andThen(Function)}.
   *
   * @param mapper the function that will map the result of this one in the returned composed function
   * @return a composed function equivalent to {@code mapper.apply(this.apply(...))}
   */
  default CharacterFunction3<A, B, C> andThenToCharacter(CharacterFunction1<? super R> mapper) {
    return new CharacterComposedFunction3<>(this, mapper);
  }

  /**
   * Composes this function with another by mapping the result of this function.  The returned function is equivalent
   * to {@code mapper.apply(this.apply(...))}.
   *
   * This method is analogous to {@link java.util.function.Function#andThen(Function)}.
   *
   * @param mapper the function that will map the result of this one in the returned composed function
   * @return a composed function equivalent to {@code mapper.apply(this.apply(...))}
   */
  default ShortFunction3<A, B, C> andThenToShort(ShortFunction1<? super R> mapper) {
    return new ShortComposedFunction3<>(this, mapper);
  }

  /**
   * Composes this function with another by mapping the result of this function.  The returned function is equivalent
   * to {@code mapper.apply(this.apply(...))}.
   *
   * This method is analogous to {@link java.util.function.Function#andThen(Function)}.
   *
   * @param mapper the function that will map the result of this one in the returned composed function
   * @return a composed function equivalent to {@code mapper.apply(this.apply(...))}
   */
  default IntFunction3<A, B, C> andThenToInt(IntFunction1<? super R> mapper) {
    return new IntComposedFunction3<>(this, mapper);
  }

  /**
   * Composes this function with another by mapping the result of this function.  The returned function is equivalent
   * to {@code mapper.apply(this.apply(...))}.
   *
   * This method is analogous to {@link java.util.function.Function#andThen(Function)}.
   *
   * @param mapper the function that will map the result of this one in the returned composed function
   * @return a composed function equivalent to {@code mapper.apply(this.apply(...))}
   */
  default LongFunction3<A, B, C> andThenToLong(LongFunction1<? super R> mapper) {
    return new LongComposedFunction3<>(this, mapper);
  }

  /**
   * Composes this function with another by mapping the result of this function.  The returned function is equivalent
   * to {@code mapper.apply(this.apply(...))}.
   *
   * This method is analogous to {@link java.util.function.Function#andThen(Function)}.
   *
   * @param mapper the function that will map the result of this one in the returned composed function
   * @return a composed function equivalent to {@code mapper.apply(this.apply(...))}
   */
  default FloatFunction3<A, B, C> andThenToFloat(FloatFunction1<? super R> mapper) {
    return new FloatComposedFunction3<>(this, mapper);
  }

  /**
   * Composes this function with another by mapping the result of this function.  The returned function is equivalent
   * to {@code mapper.apply(this.apply(...))}.
   *
   * This method is analogous to {@link java.util.function.Function#andThen(Function)}.
   *
   * @param mapper the function that will map the result of this one in the returned composed function
   * @return a composed function equivalent to {@code mapper.apply(this.apply(...))}
   */
  default DoubleFunction3<A, B, C> andThenToDouble(DoubleFunction1<? super R> mapper) {
    return new DoubleComposedFunction3<>(this, mapper);
  }

  static <A, B, C, R> Function3<A, B, C, R> unchecked(Checked<A, B, C, R, ?> checkedFunction) {
    return (A value1, B value2, C value3) -> {
      try {
        return checkedFunction.apply(value1, value2, value3);
      } catch (Throwable e) {
        throw Exceptions.asRuntimeException(e);
      }
    };
  }

  @FunctionalInterface
  interface Checked<A, B, C, R, X extends Throwable> extends FunctionBase {
    R apply(A value1, B value2, C value3) throws X;
  }

  interface Serializable<A, B, C, R> extends Function3<A, B, C, R>, java.io.Serializable {
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
     * Function objects that wrap functions and implement Function3.Serializable should override this method
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
    default Serializable<A, B, C, R> safelySerializable() {
      try {
        return new MethodReference3<A, B, C, R>(this);
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
    default Serializable<A, B, C, R> returnNullOnNullArgument() {
      return new DefaultOnNullArgument3(this);
    }

    /**
     * Composes this function with another by mapping the result of this function.  The returned function is equivalent
     * to {@code mapper.apply(this.apply(...))}.
     *
     * This method is analogous to {@link java.util.function.Function#andThen(Function)}.
     *
     * @param mapper the function that will map the result of this one in the returned composed function
     * @param <Q> the type of the result of the composed function
     * @return a composed function equivalent to {@code mapper.apply(this.apply(...))}
     */
    default <Q> Function3.Serializable<A, B, C, Q> andThen(Function1.Serializable<? super R, ? extends Q> mapper) {
      return new ComposedFunction3<>(this, mapper);
    }

    /**
     * Composes this function with another by mapping the result of this function.  The returned function is equivalent
     * to {@code mapper.apply(this.apply(...))}.
     *
     * This method is analogous to {@link java.util.function.Function#andThen(Function)}.
     *
     * @param mapper the function that will map the result of this one in the returned composed function
     * @return a composed function equivalent to {@code mapper.apply(this.apply(...))}
     */
    default VoidFunction3.Serializable<A, B, C> andThenToVoid(VoidFunction1.Serializable<? super R> mapper) {
      return new VoidComposedFunction3<>(this, mapper);
    }

    /**
     * Composes this function with another by mapping the result of this function.  The returned function is equivalent
     * to {@code mapper.apply(this.apply(...))}.
     *
     * This method is analogous to {@link java.util.function.Function#andThen(Function)}.
     *
     * @param mapper the function that will map the result of this one in the returned composed function
     * @return a composed function equivalent to {@code mapper.apply(this.apply(...))}
     */
    default BooleanFunction3.Serializable<A, B, C> andThenToBoolean(BooleanFunction1.Serializable<? super R> mapper) {
      return new BooleanComposedFunction3<>(this, mapper);
    }

    /**
     * Composes this function with another by mapping the result of this function.  The returned function is equivalent
     * to {@code mapper.apply(this.apply(...))}.
     *
     * This method is analogous to {@link java.util.function.Function#andThen(Function)}.
     *
     * @param mapper the function that will map the result of this one in the returned composed function
     * @return a composed function equivalent to {@code mapper.apply(this.apply(...))}
     */
    default ByteFunction3.Serializable<A, B, C> andThenToByte(ByteFunction1.Serializable<? super R> mapper) {
      return new ByteComposedFunction3<>(this, mapper);
    }

    /**
     * Composes this function with another by mapping the result of this function.  The returned function is equivalent
     * to {@code mapper.apply(this.apply(...))}.
     *
     * This method is analogous to {@link java.util.function.Function#andThen(Function)}.
     *
     * @param mapper the function that will map the result of this one in the returned composed function
     * @return a composed function equivalent to {@code mapper.apply(this.apply(...))}
     */
    default CharacterFunction3.Serializable<A, B, C> andThenToCharacter(
        CharacterFunction1.Serializable<? super R> mapper) {
      return new CharacterComposedFunction3<>(this, mapper);
    }

    /**
     * Composes this function with another by mapping the result of this function.  The returned function is equivalent
     * to {@code mapper.apply(this.apply(...))}.
     *
     * This method is analogous to {@link java.util.function.Function#andThen(Function)}.
     *
     * @param mapper the function that will map the result of this one in the returned composed function
     * @return a composed function equivalent to {@code mapper.apply(this.apply(...))}
     */
    default ShortFunction3.Serializable<A, B, C> andThenToShort(ShortFunction1.Serializable<? super R> mapper) {
      return new ShortComposedFunction3<>(this, mapper);
    }

    /**
     * Composes this function with another by mapping the result of this function.  The returned function is equivalent
     * to {@code mapper.apply(this.apply(...))}.
     *
     * This method is analogous to {@link java.util.function.Function#andThen(Function)}.
     *
     * @param mapper the function that will map the result of this one in the returned composed function
     * @return a composed function equivalent to {@code mapper.apply(this.apply(...))}
     */
    default IntFunction3.Serializable<A, B, C> andThenToInt(IntFunction1.Serializable<? super R> mapper) {
      return new IntComposedFunction3<>(this, mapper);
    }

    /**
     * Composes this function with another by mapping the result of this function.  The returned function is equivalent
     * to {@code mapper.apply(this.apply(...))}.
     *
     * This method is analogous to {@link java.util.function.Function#andThen(Function)}.
     *
     * @param mapper the function that will map the result of this one in the returned composed function
     * @return a composed function equivalent to {@code mapper.apply(this.apply(...))}
     */
    default LongFunction3.Serializable<A, B, C> andThenToLong(LongFunction1.Serializable<? super R> mapper) {
      return new LongComposedFunction3<>(this, mapper);
    }

    /**
     * Composes this function with another by mapping the result of this function.  The returned function is equivalent
     * to {@code mapper.apply(this.apply(...))}.
     *
     * This method is analogous to {@link java.util.function.Function#andThen(Function)}.
     *
     * @param mapper the function that will map the result of this one in the returned composed function
     * @return a composed function equivalent to {@code mapper.apply(this.apply(...))}
     */
    default FloatFunction3.Serializable<A, B, C> andThenToFloat(FloatFunction1.Serializable<? super R> mapper) {
      return new FloatComposedFunction3<>(this, mapper);
    }

    /**
     * Composes this function with another by mapping the result of this function.  The returned function is equivalent
     * to {@code mapper.apply(this.apply(...))}.
     *
     * This method is analogous to {@link java.util.function.Function#andThen(Function)}.
     *
     * @param mapper the function that will map the result of this one in the returned composed function
     * @return a composed function equivalent to {@code mapper.apply(this.apply(...))}
     */
    default DoubleFunction3.Serializable<A, B, C> andThenToDouble(DoubleFunction1.Serializable<? super R> mapper) {
      return new DoubleComposedFunction3<>(this, mapper);
    }
  }
}
