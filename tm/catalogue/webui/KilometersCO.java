/*===========================================================================+
 |   Copyright (c) 2001, 2005 Oracle Corporation, Redwood Shores, CA, USA    |
 |                         All rights reserved.                              |
 +===========================================================================+
 |  HISTORY                                                                  |
 +===========================================================================*/
package xxgam.oracle.apps.xbol.tm.catalogue.webui;

import java.io.Serializable;

import oracle.apps.fnd.common.VersionInfo;
import oracle.apps.fnd.framework.OAException;
import oracle.apps.fnd.framework.webui.OAControllerImpl;
import oracle.apps.fnd.framework.webui.OADialogPage;
import oracle.apps.fnd.framework.webui.OAPageContext;
import oracle.apps.fnd.framework.webui.beans.OAWebBean;
import oracle.apps.fnd.framework.webui.beans.message.OAMessageTextInputBean;

import xxgam.oracle.apps.xbol.tm.catalogue.server.catalogueAMImpl;

/**
 * Controller for ...
 */
public class KilometersCO extends OAControllerImpl
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
    
      catalogueAMImpl am = (catalogueAMImpl)pageContext.getApplicationModule(webBean);
      if (!pageContext.isFormSubmission()) {
      am.filterKmini();
          System.out.println("Debug 1 !isFormSubmission()");
      } 
      else
          System.out.println("Debug 2 isFormSubmission()");  
      am.filterKmini();
    
  }

  /**
   * Procedure to handle form submissions for form elements in
   * a region.
   * @param pageContext the current OA page context
   * @param webBean the web bean corresponding to the region
   */
  public void processFormRequest(OAPageContext pageContext, OAWebBean webBean)
  {
    super.processFormRequest(pageContext, webBean);
    
    
      catalogueAMImpl am = (catalogueAMImpl)pageContext.getApplicationModule(webBean);
      
      String StrOrigin, StrDestination;
      StrOrigin = pageContext.getParameter("OriginFilter");
      StrDestination = pageContext.getParameter("DestFilter");
      
        if (pageContext.getParameter("new") != null){
        System.out.println("new pressed");
            am.createRecordKm();
        }
      
        else if (pageContext.getParameter("save") != null){
          System.out.println("save pressed");
          am.SaveKm();
        }
      
        else if (pageContext.getParameter("cancel") != null){
              System.out.println("cancel pressed");
              am.CancelKm();
          }
      
        else if (pageContext.getParameter("go") != null){

                System.out.println("go pressed");
                System.out.println();
                am.filterKm(StrOrigin, StrDestination);
            }
        
          else if("deleteEvent".equals(pageContext.getParameter(EVENT_PARAM))){
        
              OAMessageTextInputBean kmIdBean = (OAMessageTextInputBean)webBean.findChildRecursive("KmId");
              String testid = kmIdBean.getValue(pageContext).toString();
               
              System.out.println("delete pressed, testid: " + testid);
          
              OAException descMesg = new OAException("FND", "AM_PARAMREGSTRY_DELETE_WARN");
              OAException instrMesg = new OAException("FND", "AM_PARAMREGSTRY_DELETE_WARN");
      
                     OADialogPage dialogPage = new OADialogPage(OAException.WARNING, descMesg, instrMesg, "", "");
                     dialogPage.setOkButtonToPost(true);
                     dialogPage.setNoButtonToPost(true);
                     dialogPage.setPostToCallingPage(true);
        
                     dialogPage.setOkButtonItemName("SaveYes");
                     dialogPage.setNoButtonItemName("SaveNo");
                      
                     pageContext.redirectToDialogPage(dialogPage);
          }
         
         else if (pageContext.getParameter("SaveYes") != null) {
          
                OAMessageTextInputBean kmIdBean = (OAMessageTextInputBean)webBean.findChildRecursive("KmId");
                String testid = kmIdBean.getValue(pageContext).toString();
                System.out.println("pressed yes, testid: " + testid);
                         
                Serializable[] param = {testid};
                System.out.println("Entra en eliminar");
                
                am.invokeMethod("deleteRecordKm", param);
                am.SaveKm();
               am.filterKmini();
                throw new OAException("Data has been deleted successfully.",OAException.CONFIRMATION);
                }
      
          else if (pageContext.getParameter("SaveNo") != null) {
              System.out.println("pressed no");
              am.CancelKm();
      
          }
          
          else if("updateEvent".equals(pageContext.getParameter(EVENT_PARAM))){
          
            OAMessageTextInputBean kmIdBean = (OAMessageTextInputBean)webBean.findChildRecursive("KmId");
            String testid = kmIdBean.getValue(pageContext).toString();
                  
            System.out.println("testid: " + testid);
            Serializable[] param = {testid};
          
            am.invokeMethod("updateRecordKm", param);
                   
          }

      
  }

}
