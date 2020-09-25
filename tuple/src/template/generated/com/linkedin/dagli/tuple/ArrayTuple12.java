// AUTOGENERATED CODE.  DO NOT MODIFY DIRECTLY!  Instead, please modify the tuple/ArrayTupleX.ftl file.
// See the README in the module's src/template directory for details.
package com.linkedin.dagli.tuple;

import java.util.function.IntFunction;


/**
 * A tuple of arity 12 that is backed by an array.
 * ArrayTuples are less memory-efficient than FieldTuples because they require storing an extra object (the array),
 * but are trivially cheap to create from an existing array of tuple elements.
 */
final class ArrayTuple12<A, B, C, D, E, F, G, H, I, J, K, L> extends AbstractTuple implements
    Tuple12<A, B, C, D, E, F, G, H, I, J, K, L> {
  private static final long serialVersionUID = 1;
  private final Object[] _array;

  /**
   * Creates a new tuple whose elements are stored in the provided array.  Note that it is not possible for the
   * ArrayTuple to verify that the types of elements in the array satisfy the declared types of elements in the tuple;
   * the caller is responsible for ensuring this.
   *
   * The tuple takes ownership of the array, which should not be subsequently modified.
   */
  public ArrayTuple12(Object[] array) {
    assert array.length == 12;
    _array = array;
  }

  @Override
  @SuppressWarnings("unchecked")
  public A get0() {
    return (A) _array[0];
  }

  @Override
  @SuppressWarnings("unchecked")
  public B get1() {
    return (B) _array[1];
  }

  @Override
  @SuppressWarnings("unchecked")
  public C get2() {
    return (C) _array[2];
  }

  @Override
  @SuppressWarnings("unchecked")
  public D get3() {
    return (D) _array[3];
  }

  @Override
  @SuppressWarnings("unchecked")
  public E get4() {
    return (E) _array[4];
  }

  @Override
  @SuppressWarnings("unchecked")
  public F get5() {
    return (F) _array[5];
  }

  @Override
  @SuppressWarnings("unchecked")
  public G get6() {
    return (G) _array[6];
  }

  @Override
  @SuppressWarnings("unchecked")
  public H get7() {
    return (H) _array[7];
  }

  @Override
  @SuppressWarnings("unchecked")
  public I get8() {
    return (I) _array[8];
  }

  @Override
  @SuppressWarnings("unchecked")
  public J get9() {
    return (J) _array[9];
  }

  @Override
  @SuppressWarnings("unchecked")
  public K get10() {
    return (K) _array[10];
  }

  @Override
  @SuppressWarnings("unchecked")
  public L get11() {
    return (L) _array[11];
  }

  @Override
  public Object get(int index) {
    return _array[index];
  }

  @Override
  public int size() {
    return 12;
  }

  @Override
  public Object[] toArray() {
    return _array.clone();
  }

  @Override
  public <TT> TT[] toArray(IntFunction<TT[]> arrayGenerator) {
    TT[] result = arrayGenerator.apply(12);
    System.arraycopy(_array, 0, result, 0, 12);
    return result;
  }
}
