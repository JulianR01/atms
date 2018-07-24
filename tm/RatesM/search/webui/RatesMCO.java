/*===========================================================================+
 |   Copyright (c) 2001, 2005 Oracle Corporation, Redwood Shores, CA, USA    |
 |                         All rights reserved.                              |
 +===========================================================================+
 |  HISTORY                                                                  |
 +===========================================================================*/
package xxgam.oracle.apps.xbol.tm.RatesM.search.webui;

import oracle.apps.fnd.common.VersionInfo;
import oracle.apps.fnd.framework.webui.OAControllerImpl;
import oracle.apps.fnd.framework.webui.OAPageContext;
import oracle.apps.fnd.framework.webui.beans.OAWebBean;

import xxgam.oracle.apps.xbol.tm.RatesM.search.server.RatesMAMImpl;

/**
 * Controller for ...
 */
public class RatesMCO extends OAControllerImpl
{
  public static final String RCS_ID="$Header$";
  public static final boolean RCS_ID_RECORDED =
        VersionInfo.recordClassVersion(RCS_ID, "%packagename%");

  /**
   * Layout and page setup logic for a region.
   * @param pageContext the current OA page context
   * @param webBean the web bean corresponding to the region
   */
  public void processRequest(OAPageContext pageContext, OAWebBean webBean)
  {
    super.processRequest(pageContext, webBean);
    
      if(!pageContext.isFormSubmission()){
               System.out.println("Debug1");
      }
           else{
              System.out.println("Debug2");
          }//fin de if(!pageContext.isFormSubmission())
  }//fin de public void processRequest(OAPageContext pageContext, OAWebBean webBean) 

  /**
   * Procedure to handle form submissions for form elements in
   * a region.
   * @param pageContext the current OA page context
   * @param webBean the web bean corresponding to the region
   */
  public void processFormRequest(OAPageContext pageContext, OAWebBean webBean)
  {
    super.processFormRequest(pageContext, webBean);
    System.out.println("Entro en el procedimiento processFormRequest");
    
    //application module
     RatesMAMImpl RatesMAMImpl = (RatesMAMImpl)pageContext.getApplicationModule(webBean);   
    
    //capturamos los datos de los lovs y pops
    String strProveedor = pageContext.getParameter("Proveedor");
    String strOrigen    = pageContext.getParameter("Origen");
    String strDestino   = pageContext.getParameter("Destino");
    String strTipo      = pageContext.getParameter("Tipo");
    
    //imprimimos los valores
    System.out.println("strProveedor:    "+strProveedor);
    System.out.println("strOrigen:  "+strOrigen);
    System.out.println("strDestino: "+strDestino);
    System.out.println("strTipo:    "+strTipo);
    
    //evento boton buscar
    if(pageContext.getParameter("BuscarBtn")!= null){
        System.out.println("boton buscar presionado");
        RatesMAMImpl.fillTable(strProveedor, strOrigen, strDestino, strTipo);
    }//fin de if(pageContext.getParameter("BuscarBtn")!= null)
    
  }//fin de public void processFormRequest(OAPageContext pageContext, OAWebBean webBean)

}//fin del clase RatesMCO
