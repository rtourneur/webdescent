package com.raf.descent.util.aspect;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Log class.
 * 
 * @author RAF
 */
@Component
@Aspect
public final class LoggableAspect {

  /** Logger. */
  private static final Logger LOGGER = LoggerFactory.getLogger(LoggableAspect.class);

  /**
   * Cosntructor.
   */
  public LoggableAspect() {
    super();
  }

  /**
   * Log the call to the method whith {@link com.raf.descent.util.Loggable} annotation.
   * 
   * @param joinpoint
   */
  @Before("@annotation(com.raf.descent.util.Loggable)")
  public void showCall(final JoinPoint joinpoint) {

    if (LOGGER.isInfoEnabled()) {
      final Object[] args = joinpoint.getArgs();
      final StringBuilder builder = new StringBuilder();
      builder.append(joinpoint.getTarget().getClass()).append('.').append(joinpoint.getSignature().getName())
          .append(" avec les parametres : (");
      Object object;
      for (int i = 0; i < args.length; i++) {
        object = args[i];
        if (object != null) {
          builder.append(object.toString());
        }
        if (i < args.length - 1) {
          builder.append(", ");
        }
      }
      builder.append(')');
      LOGGER.info("Debut methode : " + builder);
    }
  }
}
