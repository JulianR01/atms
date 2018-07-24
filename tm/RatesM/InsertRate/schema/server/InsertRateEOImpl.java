package xxgam.oracle.apps.xbol.tm.RatesM.InsertRate.schema.server;

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
public class InsertRateEOImpl extends OAEntityImpl {
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
    public static final int CLASSIFICATION = 10;
    public static final int CREATEDBY = 11;
    public static final int CREATIONDATE = 12;
    public static final int CURRENCY = 13;
    public static final int DATEFROM = 14;
    public static final int DATETO = 15;
    public static final int DESTINATION = 16;
    public static final int DISTRIBUTIONTYPE = 17;
    public static final int FLAG = 18;
    public static final int IDTARIFA = 19;
    public static final int INTERSECTION = 20;
    public static final int LASTUPDATEDBY = 21;
    public static final int LASTUPDATEDATE = 22;
    public static final int LASTUPDATELOGIN = 23;
    public static final int MANEUVERS = 24;
    public static final int ORIGIN = 25;
    public static final int PROVIDERNAME = 26;
    public static final int PROVIDERNUMBER = 27;
    public static final int RATE = 28;
    public static final int REPARTS = 29;
    public static final int ROWID = 30;
    public static final int RMODE = 31;
    public static final int RZONE = 32;
    public static final int TYPED = 33;
    public static final int TYPEV = 34;
    private static OAEntityDefImpl mDefinitionObject;

    /**This is the default constructor (do not remove)
     */
    public InsertRateEOImpl() {
    }

    /**Retrieves the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        if (mDefinitionObject == null) {
            mDefinitionObject = 
                    (OAEntityDefImpl)EntityDefImpl.findDefObject("xxgam.oracle.apps.xbol.tm.RatesM.InsertRate.schema.server.InsertRateEO");
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

    /**Gets the attribute value for Classification, using the alias name Classification
     */
    public String getClassification() {
        return (String)getAttributeInternal(CLASSIFICATION);
    }

