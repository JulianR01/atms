/*===========================================================================+
 |   Copyright (c) 2001, 2005 Oracle Corporation, Redwood Shores, CA, USA    |
 |                         All rights reserved.                              |
 +===========================================================================+
 |  HISTORY                                                                  |
 +===========================================================================*/
package xxgam.oracle.apps.xbol.tm.InvoiceAs.webui;


import java.sql.SQLException;

import oracle.apps.fnd.common.VersionInfo;

import oracle.apps.fnd.framework.webui.OAControllerImpl;
import oracle.apps.fnd.framework.webui.OAPageContext;
import oracle.apps.fnd.framework.webui.beans.OAWebBean;


import oracle.apps.fnd.framework.webui.beans.message.OAMessageDateFieldBean;

import xxgam.oracle.apps.xbol.tm.InvoiceAs.server.InvoiceAsAMImpl;

/**
 * Controller for ...
 */
public class InvoiceAsCO extends OAControllerImpl
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
    InvoiceAsAMImpl am = (InvoiceAsAMImpl)pageContext.getApplicationModule(webBean);
    
      System.out.println("InvoiceAsCO Entro a PR");
      if (!pageContext.isFormSubmission()) {
          System.out.println("Debug 1 !isFormSubmission()");
         /* am.MasterDetails(pageContext,webBean);*/

      } else
          System.out.println("Debug 2 isFormSubmission()");  }

  /**
   * Procedure to handle form submissions for form elements in
   * a region.
   * @param pageContext the current OA page context
   * @param webBean the web bean corresponding to the region
   */
  public void processFormRequest(OAPageContext pageContext, OAWebBean webBean)
  {
    super.processFormRequest(pageContext, webBean);
    
      InvoiceAsAMImpl am = (InvoiceAsAMImpl)pageContext.getApplicationModule(webBean);
     
      String provider = pageContext.getParameter("Provider");    
 
       OAMessageDateFieldBean fechainic = (OAMessageDateFieldBean)webBean.findChildRecursive("dateini");
       OAMessageDateFieldBean fechafin = (OAMessageDateFieldBean)webBean.findChildRecursive("datefin");
       oracle.jbo.domain.Date iniDate = null;
       oracle.jbo.domain.Date endDate = null;

            try {
                iniDate = new oracle.jbo.domain.Date(fechainic.getValue(pageContext));
                endDate = new oracle.jbo.domain.Date(fechafin.getValue(pageContext));
            } catch (SQLException e) {
              System.out.println("catch: " + e);  // TODO
            }
            
        if (pageContext.getParameter("Go") != null ){
        System.out.println("initial date: " + iniDate);
        System.out.println("final date: " + endDate);

        System.out.println("InvoiceAsCO Provider: " + provider);
        System.out.println("InvoiceAsCO Go pressed");

        am.filterInvoices(provider,iniDate,endDate);
    }

    if (pageContext.getParameter("Conciliar") != null ){
        System.out.println("InvoiceAsCO presionado conciliar ");
        am.checker();
        am.apply();
        System.out.println("commit");
    }
    
    
  }

}
