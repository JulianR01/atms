package xxgam.oracle.apps.xbol.tm.InvoiceAs.server;

import oracle.apps.fnd.framework.OAViewObject;
import oracle.apps.fnd.framework.server.OAApplicationModuleImpl;

import oracle.apps.fnd.framework.webui.OAPageContext;

import oracle.apps.fnd.framework.webui.beans.OAWebBean;

import oracle.apps.fnd.framework.webui.beans.form.OACheckBoxBean;

import oracle.jbo.RowSetIterator;
import oracle.jbo.ViewCriteria;
import oracle.jbo.ViewCriteriaRow;
import oracle.jbo.server.ViewLinkImpl;


// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class InvoiceAsAMImpl extends OAApplicationModuleImpl {
    /**This is the default constructor (do not remove)
     */
    public InvoiceAsAMImpl() {
    }

    /**Sample main for debugging Business Components code using the tester.
     */
    public static void main(String[] args) {
        launchTester("xxgam.oracle.apps.xbol.tm.InvoiceAs.server", /* package name */
      "InvoiceAsAMLocal" /* Configuration Name */);
    }


    /**custom methods*/
     public void filterInvoices(String StringProvider
                                , oracle.jbo.domain.Date fechaini
                                , oracle.jbo.domain.Date fechafin){
                 
                 
      oracle.jbo.domain.Date iniDate = null;
      oracle.jbo.domain.Date endDate = null;
           
      System.out.println("InvoiceAsAMImpl Entro a filterInvoices");
      MasterFreightVOImpl masterFreightVOImpl = getMasterFreightVO1();         
      ViewCriteria vc = masterFreightVOImpl.createViewCriteria();
      ViewCriteriaRow vcr1 = vc.createViewCriteriaRow();
      ViewCriteriaRow vcr2 = vc.createViewCriteriaRow();

      System.out.println("InvoiceAsAMImpl inicializados viewCriteria y viewCriteriaRow");
    
          if (StringProvider != null){
            System.out.println("InvoiceAsAMImpl proveedor no nulo");
            vcr1.setAttribute("Provider",StringProvider);}     
                                   
      vc.add(vcr1);
      
      masterFreightVOImpl.applyViewCriteria(vc);
 
        if (fechaini ==null ){
        iniDate = new oracle.jbo.domain.Date("0001-01-01");
        }
         if (fechafin ==null){
         endDate = new oracle.jbo.domain.Date("4712-12-31");
         }
        else{
            iniDate = new oracle.jbo.domain.Date(fechaini);
            endDate = new oracle.jbo.domain.Date(fechafin);
        }

      masterFreightVOImpl.setWhereClause("arrival_date between  fnd_date.canonical_to_date('"+ iniDate +"') and fnd_date.canonical_to_date('"+ endDate +"') " +
      "and  (invoice_status is  null or invoice_status not in  ('Conciliado'))");

      System.out.println(masterFreightVOImpl.getQuery());
      masterFreightVOImpl.executeQuery();
  
      System.out.println("Executed query");  
     }

    public void checker (){
    System.out.println("InvoiceAsAMImpl checker");
        MasterFreightVOImpl voRU = getMasterFreightVO1();
       System.out.println("checkerDetail");
        RowSetIterator rowSetIterator = voRU.createRowSetIterator(null);
        
        do{
             System.out.println("entro a do");
             MasterFreightVORowImpl masterFreightVORowImpl = (MasterFreightVORowImpl)rowSetIterator.next();
             System.out.println("rowSetIterator.next ");
                       
            System.out.println("detailVORowImpl.getCheckBox(): " + masterFreightVORowImpl.getCheckBox());
            
             if (masterFreightVORowImpl.getCheckBox()!=null ){
              System.out.println("entro a if");
                masterFreightVORowImpl.setflagCon(true);

            if (masterFreightVORowImpl.getCheckBox()!=null ){
                masterFreightVORowImpl.setInvoiceStatus("Conciliado");
                System.out.println("estatus del conciliado " + masterFreightVORowImpl.getInvoiceStatus());
            }
            
              apply();  
            }
          }
          
        while(rowSetIterator.hasNext());
    }

    public void apply (){
        getTransaction().commit();

    }

    public void MasterDetails(OAPageContext pageContext,OAWebBean webBean) 
    { 
     MasterFreightVOImpl pvo = getMasterFreightVO1(); 
            pvo.executeQuery(); 
        System.out.println(pvo.getQuery());
            System.out.println("master det");
    }



    /**Container's getter for detailVO1
     */


    /**Container's getter for ExtraCostVO1
     */
    public ExtraCostVOImpl getExtraCostVO1() {
        return (ExtraCostVOImpl)findViewObject("ExtraCostVO1");
    }

    /**Container's getter for MasterFreightVO1
     */
    public MasterFreightVOImpl getMasterFreightVO1() {
        return (MasterFreightVOImpl)findViewObject("MasterFreightVO1");
    }

    /**Container's getter for ExtraCostVO2
     */
    public ExtraCostVOImpl getExtraCostVO2() {
        return (ExtraCostVOImpl)findViewObject("ExtraCostVO2");
    }

    /**Container's getter for MasterExtraVL1
     */
    public ViewLinkImpl getMasterExtraVL1() {
        return (ViewLinkImpl)findViewLink("MasterExtraVL1");
    }

    /**Container's getter for CostVO1
     */
    public CostVOImpl getCostVO1() {
        return (CostVOImpl)findViewObject("CostVO1");
    }

    /**Container's getter for FreightCostVL1
     */
    public ViewLinkImpl getFreightCostVL1() {
        return (ViewLinkImpl)findViewLink("FreightCostVL1");
    }
}
