/*===========================================================================+
 |   Copyright (c) 2001, 2005 Oracle Corporation, Redwood Shores, CA, USA    |
 |                         All rights reserved.                              |
 +===========================================================================+
 |  HISTORY                                                                  |
 +===========================================================================*/
package xxgam.oracle.apps.xbol.tm.RatesM.InsertRate.webui;

import oracle.apps.fnd.common.VersionInfo;
import oracle.apps.fnd.framework.webui.OAControllerImpl;
import oracle.apps.fnd.framework.webui.OAPageContext;
import oracle.apps.fnd.framework.webui.beans.OAWebBean;
/*Added libraries*/
import oracle.apps.fnd.framework.OAApplicationModule;

import oracle.jbo.domain.Number;

import oracle.apps.fnd.common.MessageToken;
import oracle.apps.fnd.framework.OAException;
import oracle.apps.fnd.framework.OAViewObject;
import oracle.apps.fnd.framework.webui.OAWebBeanConstants;
import oracle.apps.fnd.framework.webui.beans.layout.OAQueryBean;

import oracle.jbo.domain.Number;

import xxgam.oracle.apps.xbol.tm.RatesM.InsertRate.server.InsertRateAMImpl;

/**
 * Controller for ...
 */
public class InsertRateCO extends OAControllerImpl {
    public static final String RCS_ID = "$Header$";
    public static final boolean RCS_ID_RECORDED = 
        VersionInfo.recordClassVersion(RCS_ID, "%packagename%");

    /**
     * Layout and page setup logic for a region.
     * @param pageContext the current OA page context
     * @param webBean the web bean corresponding to the region
     */
    public void processRequest(OAPageContext pageContext, OAWebBean webBean) {
        super.processRequest(pageContext, webBean);
        System.out.println("*****************************************************Entro a PR");
        if (!pageContext.isFormSubmission()) {
            OAApplicationModule am = pageContext.getApplicationModule(webBean);
            am.invokeMethod("createRecord", null);
            System.out.println("Debug 1");
        } else
            System.out.println("Debug 2");
    }

    /**
     * Procedure to handle form submissions for form elements in
     * a region.
     * @param pageContext the current OA page context
     * @param webBean the web bean corresponding to the region
     */
    public void processFormRequest(OAPageContext pageContext, 
                                   OAWebBean webBean) {
        super.processFormRequest(pageContext, webBean);

        //  OAApplicationModule am = pageContext.getApplicationModule(webBean);
        InsertRateAMImpl am = 
            (InsertRateAMImpl)pageContext.getApplicationModule(webBean);

        OAApplicationModule am1 = pageContext.getApplicationModule(webBean);
        // OAQueryBean queryBean = (OAQueryBean)webBean.findChildRecursive("PageLayoutRN"); 
        // queryBean.clearSearchPersistenceCache(pageContext);


        if (pageContext.getParameter("Ok") != null) {

            // am1.invokeMethod("createRecord", null);

            OAViewObject vo = (OAViewObject)am.findViewObject("InsertRateVO1");
            // oracle.jbo.domain.Number IdTarifaNum = (oracle.jbo.domain.Number)am.invokeMethod("sequenceapply");
            // System.out.println("Id tarifa: " + IdTarifaNum);   
            //  vo.getCurrentRow().setAttribute("IdTarifa",IdTarifaNum);  

            String StrOrigin = 
                (String)vo.getCurrentRow().getAttribute("Origin");
            System.out.println("Origin " + StrOrigin);
            String StrZones = (String)vo.getCurrentRow().getAttribute("RZone");
            System.out.println("RZone " + StrZones);
            String StrDestination = 
                (String)vo.getCurrentRow().getAttribute("Destination");
            System.out.println("Destination " + StrDestination);
            String StrProviderNumber = 
                (String)vo.getCurrentRow().getAttribute("ProviderNumber");
            System.out.println("ProviderNumber " + StrProviderNumber);
            String StrProvider = 
                (String)vo.getCurrentRow().getAttribute("ProviderName");
            System.out.println("ProviderName " + StrProvider);
            String StrTransportMode = 
                (String)vo.getCurrentRow().getAttribute("RMode");
            System.out.println("TransportMode " + StrTransportMode);
            String StrCurrency = 
                (String)vo.getCurrentRow().getAttribute("Currency");
            System.out.println("Currency " + StrCurrency);
            oracle.jbo.domain.Number StrRate = 
                (oracle.jbo.domain.Number)vo.getCurrentRow().getAttribute("Rate");
            System.out.println("Rate " + StrRate);
            oracle.jbo.domain.Number StrManeuvers = 
                (oracle.jbo.domain.Number)vo.getCurrentRow().getAttribute("Maneuvers");
            System.out.println("Maneuvers " + StrManeuvers);
            oracle.jbo.domain.Number StrReparts = 
                (oracle.jbo.domain.Number)vo.getCurrentRow().getAttribute("Reparts");
            System.out.println("Reparts " + StrReparts);
            String StrCruce = 
                (String)vo.getCurrentRow().getAttribute("Intersection");
            System.out.println("Cruce " + StrCruce);
            oracle.jbo.domain.Date StrDateFrom = 
                (oracle.jbo.domain.Date)vo.getCurrentRow().getAttribute("DateFrom");
            System.out.println("DateFrom " + StrDateFrom);
            oracle.jbo.domain.Date StrDateTo = 
                (oracle.jbo.domain.Date)vo.getCurrentRow().getAttribute("DateTo");
            System.out.println("DateTo " + StrDateTo);
            String StrDistribution = 
                (String)vo.getCurrentRow().getAttribute("DistributionType");
            System.out.println("Distribution " + StrDistribution);
            String StrHyreType = 
                (String)vo.getCurrentRow().getAttribute("Classification");
            System.out.println("Hyretype " + StrHyreType);
            String StrType = (String)vo.getCurrentRow().getAttribute("TypeD");
            System.out.println("Type " + StrType);
            String TypeV = am.RateTypeD(StrType);
            System.out.println("TypeV: " + TypeV);

            vo.getCurrentRow().setAttribute("TypeV", TypeV);

            String strSalida = "";


            int check = 
                am.validateRecord(StrOrigin, StrZones, StrDestination, StrProviderNumber, 
                                  StrProvider, StrTransportMode, StrCurrency, 
                                  StrRate, StrManeuvers, StrReparts, StrCruce, 
                                  StrDateFrom, StrDateTo, StrDistribution, 
                                  StrHyreType, StrType, TypeV);


            System.out.println("ckeck: " + check);
            String WMessage = "Registro duplicado, verifique su información.";
            if (check > 0) {
                throw new OAException(WMessage, OAException.WARNING);
            }

            System.out.println("StrDateFrom.compareTo(StrDateTo): " + 
                               StrDateTo.compareTo(StrDateFrom));

            int x = StrDateTo.compareTo(StrDateFrom);
            if (x < 0) {
                String WMessage2 = "Verificar el intervalo de fechas dado.";

                throw new OAException(WMessage2, OAException.WARNING);

            }


            am.invokeMethod("apply");
            System.out.println("Guardado");

            String message = "Registro creado satisfactoriamente.";

            throw new OAException(message, OAException.CONFIRMATION);


        }

        if (pageContext.getParameter("New") != null) {
            System.out.println("New pressed");
            am1.invokeMethod("createRecord", null);
            System.out.println("nuevo registro creado");
        }


    }

}
