package org.sample.SessionTest.app.welcome;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * Handles requests for the application home page.
 */
@Controller
@SessionAttributes(value={"sessionData2"})
@RequestMapping("welcome")
public class HomeController {

    private static final Logger logger = LoggerFactory
            .getLogger(HomeController.class);
    
    @Inject
    SessionData sessionData;
    
    @ModelAttribute("sessionData2")
    public SessionData2 setSessionData2() {
    	return new SessionData2();
    }
    
    /**
     * Simply selects the home view to render by returning its name.
     */
    @RequestMapping(value = "/", method = {RequestMethod.GET, RequestMethod.POST})
    public String home(SessionData2 sessionData2, Locale locale, Model model) {
        logger.info("Welcome home! The client locale is {}.", locale);

        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG,
                DateFormat.LONG, locale);
        sessionData.setMessage("sessionData");
        sessionData2.setMessage("sessionData2");

        String formattedDate = dateFormat.format(date);

        model.addAttribute("serverTime", formattedDate);

        return "welcome/home";
    }

    @RequestMapping("sessionData")
    public String sessionData() {
    	return "session/sessionData";
    }
    @RequestMapping("sessionData_wo_fh")
    public String sessionDataWoFh() {
    	return "session/sessionData_wo_fh";
    }

    @RequestMapping("sessionData2")
    public String sessionData2() {
    	return "session/sessionData2";
    }
    @RequestMapping("sessionData2_wo_fh")
    public String sessionData2WoFh() {
    	return "session/sessionData2_wo_fh";
    }
    
    @RequestMapping("sessionDataClassName")
    public String sessionDataClassName() {
    	return "session/sessionDataClassName";
    }
    @RequestMapping("sessionDataClassName2")
    public String sessionDataClassName2() {
    	return "session/sessionDataClassName2";
    }
    @RequestMapping("sessionDataClassName3")
    public String sessionDataClassName3() {
    	return "session/sessionDataClassName3";
    }
    @RequestMapping("sessionData2ClassName")
    public String sessionData2ClassName() {
    	return "session/sessionData2ClassName";
    }
    @RequestMapping("sessionData2ClassName2")
    public String sessionData2ClassName2() {
    	return "session/sessionData2ClassName2";
    }
    @RequestMapping("sessionData2ClassName_wo_fh")
    public String sessionData2ClassNameWoFh() {
    	return "session/sessionData2ClassName_wo_fh";
    }
    @RequestMapping("sessionData2ClassName_wo_fh2")
    public String sessionData2ClassNameWoFh2() {
    	return "session/sessionData2ClassName_wo_fh2";
    }
    @RequestMapping("containsKey")
    public String containsKey() {
    	return "session/containsKey";
    }
    @RequestMapping("notnull")
    public String notnull() {
    	return "session/notnull";
    }
    @RequestMapping("noClassName")
    public String noClassName() {
    	return "session/noClassName";
    }
    @RequestMapping("noClassName2")
    public String noClassName2() {
    	return "session/noClassName2";
    }

}
