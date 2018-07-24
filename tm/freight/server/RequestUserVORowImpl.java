package xxgam.oracle.apps.xbol.tm.freight.server;

import oracle.apps.fnd.framework.server.OAViewRowImpl;

import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class RequestUserVORowImpl extends OAViewRowImpl
{
  public static final int IDAREAUSER = 0;
  public static final int CODE = 1;
  public static final int NAME = 2;
  public static final int AREA = 3;
  public static final int ORGANIZATION = 4;
  public static final int USERID = 5;

  /**This is the default constructor (do not remove)
   */
  public RequestUserVORowImpl()
  {
  }

  /**Gets the attribute value for the calculated attribute IdAreaUser
   */
  public Number getIdAreaUser()
  {
    return (Number) getAttributeInternal(IDAREAUSER);
  }

  /**Sets <code>value</code> as the attribute value for the calculated attribute IdAreaUser
   */
  public void setIdAreaUser(Number value)
  {
    setAttributeInternal(IDAREAUSER, value);
  }

  /**Gets the attribute value for the calculated attribute Code
   */
  public String getCode()
  {
    return (String) getAttributeInternal(CODE);
  }

  /**Sets <code>value</code> as the attribute value for the calculated attribute Code
   */
  public void setCode(String value)
  {
    setAttributeInternal(CODE, value);
  }

  /**Gets the attribute value for the calculated attribute Name
   */
  public String getName()
  {
    return (String) getAttributeInternal(NAME);
  }

  /**Sets <code>value</code> as the attribute value for the calculated attribute Name
   */
  public void setName(String value)
  {
    setAttributeInternal(NAME, value);
  }

  /**Gets the attribute value for the calculated attribute Area
   */
  public String getArea()
  {
    return (String) getAttributeInternal(AREA);
  }

  /**Sets <code>value</code> as the attribute value for the calculated attribute Area
   */
  public void setArea(String value)
  {
    setAttributeInternal(AREA, value);
  }

  /**Gets the attribute value for the calculated attribute Organization
   */
  public String getOrganization()
  {
    return (String) getAttributeInternal(ORGANIZATION);
  }

  /**Sets <code>value</code> as the attribute value for the calculated attribute Organization
   */
  public void setOrganization(String value)
  {
    setAttributeInternal(ORGANIZATION, value);
  }

  /**Gets the attribute value for the calculated attribute UserId
   */
  public Number getUserId()
  {
    return (Number) getAttributeInternal(USERID);
  }

  /**Sets <code>value</code> as the attribute value for the calculated attribute UserId
   */
  public void setUserId(Number value)
  {
    setAttributeInternal(USERID, value);
  }

  /**getAttrInvokeAccessor: generated method. Do not modify.
   */
  protected Object getAttrInvokeAccessor(int index, 
                                         AttributeDefImpl attrDef) throws Exception
  {
    switch (index)
    {
    case IDAREAUSER:
      return getIdAreaUser();
    case CODE:
      return getCode();
    case NAME:
      return getName();
    case AREA:
      return getArea();
    case ORGANIZATION:
      return getOrganization();
    case USERID:
      return getUserId();
    default:
      return super.getAttrInvokeAccessor(index, attrDef);
    }
  }

  /**setAttrInvokeAccessor: generated method. Do not modify.
   */
  protected void setAttrInvokeAccessor(int index, Object value, 
                                       AttributeDefImpl attrDef) throws Exception
  {
    switch (index)
    {
    default:
      super.setAttrInvokeAccessor(index, value, attrDef);
      return;
    }
  }
}
