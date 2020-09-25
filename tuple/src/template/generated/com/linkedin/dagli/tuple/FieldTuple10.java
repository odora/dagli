// AUTOGENERATED CODE.  DO NOT MODIFY DIRECTLY!  Instead, please modify the tuple/FieldTupleX.ftl file.
// See the README in the module's src/template directory for details.
package com.linkedin.dagli.tuple;

/**
 * A tuple of arity 10.
 *
 * FieldTuples are more memory-efficient than ArrayTuples because they do not need to store an extra object (the array),
 * but ArrayTuples are faster to create if the tuple elements are already extant within an array.
 */
final class FieldTuple10<A, B, C, D, E, F, G, H, I, J> extends AbstractTuple implements
    Tuple10<A, B, C, D, E, F, G, H, I, J> {
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

  /**
   * Creates a new tuple from the given fields.
   */
  public FieldTuple10(A element0, B element1, C element2, D element3, E element4, F element5, G element6, H element7,
      I element8, J element9) {
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
      default:
        throw new IndexOutOfBoundsException();
    }
  }

  @Override
  public int size() {
    return 10;
  }
}
