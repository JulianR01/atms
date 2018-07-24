package xxgam.oracle.apps.xbol.tm.RatesM.search.server;

import oracle.apps.fnd.framework.server.OAApplicationModuleImpl;

import oracle.jbo.ViewCriteria;
import oracle.jbo.ViewCriteriaRow;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class RatesMAMImpl extends OAApplicationModuleImpl {
    /**This is the default constructor (do not remove)
     */
    public RatesMAMImpl() {
    }

    /**Sample main for debugging Business Components code using the tester.
     */
    public static void main(String[] args) {
        launchTester("xxgam.oracle.apps.xbol.tm.RatesM.search.server", /* package name */
      "RatesMAMLocal" /* Configuration Name */);
    }

    /**Container's getter for RatesVO1
     */
    public RatesVOImpl getRatesVO1() {
        return (RatesVOImpl)findViewObject("RatesVO1");
    }

    public void fillTable(String strProveedor, String strOrigen, 
                          String strDestino, String strTipo) {
        RatesVOImpl ratesVOImpl = getRatesVO1();         
        
        ViewCriteria vc         = ratesVOImpl.createViewCriteria();
        ViewCriteriaRow vcr1    = vc.createViewCriteriaRow();
        
            
        if(null != strProveedor){
            System.out.println("proveedor no null");
            vcr1.setAttribute("ProviderName",strProveedor);
        }//fin de if(null != strProveedor)
            
        if(null != strOrigen){
            System.out.println("origen no null");
            vcr1.setAttribute("Origin",strOrigen);    
        }//fin de if(null != strProveedor)
        
         if(null != strDestino){
             System.out.println("Destino no null");
             vcr1.setAttribute("Destination",strDestino);    
         }//fin de if(null != strDestino)
         
          if(null != strTipo){
              System.out.println("Tipo no null");
              vcr1.setAttribute("TypeD",strTipo);    
          }//fin de if(null != strTipo)
        
        vc.add(vcr1);
        
        ratesVOImpl.applyViewCriteria(vc);
        ratesVOImpl.executeQuery();
        
                          
    }//public void fillTable
}//RatesMAMImpl
