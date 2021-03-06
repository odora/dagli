// AUTOGENERATED CODE.  DO NOT MODIFY DIRECTLY!  Instead, please modify the transformer/AbstractPreparedTransformerX.ftl file.
// See the README in the module's src/template directory for details.
package com.linkedin.dagli.transformer;

import com.linkedin.dagli.producer.Producer;
import com.linkedin.dagli.transformer.internal.PreparedTransformer7InternalAPI;


/**
 * Base class for prepared transformers of arity 7 that do not cache temporary data during execution and do not
 * minibatch their inputs (transformers that do so should instead derive from
 * {@link AbstractPreparedStatefulTransformer7}.)
 *
 * @param <A> the type of the first input to the transformer
 * @param <B> the type of the second input to the transformer
 * @param <C> the type of the third input to the transformer
 * @param <D> the type of the fourth input to the transformer
 * @param <E> the type of the fifth input to the transformer
 * @param <F> the type of the sixth input to the transformer
 * @param <G> the type of the seventh input to the transformer
 * @param <R> the type of result produced by the transformer
 * @param <S> the ultimate derived class
 */
public abstract class AbstractPreparedTransformer7<A, B, C, D, E, F, G, R, S extends AbstractPreparedTransformer7<A, B, C, D, E, F, G, R, S>>
    extends AbstractTransformer7<A, B, C, D, E, F, G, R, PreparedTransformer7InternalAPI<A, B, C, D, E, F, G, R, S>, S>
    implements PreparedTransformer7<A, B, C, D, E, F, G, R> {

  private static final long serialVersionUID = 1;

  public AbstractPreparedTransformer7() {
    super();
  }

  @Override
  public PreparedTransformer7InternalAPI<A, B, C, D, E, F, G, R, S> internalAPI() {
    return (PreparedTransformer7InternalAPI<A, B, C, D, E, F, G, R, S>) super.internalAPI();
  }

  @Override
  protected PreparedTransformer7InternalAPI<A, B, C, D, E, F, G, R, S> createInternalAPI() {
    return new InternalAPI();
  }

  protected class InternalAPI
      extends
      AbstractTransformer7<A, B, C, D, E, F, G, R, PreparedTransformer7InternalAPI<A, B, C, D, E, F, G, R, S>, S>.InternalAPI
      implements PreparedTransformer7InternalAPI<A, B, C, D, E, F, G, R, S> {
    @Override
    public R apply(Object executionCache, A value1, B value2, C value3, D value4, E value5, F value6, G value7) {
      return AbstractPreparedTransformer7.this.apply(value1, value2, value3, value4, value5, value6, value7);
    }
  }

  public AbstractPreparedTransformer7(Producer<? extends A> input1, Producer<? extends B> input2,
      Producer<? extends C> input3, Producer<? extends D> input4, Producer<? extends E> input5,
      Producer<? extends F> input6, Producer<? extends G> input7) {
    super(input1, input2, input3, input4, input5, input6, input7);
  }
}
