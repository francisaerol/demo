/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.primefaces.captcha;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

/**
 *
 * @author FrancisAerol
 */
@ManagedBean(name = "captchaControl", eager = true)
public class captchaControl {

    public void submit() {
//        String message = " <br />  <br/> <b>PRIMEFACES HAS 119 COMPONENTS<b>";
        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Oops", "Rich Faces has 39 Components");
        FacesMessage msg2 = new FacesMessage(FacesMessage.SEVERITY_WARN,"Okay", "IceFaces has 70 Components");
        FacesMessage msg3 = new FacesMessage(FacesMessage.SEVERITY_INFO,"Awesome!!!","PrimeFaces has 119 Component (5.1)");
        FacesContext.getCurrentInstance().addMessage(null, msg);
        FacesContext.getCurrentInstance().addMessage(null, msg2);
        FacesContext.getCurrentInstance().addMessage(null, msg3);
    }
}
