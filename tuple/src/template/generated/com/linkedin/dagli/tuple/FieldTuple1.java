// AUTOGENERATED CODE.  DO NOT MODIFY DIRECTLY!  Instead, please modify the tuple/FieldTupleX.ftl file.
// See the README in the module's src/template directory for details.
package com.linkedin.dagli.tuple;

/**
 * A tuple of arity 1.
 *
 * FieldTuples are more memory-efficient than ArrayTuples because they do not need to store an extra object (the array),
 * but ArrayTuples are faster to create if the tuple elements are already extant within an array.
 */
final class FieldTuple1<A> extends AbstractTuple implements Tuple1<A> {
  private static final long serialVersionUID = 1;

  private final A _element0;

  /**
   * Creates a new tuple from the given fields.
   */
  public FieldTuple1(A element0) {
    _element0 = element0;
  }

  @Override
  public A get0() {
    return _element0;
  }

  @Override
  public Object get(int index) {
    switch (index) {
      case 0:
        return _element0;
      default:
        throw new IndexOutOfBoundsException();
    }
  }

  @Override
  public int size() {
    return 1;
  }
}
