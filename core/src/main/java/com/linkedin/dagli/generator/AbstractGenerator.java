package com.linkedin.dagli.generator;

import com.linkedin.dagli.generator.internal.GeneratorInternalAPI;
import com.linkedin.dagli.producer.AbstractRootProducer;


/**
 * A root class for Generators to reduce the boilerplate required in their implementations.  Extending this class is
 * highly recommended.
 *
 * @param <R> the type of object generated by this Generator
 * @param <S> the concrete derived type of this Generator (e.g. if the inheritance chain is
 *           {@code MyGenerator -> SomeAbstractGenerator -> AbstractGenerator}, S == MyGenerator).
 */
public abstract class AbstractGenerator<R, S extends AbstractGenerator<R, S>>
    extends AbstractRootProducer<R, GeneratorInternalAPI<R, S>, S> implements Generator<R> {
  private static final long serialVersionUID = 1;

  @Override
  protected GeneratorInternalAPI<R, S> createInternalAPI() {
    return new InternalAPI();
  }

  protected class InternalAPI extends AbstractRootProducer<R, GeneratorInternalAPI<R, S>, S>.InternalAPI
      implements GeneratorInternalAPI<R, S> { }

  /**
   * Creates a new generator with a random UUID
   */
  public AbstractGenerator() {
    super();
  }

  /**
   * Creates a new generator with the specified UUID
   *
   * @param uuidMostSignificantBits most significant 64 bits of the UUID
   * @param uuidLeastSignificantBits least significant 64 bits of the UUID
   */
  public AbstractGenerator(long uuidMostSignificantBits, long uuidLeastSignificantBits) {
    super(uuidMostSignificantBits, uuidLeastSignificantBits);
  }
}
