package xxgam.oracle.apps.xbol.tm.catalogue.schema.server;

import oracle.apps.fnd.framework.server.OAEntityDefImpl;
import oracle.apps.fnd.framework.server.OAEntityImpl;

import oracle.jbo.AttributeList;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.domain.RowID;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class OriDestEOImpl extends OAEntityImpl {
    public static final int ATTRIBUTE1 = 0;
    public static final int ATTRIBUTE10 = 1;
    public static final int ATTRIBUTE2 = 2;
    public static final int ATTRIBUTE3 = 3;
    public static final int ATTRIBUTE4 = 4;
    public static final int ATTRIBUTE5 = 5;
    public static final int ATTRIBUTE6 = 6;
    public static final int ATTRIBUTE7 = 7;
    public static final int ATTRIBUTE8 = 8;
    public static final int ATTRIBUTE9 = 9;
    public static final int CODE = 10;
    public static final int COUNTRYCODE = 11;
    public static final int COUNTRYDESCRIPTION = 12;
    public static final int CREATEDBY = 13;
    public static final int CREATIONDATE = 14;
    public static final int DESCRIPTION = 15;
    public static final int LASTUPDATEDBY = 16;
    public static final int LASTUPDATEDATE = 17;
    public static final int LASTUPDATELOGIN = 18;
    public static final int LOADDATE = 19;
    public static final int ORIDESTID = 20;
    public static final int ROWID = 21;
    public static final int STATECODE = 22;
    public static final int STATEDESCRIPTION = 23;
    private static OAEntityDefImpl mDefinitionObject;

    /**This is the default constructor (do not remove)
     */
    public OriDestEOImpl() {
    }

    /**Retrieves the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        if (mDefinitionObject == null) {
            mDefinitionObject = 
                    (OAEntityDefImpl)EntityDefImpl.findDefObject("xxgam.oracle.apps.xbol.tm.catalogue.schema.server.OriDestEO");
        }
        return mDefinitionObject;
    }

    /**Add attribute defaulting logic in this method.
     */
    public void create(AttributeList attributeList) {
        super.create(attributeList);
    }

    /**Add entity remove logic in this method.
     */
    public void remove() {
        super.remove();
    }

    /**Add Entity validation code in this method.
     */
    protected void validateEntity() {
        super.validateEntity();
    }

    /**Gets the attribute value for Attribute1, using the alias name Attribute1
     */
    public String getAttribute1() {
        return (String)getAttributeInternal(ATTRIBUTE1);
    }

    /**Sets <code>value</code> as the attribute value for Attribute1
     */
    public void setAttribute1(String value) {
        setAttributeInternal(ATTRIBUTE1, value);
    }

    /**Gets the attribute value for Attribute10, using the alias name Attribute10
     */
    public String getAttribute10() {
        return (String)getAttributeInternal(ATTRIBUTE10);
    }

    /**Sets <code>value</code> as the attribute value for Attribute10
     */
    public void setAttribute10(String value) {
        setAttributeInternal(ATTRIBUTE10, value);
    }

    /**Gets the attribute value for Attribute2, using the alias name Attribute2
     */
    public String getAttribute2() {
        return (String)getAttributeInternal(ATTRIBUTE2);
    }

    /**Sets <code>value</code> as the attribute value for Attribute2
     */
    public void setAttribute2(String value) {
        setAttributeInternal(ATTRIBUTE2, value);
    }

    /**Gets the attribute value for Attribute3, using the alias name Attribute3
     */
    public String getAttribute3() {
        return (String)getAttributeInternal(ATTRIBUTE3);
    }

    /**Sets <code>value</code> as the attribute value for Attribute3
     */
    public void setAttribute3(String value) {
        setAttributeInternal(ATTRIBUTE3, value);
    }

    /**Gets the attribute value for Attribute4, using the alias name Attribute4
     */
    public String getAttribute4() {
        return (String)getAttributeInternal(ATTRIBUTE4);
    }

    /**Sets <code>value</code> as the attribute value for Attribute4
     */
    public void setAttribute4(String value) {
        setAttributeInternal(ATTRIBUTE4, value);
    }

    /**Gets the attribute value for Attribute5, using the alias name Attribute5
     */
    public String getAttribute5() {
        return (String)getAttributeInternal(ATTRIBUTE5);
    }

    /**Sets <code>value</code> as the attribute value for Attribute5
     */
    public void setAttribute5(String value) {
        setAttributeInternal(ATTRIBUTE5, value);
    }

    /**Gets the attribute value for Attribute6, using the alias name Attribute6
     */
    public String getAttribute6() {
        return (String)getAttributeInternal(ATTRIBUTE6);
    }

    /**Sets <code>value</code> as the attribute value for Attribute6
     */
    public void setAttribute6(String value) {
        setAttributeInternal(ATTRIBUTE6, value);
    }

    /**Gets the attribute value for Attribute7, using the alias name Attribute7
     */
    public String getAttribute7() {
        return (String)getAttributeInternal(ATTRIBUTE7);
    }

    /**Sets <code>value</code> as the attribute value for Attribute7
     */
    public void setAttribute7(String value) {
        setAttributeInternal(ATTRIBUTE7, value);
    }

    /**Gets the attribute value for Attribute8, using the alias name Attribute8
     */
    public String getAttribute8() {
        return (String)getAttributeInternal(ATTRIBUTE8);
    }

    /**Sets <code>value</code> as the attribute value for Attribute8
     */
    public void setAttribute8(String value) {
        setAttributeInternal(ATTRIBUTE8, value);
    }

    /**Gets the attribute value for Attribute9, using the alias name Attribute9
     */
    public String getAttribute9() {
        return (String)getAttributeInternal(ATTRIBUTE9);
    }

    /**Sets <code>value</code> as the attribute value for Attribute9
     */
    public void setAttribute9(String value) {
        setAttributeInternal(ATTRIBUTE9, value);
    }

    /**Gets the attribute value for Code, using the alias name Code
     */
    public String getCode() {
        return (String)getAttributeInternal(CODE);
    }

    /**Sets <code>value</code> as the attribute value for Code
     */
    public void setCode(String value) {
        setAttributeInternal(CODE, value);
    }

    /**Gets the attribute value for CountryCode, using the alias name CountryCode
     */
    public String getCountryCode() {
        return (String)getAttributeInternal(COUNTRYCODE);
    }

    /**Sets <code>value</code> as the attribute value for CountryCode
     */
    public void setCountryCode(String value) {
        setAttributeInternal(COUNTRYCODE, value);
    }

    /**Gets the attribute value for CountryDescription, using the alias name CountryDescription
     */
    public String getCountryDescription() {
        return (String)getAttributeInternal(COUNTRYDESCRIPTION);
    }

    /**Sets <code>value</code> as the attribute value for CountryDescription
     */
    public void setCountryDescription(String value) {
        setAttributeInternal(COUNTRYDESCRIPTION, value);
    }

    /**Gets the attribute value for CreatedBy, using the alias name CreatedBy
     */
    public Number getCreatedBy() {
        return (Number)getAttributeInternal(CREATEDBY);
    }

    /**Sets <code>value</code> as the attribute value for CreatedBy
     */
    public void setCreatedBy(Number value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**Gets the attribute value for CreationDate, using the alias name CreationDate
     */
    public Date getCreationDate() {
        return (Date)getAttributeInternal(CREATIONDATE);
    }

    /**Sets <code>value</code> as the attribute value for CreationDate
     */
    public void setCreationDate(Date value) {
        setAttributeInternal(CREATIONDATE, value);
    }

    /**Gets the attribute value for Description, using the alias name Description
     */
    public String getDescription() {
        return (String)getAttributeInternal(DESCRIPTION);
    }

    /**Sets <code>value</code> as the attribute value for Description
     */
    public void setDescription(String value) {
        setAttributeInternal(DESCRIPTION, value);
    }

    /**Gets the attribute value for LastUpdatedBy, using the alias name LastUpdatedBy
     */
    public Number getLastUpdatedBy() {
        return (Number)getAttributeInternal(LASTUPDATEDBY);
    }

    /**Sets <code>value</code> as the attribute value for LastUpdatedBy
     */
    public void setLastUpdatedBy(Number value) {
        setAttributeInternal(LASTUPDATEDBY, value);
    }

    /**Gets the attribute value for LastUpdateDate, using the alias name LastUpdateDate
     */
    public Date getLastUpdateDate() {
        return (Date)getAttributeInternal(LASTUPDATEDATE);
    }

    /**Sets <code>value</code> as the attribute value for LastUpdateDate
     */
    public void setLastUpdateDate(Date value) {
        setAttributeInternal(LASTUPDATEDATE, value);
    }

    /**Gets the attribute value for LastUpdateLogin, using the alias name LastUpdateLogin
     */
    public Number getLastUpdateLogin() {
        return (Number)getAttributeInternal(LASTUPDATELOGIN);
    }

    /**Sets <code>value</code> as the attribute value for LastUpdateLogin
     */
    public void setLastUpdateLogin(Number value) {
        setAttributeInternal(LASTUPDATELOGIN, value);
    }

    /**Gets the attribute value for LoadDate, using the alias name LoadDate
     */
    public Date getLoadDate() {
        return (Date)getAttributeInternal(LOADDATE);
    }

    /**Sets <code>value</code> as the attribute value for LoadDate
     */
    public void setLoadDate(Date value) {
        setAttributeInternal(LOADDATE, value);
    }

    /**Gets the attribute value for OridestId, using the alias name OridestId
     */
    public Number getOridestId() {
        return (Number)getAttributeInternal(ORIDESTID);
    }

    /**Sets <code>value</code> as the attribute value for OridestId
     */
    public void setOridestId(Number value) {
        setAttributeInternal(ORIDESTID, value);
    }

    /**Gets the attribute value for RowID, using the alias name RowID
     */
    public RowID getRowID() {
        return (RowID)getAttributeInternal(ROWID);
    }

    /**Gets the attribute value for StateCode, using the alias name StateCode
     */
    public String getStateCode() {
        return (String)getAttributeInternal(STATECODE);
    }

    /**Sets <code>value</code> as the attribute value for StateCode
     */
    public void setStateCode(String value) {
        setAttributeInternal(STATECODE, value);
    }

    /**Gets the attribute value for StateDescription, using the alias name StateDescription
     */
    public String getStateDescription() {
        return (String)getAttributeInternal(STATEDESCRIPTION);
    }

    /**Sets <code>value</code> as the attribute value for StateDescription
     */
    public void setStateDescription(String value) {
        setAttributeInternal(STATEDESCRIPTION, value);
    }

    /**getAttrInvokeAccessor: generated method. Do not modify.
     */
    protected Object getAttrInvokeAccessor(int index, 
                                           AttributeDefImpl attrDef) throws Exception {
        switch (index) {
        case ATTRIBUTE1:
            return getAttribute1();
        case ATTRIBUTE10:
            return getAttribute10();
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
        case CODE:
            return getCode();
        case COUNTRYCODE:
            return getCountryCode();
        case COUNTRYDESCRIPTION:
            return getCountryDescription();
        case CREATEDBY:
            return getCreatedBy();
        case CREATIONDATE:
            return getCreationDate();
        case DESCRIPTION:
            return getDescription();
        case LASTUPDATEDBY:
            return getLastUpdatedBy();
        case LASTUPDATEDATE:
            return getLastUpdateDate();
        case LASTUPDATELOGIN:
            return getLastUpdateLogin();
        case LOADDATE:
            return getLoadDate();
        case ORIDESTID:
            return getOridestId();
        case ROWID:
            return getRowID();
        case STATECODE:
            return getStateCode();
        case STATEDESCRIPTION:
            return getStateDescription();
        default:
            return super.getAttrInvokeAccessor(index, attrDef);
        }
    }

    /**setAttrInvokeAccessor: generated method. Do not modify.
     */
    protected void setAttrInvokeAccessor(int index, Object value, 
                                         AttributeDefImpl attrDef) throws Exception {
        switch (index) {
        case ATTRIBUTE1:
            setAttribute1((String)value);
            return;
        case ATTRIBUTE10:
            setAttribute10((String)value);
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
        case CODE:
            setCode((String)value);
            return;
        case COUNTRYCODE:
            setCountryCode((String)value);
            return;
        case COUNTRYDESCRIPTION:
            setCountryDescription((String)value);
            return;
        case CREATEDBY:
            setCreatedBy((Number)value);
            return;
        case CREATIONDATE:
            setCreationDate((Date)value);
            return;
        case DESCRIPTION:
            setDescription((String)value);
            return;
        case LASTUPDATEDBY:
            setLastUpdatedBy((Number)value);
            return;
        case LASTUPDATEDATE:
            setLastUpdateDate((Date)value);
            return;
        case LASTUPDATELOGIN:
            setLastUpdateLogin((Number)value);
            return;
        case LOADDATE:
            setLoadDate((Date)value);
            return;
        case ORIDESTID:
            setOridestId((Number)value);
            return;
        case STATECODE:
            setStateCode((String)value);
            return;
        case STATEDESCRIPTION:
            setStateDescription((String)value);
            return;
        default:
            super.setAttrInvokeAccessor(index, value, attrDef);
            return;
        }
    }
}
