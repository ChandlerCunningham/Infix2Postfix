/**
 * Expression thrown in PostfixExample for an invalid expression.
 */
public class ExpressionFormatException extends Exception
{
  public ExpressionFormatException()
  {
    super();
  }
  
  public ExpressionFormatException(String msg)
  {
    super(msg);
  }
}
