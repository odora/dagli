// AUTOGENERATED CODE.  DO NOT MODIFY DIRECTLY!  Instead, please modify the tuple/FieldTupleX.ftl file.
// See the README in the module's src/template directory for details.
package com.linkedin.dagli.tuple;

/**
 * A tuple of arity 15.
 *
 * FieldTuples are more memory-efficient than ArrayTuples because they do not need to store an extra object (the array),
 * but ArrayTuples are faster to create if the tuple elements are already extant within an array.
 */
final class FieldTuple15<A, B, C, D, E, F, G, H, I, J, K, L, M, N, O> extends AbstractTuple implements
    Tuple15<A, B, C, D, E, F, G, H, I, J, K, L, M, N, O> {
  private static final long serialVersionUID = 1;

  private final A _element0;
  private final B _element1;
  private final C _element2;
  private final D _element3;
  private final E _element4;
  private final F _element5;
  private final G _element6;
  private final H _element7;
  private final I _element8;
  private final J _element9;
  private final K _element10;
  private final L _element11;
  private final M _element12;
  private final N _element13;
  private final O _element14;

  /**
   * Creates a new tuple from the given fields.
   */
  public FieldTuple15(A element0, B element1, C element2, D element3, E element4, F element5, G element6, H element7,
      I element8, J element9, K element10, L element11, M element12, N element13, O element14) {
    _element0 = element0;
    _element1 = element1;
    _element2 = element2;
    _element3 = element3;
    _element4 = element4;
    _element5 = element5;
    _element6 = element6;
    _element7 = element7;
    _element8 = element8;
    _element9 = element9;
    _element10 = element10;
    _element11 = element11;
    _element12 = element12;
    _element13 = element13;
    _element14 = element14;
  }

  @Override
  public A get0() {
    return _element0;
  }

  @Override
  public B get1() {
    return _element1;
  }

  @Override
  public C get2() {
    return _element2;
  }

  @Override
  public D get3() {
    return _element3;
  }

  @Override
  public E get4() {
    return _element4;
  }

  @Override
  public F get5() {
    return _element5;
  }

  @Override
  public G get6() {
    return _element6;
  }

  @Override
  public H get7() {
    return _element7;
  }

  @Override
  public I get8() {
    return _element8;
  }

  @Override
  public J get9() {
    return _element9;
  }

  @Override
  public K get10() {
    return _element10;
  }

  @Override
  public L get11() {
    return _element11;
  }

  @Override
  public M get12() {
    return _element12;
  }

  @Override
  public N get13() {
    return _element13;
  }

  @Override
  public O get14() {
    return _element14;
  }

  @Override
  public Object get(int index) {
    switch (index) {
      case 0:
        return _element0;
      case 1:
        return _element1;
      case 2:
        return _element2;
      case 3:
        return _element3;
      case 4:
        return _element4;
      case 5:
        return _element5;
      case 6:
        return _element6;
      case 7:
        return _element7;
      case 8:
        return _element8;
      case 9:
        return _element9;
      case 10:
        return _element10;
      case 11:
        return _element11;
      case 12:
        return _element12;
      case 13:
        return _element13;
      case 14:
        return _element14;
      default:
        throw new IndexOutOfBoundsException();
    }
  }

  @Override
  public int size() {
    return 15;
  }
}