    /**Sets <code>value</code> as the attribute value for Classification
     */
    public void setClassification(String value) {
        setAttributeInternal(CLASSIFICATION, value);
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

    /**Gets the attribute value for Currency, using the alias name Currency
     */
    public String getCurrency() {
        return (String)getAttributeInternal(CURRENCY);
    }

    /**Sets <code>value</code> as the attribute value for Currency
     */
    public void setCurrency(String value) {
        setAttributeInternal(CURRENCY, value);
    }

    /**Gets the attribute value for DateFrom, using the alias name DateFrom
     */
    public Date getDateFrom() {
        return (Date)getAttributeInternal(DATEFROM);
    }

    /**Sets <code>value</code> as the attribute value for DateFrom
     */
    public void setDateFrom(Date value) {
        setAttributeInternal(DATEFROM, value);
    }

    /**Gets the attribute value for DateTo, using the alias name DateTo
     */
    public Date getDateTo() {
        return (Date)getAttributeInternal(DATETO);
    }

    /**Sets <code>value</code> as the attribute value for DateTo
     */
    public void setDateTo(Date value) {
        setAttributeInternal(DATETO, value);
    }

    /**Gets the attribute value for Destination, using the alias name Destination
     */
    public String getDestination() {
        return (String)getAttributeInternal(DESTINATION);
    }

    /**Sets <code>value</code> as the attribute value for Destination
     */
    public void setDestination(String value) {
        setAttributeInternal(DESTINATION, value);
    }

    /**Gets the attribute value for DistributionType, using the alias name DistributionType
     */
    public String getDistributionType() {
        return (String)getAttributeInternal(DISTRIBUTIONTYPE);
    }

    /**Sets <code>value</code> as the attribute value for DistributionType
     */
    public void setDistributionType(String value) {
        setAttributeInternal(DISTRIBUTIONTYPE, value);
    }

    /**Gets the attribute value for Flag, using the alias name Flag
     */
    public String getFlag() {
        return (String)getAttributeInternal(FLAG);
    }

    /**Sets <code>value</code> as the attribute value for Flag
     */
    public void setFlag(String value) {
        setAttributeInternal(FLAG, value);
    }

    /**Gets the attribute value for IdTarifa, using the alias name IdTarifa
     */
    public Number getIdTarifa() {
        return (Number)getAttributeInternal(IDTARIFA);
    }

    /**Sets <code>value</code> as the attribute value for IdTarifa
     */
    public void setIdTarifa(Number value) {
        setAttributeInternal(IDTARIFA, value);
    }

    /**Gets the attribute value for Intersection, using the alias name Intersection
     */
    public String getIntersection() {
        return (String)getAttributeInternal(INTERSECTION);
    }

    /**Sets <code>value</code> as the attribute value for Intersection
     */
    public void setIntersection(String value) {
        setAttributeInternal(INTERSECTION, value);
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

    /**Gets the attribute value for Maneuvers, using the alias name Maneuvers
     */
    public Number getManeuvers() {
        return (Number)getAttributeInternal(MANEUVERS);
    }

    /**Sets <code>value</code> as the attribute value for Maneuvers
     */
    public void setManeuvers(Number value) {
        setAttributeInternal(MANEUVERS, value);
    }

    /**Gets the attribute value for Origin, using the alias name Origin
     */
    public String getOrigin() {
        return (String)getAttributeInternal(ORIGIN);
    }

    /**Sets <code>value</code> as the attribute value for Origin
     */
    public void setOrigin(String value) {
        setAttributeInternal(ORIGIN, value);
    }

    /**Gets the attribute value for ProviderName, using the alias name ProviderName
     */
    public String getProviderName() {
        return (String)getAttributeInternal(PROVIDERNAME);
    }

    /**Sets <code>value</code> as the attribute value for ProviderName
     */
    public void setProviderName(String value) {
        setAttributeInternal(PROVIDERNAME, value);
    }

    /**Gets the attribute value for ProviderNumber, using the alias name ProviderNumber
     */
    public String getProviderNumber() {
        return (String)getAttributeInternal(PROVIDERNUMBER);
    }

    /**Sets <code>value</code> as the attribute value for ProviderNumber
     */
    public void setProviderNumber(String value) {
        setAttributeInternal(PROVIDERNUMBER, value);
    }

    /**Gets the attribute value for Rate, using the alias name Rate
     */
    public Number getRate() {
        return (Number)getAttributeInternal(RATE);
    }

    /**Sets <code>value</code> as the attribute value for Rate
     */
    public void setRate(Number value) {
        setAttributeInternal(RATE, value);
    }

    /**Gets the attribute value for Reparts, using the alias name Reparts
     */
    public Number getReparts() {
        return (Number)getAttributeInternal(REPARTS);
    }

    /**Sets <code>value</code> as the attribute value for Reparts
     */
    public void setReparts(Number value) {
        setAttributeInternal(REPARTS, value);
    }

    /**Gets the attribute value for RowID, using the alias name RowID
     */
    public RowID getRowID() {
        return (RowID)getAttributeInternal(ROWID);
    }

    /**Gets the attribute value for RMode, using the alias name RMode
     */
    public String getRMode() {
        return (String)getAttributeInternal(RMODE);
    }

    /**Sets <code>value</code> as the attribute value for RMode
     */
    public void setRMode(String value) {
        setAttributeInternal(RMODE, value);
    }

    /**Gets the attribute value for RZone, using the alias name RZone
     */
    public String getRZone() {
        return (String)getAttributeInternal(RZONE);
    }

    /**Sets <code>value</code> as the attribute value for RZone
     */
    public void setRZone(String value) {
        setAttributeInternal(RZONE, value);
    }

    /**Gets the attribute value for TypeD, using the alias name TypeD
     */
    public String getTypeD() {
        return (String)getAttributeInternal(TYPED);
    }

    /**Sets <code>value</code> as the attribute value for TypeD
     */
    public void setTypeD(String value) {
        setAttributeInternal(TYPED, value);
    }

    /**Gets the attribute value for TypeV, using the alias name TypeV
     */
    public Number getTypeV() {
        return (Number)getAttributeInternal(TYPEV);
    }

    /**Sets <code>value</code> as the attribute value for TypeV
     */
    public void setTypeV(Number value) {
        setAttributeInternal(TYPEV, value);
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
        case CLASSIFICATION:
            return getClassification();
        case CREATEDBY:
            return getCreatedBy();
        case CREATIONDATE:
            return getCreationDate();
        case CURRENCY:
            return getCurrency();
        case DATEFROM:
            return getDateFrom();
        case DATETO:
            return getDateTo();
        case DESTINATION:
            return getDestination();
        case DISTRIBUTIONTYPE:
            return getDistributionType();
        case FLAG:
            return getFlag();
        case IDTARIFA:
            return getIdTarifa();
        case INTERSECTION:
            return getIntersection();
        case LASTUPDATEDBY:
            return getLastUpdatedBy();
        case LASTUPDATEDATE:
            return getLastUpdateDate();
        case LASTUPDATELOGIN:
            return getLastUpdateLogin();
        case MANEUVERS:
            return getManeuvers();
        case ORIGIN:
            return getOrigin();
        case PROVIDERNAME:
            return getProviderName();
        case PROVIDERNUMBER:
            return getProviderNumber();
        case RATE:
            return getRate();
        case REPARTS:
            return getReparts();
        case ROWID:
            return getRowID();
        case RMODE:
            return getRMode();
        case RZONE:
            return getRZone();
        case TYPED:
            return getTypeD();
        case TYPEV:
            return getTypeV();
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
        case CLASSIFICATION:
            setClassification((String)value);
            return;
        case CREATEDBY:
            setCreatedBy((Number)value);
            return;
        case CREATIONDATE:
            setCreationDate((Date)value);
            return;
        case CURRENCY:
            setCurrency((String)value);
            return;
        case DATEFROM:
            setDateFrom((Date)value);
            return;
        case DATETO:
            setDateTo((Date)value);
            return;
        case DESTINATION:
            setDestination((String)value);
            return;
        case DISTRIBUTIONTYPE:
            setDistributionType((String)value);
            return;
        case FLAG:
            setFlag((String)value);
            return;
        case IDTARIFA:
            setIdTarifa((Number)value);
            return;
        case INTERSECTION:
            setIntersection((String)value);
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
        case MANEUVERS:
            setManeuvers((Number)value);
            return;
        case ORIGIN:
            setOrigin((String)value);
            return;
        case PROVIDERNAME:
            setProviderName((String)value);
            return;
        case PROVIDERNUMBER:
            setProviderNumber((String)value);
            return;
        case RATE:
            setRate((Number)value);
            return;
        case REPARTS:
            setReparts((Number)value);
            return;
        case RMODE:
            setRMode((String)value);
            return;
        case RZONE:
            setRZone((String)value);
            return;
        case TYPED:
            setTypeD((String)value);
            return;
        case TYPEV:
            setTypeV((Number)value);
            return;
        default:
            super.setAttrInvokeAccessor(index, value, attrDef);
            return;
        }
    }
}
