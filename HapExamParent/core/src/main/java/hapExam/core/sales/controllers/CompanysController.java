package hapExam.core.sales.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hand.hap.core.IRequest;
import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.system.dto.ResponseData;

import hapExam.core.sales.dto.Companys;
import hapExam.core.sales.service.ICompanysService;

@Controller
public class CompanysController extends BaseController{
	
	@Autowired
	private ICompanysService companysService;
	
	@RequestMapping(value = "/core/companys/query")
    @ResponseBody
    public ResponseData getTasks(Companys companys, @RequestParam(defaultValue = DEFAULT_PAGE) int page,
            @RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pagesize, HttpServletRequest request) {
        IRequest requestContext = createRequestContext(request);
        return new ResponseData(companysService.selectByCompanys(requestContext, companys, page, pagesize));
    }
	
}
