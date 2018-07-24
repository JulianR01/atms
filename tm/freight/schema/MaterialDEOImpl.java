package xxgam.oracle.apps.xbol.tm.freight.schema;

import oracle.apps.fnd.framework.server.OAEntityDefImpl;
import oracle.apps.fnd.framework.server.OAEntityImpl;

import oracle.jbo.Key;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class MaterialDEOImpl extends OAEntityImpl
{
  public static final int IDREQUEST = 0;
  public static final int IDMATERIAL = 1;
  public static final int IDLOADPRESENTATION = 2;
  public static final int LOADPRESENTATION = 3;
  public static final int WEIGHT = 4;
  public static final int WEIGHTUNITS = 5;
  public static final int UNITSNUMBER = 6;
  public static final int UNITSTYPE = 7;
  public static final int TOTALWEIGHT = 8;
  public static final int TOTALWEIGHTUNITS = 9;
  public static final int LENGHT = 10;
  public static final int LENGHTUNITS = 11;
  public static final int WIDTH = 12;
  public static final int WIDTHUNITS = 13;
  public static final int HEIGHT = 14;
  public static final int HEIGHTUNITS = 15;
  public static final int ATTRIBUTE1 = 16;
  public static final int ATTRIBUTE2 = 17;
  public static final int ATTRIBUTE3 = 18;
  public static final int ATTRIBUTE4 = 19;
  public static final int ATTRIBUTE5 = 20;
  public static final int ATTRIBUTE6 = 21;
  public static final int ATTRIBUTE7 = 22;
  public static final int ATTRIBUTE8 = 23;
  public static final int ATTRIBUTE9 = 24;
  public static final int ATTRIBUTE10 = 25;
  public static final int LASTUPDATEDATE = 26;
  public static final int LASTUPDATEDBY = 27;
  public static final int CREATIONDATE = 28;
  public static final int CREATEDBY = 29;
  public static final int LASTUPDATELOGIN = 30;
  public static final int MATERIALMEO = 31;


  private static OAEntityDefImpl mDefinitionObject;

  /**This is the default constructor (do not remove)
   */
  public MaterialDEOImpl()
  {
  }


  /**Retrieves the definition object for this instance class.
   */
  public static synchronized EntityDefImpl getDefinitionObject()
  {
    if (mDefinitionObject == null)
    {
      mDefinitionObject = 
          (OAEntityDefImpl)EntityDefImpl.findDefObject("xxgam.oracle.apps.xbol.tm.freight.schema.MaterialDEO");
    }
    return mDefinitionObject;
  }

  /**Gets the attribute value for IdRequest, using the alias name IdRequest
   */
  public Number getIdRequest()
  {
    return (Number)getAttributeInternal(IDREQUEST);
  }

  /**Sets <code>value</code> as the attribute value for IdRequest
   */
  public void setIdRequest(Number value)
  {
    setAttributeInternal(IDREQUEST, value);
  }

  /**Gets the attribute value for IdMaterial, using the alias name IdMaterial
   */
  public Number getIdMaterial()
  {
    return (Number)getAttributeInternal(IDMATERIAL);
  }

  /**Sets <code>value</code> as the attribute value for IdMaterial
   */
  public void setIdMaterial(Number value)
  {
    setAttributeInternal(IDMATERIAL, value);
  }

  /**Gets the attribute value for IdLoadPresentation, using the alias name IdLoadPresentation
   */
  public Number getIdLoadPresentation()
  {
    return (Number)getAttributeInternal(IDLOADPRESENTATION);
  }

  /**Sets <code>value</code> as the attribute value for IdLoadPresentation
   */
  public void setIdLoadPresentation(Number value)
  {
    setAttributeInternal(IDLOADPRESENTATION, value);
  }

  /**Gets the attribute value for LoadPresentation, using the alias name LoadPresentation
   */
  public String getLoadPresentation()
  {
    return (String)getAttributeInternal(LOADPRESENTATION);
  }

  /**Sets <code>value</code> as the attribute value for LoadPresentation
   */
  public void setLoadPresentation(String value)
  {
    setAttributeInternal(LOADPRESENTATION, value);
  }

  /**Gets the attribute value for Weight, using the alias name Weight
   */
  public Number getWeight()
  {
    return (Number)getAttributeInternal(WEIGHT);
  }

  /**Sets <code>value</code> as the attribute value for Weight
   */
  public void setWeight(Number value)
  {
    setAttributeInternal(WEIGHT, value);
  }

  /**Gets the attribute value for WeightUnits, using the alias name WeightUnits
   */
  public String getWeightUnits()
  {
    return (String)getAttributeInternal(WEIGHTUNITS);
  }

  /**Sets <code>value</code> as the attribute value for WeightUnits
   */
  public void setWeightUnits(String value)
  {
    setAttributeInternal(WEIGHTUNITS, value);
  }

  /**Gets the attribute value for UnitsNumber, using the alias name UnitsNumber
   */
  public Number getUnitsNumber()
  {
    return (Number)getAttributeInternal(UNITSNUMBER);
  }

  /**Sets <code>value</code> as the attribute value for UnitsNumber
   */
  public void setUnitsNumber(Number value)
  {
    setAttributeInternal(UNITSNUMBER, value);
  }

  /**Gets the attribute value for UnitsType, using the alias name UnitsType
   */
  public String getUnitsType()
  {
    return (String)getAttributeInternal(UNITSTYPE);
  }

  /**Sets <code>value</code> as the attribute value for UnitsType
   */
  public void setUnitsType(String value)
  {
    setAttributeInternal(UNITSTYPE, value);
  }

  /**Gets the attribute value for TotalWeight, using the alias name TotalWeight
   */
  public Number getTotalWeight()
  {
    return (Number)getAttributeInternal(TOTALWEIGHT);
  }

  /**Sets <code>value</code> as the attribute value for TotalWeight
   */
  public void setTotalWeight(Number value)
  {
    setAttributeInternal(TOTALWEIGHT, value);
  }

  /**Gets the attribute value for TotalWeightUnits, using the alias name TotalWeightUnits
   */
  public String getTotalWeightUnits()
  {
    return (String)getAttributeInternal(TOTALWEIGHTUNITS);
  }

  /**Sets <code>value</code> as the attribute value for TotalWeightUnits
   */
  public void setTotalWeightUnits(String value)
  {
    setAttributeInternal(TOTALWEIGHTUNITS, value);
  }

  /**Gets the attribute value for Lenght, using the alias name Lenght
   */
  public Number getLenght()
  {
    return (Number)getAttributeInternal(LENGHT);
  }

  /**Sets <code>value</code> as the attribute value for Lenght
   */
  public void setLenght(Number value)
  {
    setAttributeInternal(LENGHT, value);
  }

  /**Gets the attribute value for LenghtUnits, using the alias name LenghtUnits
   */
  public String getLenghtUnits()
  {
    return (String)getAttributeInternal(LENGHTUNITS);
  }

  /**Sets <code>value</code> as the attribute value for LenghtUnits
   */
  public void setLenghtUnits(String value)
  {
    setAttributeInternal(LENGHTUNITS, value);
  }

  /**Gets the attribute value for Width, using the alias name Width
   */
  public Number getWidth()
  {
    return (Number)getAttributeInternal(WIDTH);
  }

  /**Sets <code>value</code> as the attribute value for Width
   */
  public void setWidth(Number value)
  {
    setAttributeInternal(WIDTH, value);
  }

  /**Gets the attribute value for WidthUnits, using the alias name WidthUnits
   */
  public String getWidthUnits()
  {
    return (String)getAttributeInternal(WIDTHUNITS);
  }

  /**Sets <code>value</code> as the attribute value for WidthUnits
   */
  public void setWidthUnits(String value)
  {
    setAttributeInternal(WIDTHUNITS, value);
  }

  /**Gets the attribute value for Height, using the alias name Height
   */
  public Number getHeight()
  {
    return (Number)getAttributeInternal(HEIGHT);
  }

  /**Sets <code>value</code> as the attribute value for Height
   */
  public void setHeight(Number value)
  {
    setAttributeInternal(HEIGHT, value);
  }

  /**Gets the attribute value for HeightUnits, using the alias name HeightUnits
   */
  public String getHeightUnits()
  {
    return (String)getAttributeInternal(HEIGHTUNITS);
  }

  /**Sets <code>value</code> as the attribute value for HeightUnits
   */
  public void setHeightUnits(String value)
  {
    setAttributeInternal(HEIGHTUNITS, value);
  }

  /**Gets the attribute value for Attribute1, using the alias name Attribute1
   */
  public String getAttribute1()
  {
    return (String)getAttributeInternal(ATTRIBUTE1);
  }

  /**Sets <code>value</code> as the attribute value for Attribute1
   */
  public void setAttribute1(String value)
  {
    setAttributeInternal(ATTRIBUTE1, value);
  }

  /**Gets the attribute value for Attribute2, using the alias name Attribute2
   */
  public String getAttribute2()
  {
    return (String)getAttributeInternal(ATTRIBUTE2);
  }

  /**Sets <code>value</code> as the attribute value for Attribute2
   */
  public void setAttribute2(String value)
  {
    setAttributeInternal(ATTRIBUTE2, value);
  }

  /**Gets the attribute value for Attribute3, using the alias name Attribute3
   */
  public String getAttribute3()
  {
    return (String)getAttributeInternal(ATTRIBUTE3);
  }

  /**Sets <code>value</code> as the attribute value for Attribute3
   */
  public void setAttribute3(String value)
  {
    setAttributeInternal(ATTRIBUTE3, value);
  }

  /**Gets the attribute value for Attribute4, using the alias name Attribute4
   */
  public String getAttribute4()
  {
    return (String)getAttributeInternal(ATTRIBUTE4);
  }

  /**Sets <code>value</code> as the attribute value for Attribute4
   */
  public void setAttribute4(String value)
  {
    setAttributeInternal(ATTRIBUTE4, value);
  }

  /**Gets the attribute value for Attribute5, using the alias name Attribute5
   */
  public String getAttribute5()
  {
    return (String)getAttributeInternal(ATTRIBUTE5);
  }

  /**Sets <code>value</code> as the attribute value for Attribute5
   */
  public void setAttribute5(String value)
  {
    setAttributeInternal(ATTRIBUTE5, value);
  }

  /**Gets the attribute value for Attribute6, using the alias name Attribute6
   */
  public String getAttribute6()
  {
    return (String)getAttributeInternal(ATTRIBUTE6);
  }

  /**Sets <code>value</code> as the attribute value for Attribute6
   */
  public void setAttribute6(String value)
  {
    setAttributeInternal(ATTRIBUTE6, value);
  }

  /**Gets the attribute value for Attribute7, using the alias name Attribute7
   */
  public String getAttribute7()
  {
    return (String)getAttributeInternal(ATTRIBUTE7);
  }

  /**Sets <code>value</code> as the attribute value for Attribute7
   */
  public void setAttribute7(String value)
  {
    setAttributeInternal(ATTRIBUTE7, value);
  }

  /**Gets the attribute value for Attribute8, using the alias name Attribute8
   */
  public String getAttribute8()
  {
    return (String)getAttributeInternal(ATTRIBUTE8);
  }

  /**Sets <code>value</code> as the attribute value for Attribute8
   */
  public void setAttribute8(String value)
  {
    setAttributeInternal(ATTRIBUTE8, value);
  }

  /**Gets the attribute value for Attribute9, using the alias name Attribute9
   */
  public String getAttribute9()
  {
    return (String)getAttributeInternal(ATTRIBUTE9);
  }

  /**Sets <code>value</code> as the attribute value for Attribute9
   */
  public void setAttribute9(String value)
  {
    setAttributeInternal(ATTRIBUTE9, value);
  }

  /**Gets the attribute value for Attribute10, using the alias name Attribute10
   */
  public String getAttribute10()
  {
    return (String)getAttributeInternal(ATTRIBUTE10);
  }

  /**Sets <code>value</code> as the attribute value for Attribute10
   */
  public void setAttribute10(String value)
  {
    setAttributeInternal(ATTRIBUTE10, value);
  }

  /**Gets the attribute value for LastUpdateDate, using the alias name LastUpdateDate
   */
  public Date getLastUpdateDate()
  {
    return (Date)getAttributeInternal(LASTUPDATEDATE);
  }

  /**Sets <code>value</code> as the attribute value for LastUpdateDate
   */
  public void setLastUpdateDate(Date value)
  {
    setAttributeInternal(LASTUPDATEDATE, value);
  }

  /**Gets the attribute value for LastUpdatedBy, using the alias name LastUpdatedBy
   */
  public Number getLastUpdatedBy()
  {
    return (Number)getAttributeInternal(LASTUPDATEDBY);
  }

  /**Sets <code>value</code> as the attribute value for LastUpdatedBy
   */
  public void setLastUpdatedBy(Number value)
  {
    setAttributeInternal(LASTUPDATEDBY, value);
  }

  /**Gets the attribute value for CreationDate, using the alias name CreationDate
   */
  public Date getCreationDate()
  {
    return (Date)getAttributeInternal(CREATIONDATE);
  }

  /**Sets <code>value</code> as the attribute value for CreationDate
   */
  public void setCreationDate(Date value)
  {
    setAttributeInternal(CREATIONDATE, value);
  }

  /**Gets the attribute value for CreatedBy, using the alias name CreatedBy
   */
  public Number getCreatedBy()
  {
    return (Number)getAttributeInternal(CREATEDBY);
  }

  /**Sets <code>value</code> as the attribute value for CreatedBy
   */
  public void setCreatedBy(Number value)
  {
    setAttributeInternal(CREATEDBY, value);
  }

  /**Gets the attribute value for LastUpdateLogin, using the alias name LastUpdateLogin
   */
  public Number getLastUpdateLogin()
  {
    return (Number)getAttributeInternal(LASTUPDATELOGIN);
  }

  /**Sets <code>value</code> as the attribute value for LastUpdateLogin
   */
  public void setLastUpdateLogin(Number value)
  {
    setAttributeInternal(LASTUPDATELOGIN, value);
  }

  /**getAttrInvokeAccessor: generated method. Do not modify.
   */
  protected Object getAttrInvokeAccessor(int index, 
                                         AttributeDefImpl attrDef) throws Exception
  {
    switch (index)
    {
    case IDREQUEST:
      return getIdRequest();
    case IDMATERIAL:
      return getIdMaterial();
    case IDLOADPRESENTATION:
      return getIdLoadPresentation();
    case LOADPRESENTATION:
      return getLoadPresentation();
    case WEIGHT:
      return getWeight();
    case WEIGHTUNITS:
      return getWeightUnits();
    case UNITSNUMBER:
      return getUnitsNumber();
    case UNITSTYPE:
      return getUnitsType();
    case TOTALWEIGHT:
      return getTotalWeight();
    case TOTALWEIGHTUNITS:
      return getTotalWeightUnits();
    case LENGHT:
      return getLenght();
    case LENGHTUNITS:
      return getLenghtUnits();
    case WIDTH:
      return getWidth();
    case WIDTHUNITS:
      return getWidthUnits();
    case HEIGHT:
      return getHeight();
    case HEIGHTUNITS:
      return getHeightUnits();
    case ATTRIBUTE1:
      return getAttribute1();
    case ATTRIBUTE2:
      return getAttribute2();
    case ATTRIBUTE3:
      return getAttribute3();
    case ATTRIBUTE4:
      return getAttribute4();
    case ATTRIBUTE5:
      return getAttribute5();
    case ATTRIBUTE6:
      return getAttribute6();
    case ATTRIBUTE7:
      return getAttribute7();
    case ATTRIBUTE8:
      return getAttribute8();
    case ATTRIBUTE9:
      return getAttribute9();
    case ATTRIBUTE10:
      return getAttribute10();
    case LASTUPDATEDATE:
      return getLastUpdateDate();
    case LASTUPDATEDBY:
      return getLastUpdatedBy();
    case CREATIONDATE:
      return getCreationDate();
    case CREATEDBY:
      return getCreatedBy();
    case LASTUPDATELOGIN:
      return getLastUpdateLogin();
    case MATERIALMEO:
      return getMaterialMEO();
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
    case IDREQUEST:
      setIdRequest((Number)value);
      return;
    case IDMATERIAL:
      setIdMaterial((Number)value);
      return;
    case IDLOADPRESENTATION:
      setIdLoadPresentation((Number)value);
      return;
    case LOADPRESENTATION:
      setLoadPresentation((String)value);
      return;
    case WEIGHT:
      setWeight((Number)value);
      return;
    case WEIGHTUNITS:
      setWeightUnits((String)value);
      return;
    case UNITSNUMBER:
      setUnitsNumber((Number)value);
      return;
    case UNITSTYPE:
      setUnitsType((String)value);
      return;
    case TOTALWEIGHT:
      setTotalWeight((Number)value);
      return;
    case TOTALWEIGHTUNITS:
      setTotalWeightUnits((String)value);
      return;
    case LENGHT:
      setLenght((Number)value);
      return;
    case LENGHTUNITS:
      setLenghtUnits((String)value);
      return;
    case WIDTH:
      setWidth((Number)value);
      return;
    case WIDTHUNITS:
      setWidthUnits((String)value);
      return;
    case HEIGHT:
      setHeight((Number)value);
      return;
    case HEIGHTUNITS:
      setHeightUnits((String)value);
      return;
    case ATTRIBUTE1:
      setAttribute1((String)value);
      return;
    case ATTRIBUTE2:
      setAttribute2((String)value);
      return;
    case ATTRIBUTE3:
      setAttribute3((String)value);
      return;
    case ATTRIBUTE4:
      setAttribute4((String)value);
      return;
    case ATTRIBUTE5:
      setAttribute5((String)value);
      return;
    case ATTRIBUTE6:
      setAttribute6((String)value);
      return;
    case ATTRIBUTE7:
      setAttribute7((String)value);
      return;
    case ATTRIBUTE8:
      setAttribute8((String)value);
      return;
    case ATTRIBUTE9:
      setAttribute9((String)value);
      return;
    case ATTRIBUTE10:
      setAttribute10((String)value);
      return;
    case LASTUPDATEDATE:
      setLastUpdateDate((Date)value);
      return;
    case LASTUPDATEDBY:
      setLastUpdatedBy((Number)value);
      return;
    case CREATIONDATE:
      setCreationDate((Date)value);
      return;
    case CREATEDBY:
      setCreatedBy((Number)value);
      return;
    case LASTUPDATELOGIN:
      setLastUpdateLogin((Number)value);
      return;
    default:
      super.setAttrInvokeAccessor(index, value, attrDef);
      return;
    }
  }

  /**Gets the associated entity MaterialMEOImpl
   */
  public MaterialMEOImpl getMaterialMEO()
  {
    return (MaterialMEOImpl)getAttributeInternal(MATERIALMEO);
  }

  /**Sets <code>value</code> as the associated entity MaterialMEOImpl
   */
  public void setMaterialMEO(MaterialMEOImpl value)
  {
    setAttributeInternal(MATERIALMEO, value);
  }

  /**Creates a Key object based on given key constituents
   */
  public static Key createPrimaryKey(Number idRequest, Number idMaterial)
  {
    return new Key(new Object[]{idRequest, idMaterial});
  }
}