package xxgam.oracle.apps.xbol.tm.InvoiceAs.server;

import oracle.apps.fnd.framework.server.OAViewRowImpl;

import oracle.jbo.RowIterator;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class CostVORowImpl extends OAViewRowImpl {
    public static final int IDFREIGHTCHAR = 0;
    public static final int COSTFREIGHT = 1;
    public static final int COSTADD = 2;
    public static final int XTCOSTTAXESADDXTCOSTTAXESMANEUVERSXTCOSTTAXESFREIGHT = 3;
    public static final int RETENTIONCOST = 4;

    /**This is the default constructor (do not remove)
     */
    public CostVORowImpl() {
    }

    /**Gets the attribute value for the calculated attribute IdFreightChar
     */
    public String getIdFreightChar() {
        return (String) getAttributeInternal(IDFREIGHTCHAR);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute IdFreightChar
     */
    public void setIdFreightChar(String value) {
        setAttributeInternal(IDFREIGHTCHAR, value);
    }

    /**Gets the attribute value for the calculated attribute CostFreight
     */
    public Number getCostFreight() {
        return (Number) getAttributeInternal(COSTFREIGHT);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute CostFreight
     */
    public void setCostFreight(Number value) {
        setAttributeInternal(COSTFREIGHT, value);
    }

    /**Gets the attribute value for the calculated attribute CostAdd
     */
    public Number getCostAdd() {
        return (Number) getAttributeInternal(COSTADD);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute CostAdd
     */
    public void setCostAdd(Number value) {
        setAttributeInternal(COSTADD, value);
    }

    /**Gets the attribute value for the calculated attribute XtCostTaxesAddXtCostTaxesManeuversXtCostTaxesFreight
     */
    public Number getXtCostTaxesAddXtCostTaxesManeuversXtCostTaxesFreight() {
        return (Number) getAttributeInternal(XTCOSTTAXESADDXTCOSTTAXESMANEUVERSXTCOSTTAXESFREIGHT);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute XtCostTaxesAddXtCostTaxesManeuversXtCostTaxesFreight
     */
    public void setXtCostTaxesAddXtCostTaxesManeuversXtCostTaxesFreight(Number value) {
        setAttributeInternal(XTCOSTTAXESADDXTCOSTTAXESMANEUVERSXTCOSTTAXESFREIGHT, value);
    }

    /**Gets the attribute value for the calculated attribute RetentionCost
     */
    public Number getRetentionCost() {
        return (Number) getAttributeInternal(RETENTIONCOST);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute RetentionCost
     */
    public void setRetentionCost(Number value) {
        setAttributeInternal(RETENTIONCOST, value);
    }

    /**getAttrInvokeAccessor: generated method. Do not modify.
     */
    protected Object getAttrInvokeAccessor(int index, 
                                           AttributeDefImpl attrDef) throws Exception {
        switch (index) {
        case IDFREIGHTCHAR:
            return getIdFreightChar();
        case COSTFREIGHT:
            return getCostFreight();
        case COSTADD:
            return getCostAdd();
        case XTCOSTTAXESADDXTCOSTTAXESMANEUVERSXTCOSTTAXESFREIGHT:
            return getXtCostTaxesAddXtCostTaxesManeuversXtCostTaxesFreight();
        case RETENTIONCOST:
            return getRetentionCost();
        default:
            return super.getAttrInvokeAccessor(index, attrDef);
        }
    }

    /**setAttrInvokeAccessor: generated method. Do not modify.
     */
    protected void setAttrInvokeAccessor(int index, Object value, 
                                         AttributeDefImpl attrDef) throws Exception {
        switch (index) {
        default:
            super.setAttrInvokeAccessor(index, value, attrDef);
            return;
        }
    }

}
