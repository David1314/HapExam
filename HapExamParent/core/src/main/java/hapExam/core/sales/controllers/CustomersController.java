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

import hapExam.core.sales.dto.Customers;
import hapExam.core.sales.service.ICustomersService;

@Controller
public class CustomersController extends BaseController{
	
	@Autowired
	private ICustomersService customersService;
	
	@RequestMapping(value = "/core/customers/query")
    @ResponseBody
    public ResponseData getTasks(Customers customers, @RequestParam(defaultValue = DEFAULT_PAGE) int page,
            @RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pagesize, HttpServletRequest request) {
        IRequest requestContext = createRequestContext(request);
        return new ResponseData(customersService.selectByCustomers(requestContext, customers, page, pagesize));
    }
	
	
}
