package hybrid.webapp;

import java.util.List;
import java.util.TimeZone;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//Coc (Convention Over Configuration)
@Controller
@RequestMapping("/dept")
public class DeptController {
	
	static Log log = LogFactory.getLog(DeptController.class);
	
	List<String> colors;
	
	public void setColors(List<String> colors){
		this.colors = colors;
	}
	
	@RequestMapping(value="/select")
	public String select(Model model){
		log.info("############################");
		log.info("select()");
		log.info("############################");
		
		model.addAttribute("colors", colors);
		
		return "dept/select";
	}
	
	@RequestMapping("selectall")
	public String selectAll(Model model){
		log.info("############################");
		log.info("selectAll()");
		log.info("############################");
		
		String[] tzs = TimeZone.getAvailableIDs();
		model.addAttribute("tzs", tzs);
		
		return "dept/selectall";
	}

}
