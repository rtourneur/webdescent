package com.raf.descent.util;

/**
 * Exception for Descent.
 * 
 * @author RAF
 */
public class DescentException extends Exception {

  /** Serial UID. */
  private static final long serialVersionUID = -5704240997995667216L;

  /** The error code. */
  private final int code;

  /**
   * Constructor.
   * 
   * @param message
   *          the message
   * @param code
   *          the error code
   */
  public DescentException(final String message, final int code) {
    super(message);
    this.code = code;
  }

  /**
   * Constructor.
   * 
   * @param message
   *          the message
   * @param code
   *          the error code
   * @param cause
   *          the cause
   */
  public DescentException(final String message, final int code, final Throwable cause) {
    super(message, cause);
    this.code = code;
  }

  /**
   * Returns the error code.
   * 
   * @return the code
   */
  public final int getCode() {
    return this.code;
  }

}
