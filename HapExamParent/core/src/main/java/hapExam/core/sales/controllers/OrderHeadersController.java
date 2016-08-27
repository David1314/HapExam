package hapExam.core.sales.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hand.hap.core.IRequest;
import com.hand.hap.core.exception.BaseException;
import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.system.dto.ResponseData;

import hapExam.core.sales.dto.OrderHeaders;
import hapExam.core.sales.service.IOrderHeadersService;

@Controller
public class OrderHeadersController extends BaseController{
	
	@Autowired
	private IOrderHeadersService orderHeadersService;
	
	@RequestMapping(value = "/core/orderHeader/query")
    @ResponseBody
    public ResponseData getTasks(OrderHeaders orderHeaders, @RequestParam(defaultValue = DEFAULT_PAGE) int page,
            @RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pagesize, HttpServletRequest request) {
        IRequest requestContext = createRequestContext(request);
        return new ResponseData(orderHeadersService.selectByOrderHeaders(requestContext, orderHeaders, page, pagesize));
    }
	
	@RequestMapping(value = "/core/orderHeader/queryOrderStatus")
    @ResponseBody
    public ResponseData getTasks1(OrderHeaders orderHeaders, @RequestParam(defaultValue = DEFAULT_PAGE) int page,
            @RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pagesize, HttpServletRequest request) {
        IRequest requestContext = createRequestContext(request);
        return new ResponseData(orderHeadersService.selectOrderStatus(requestContext, orderHeaders, page, pagesize));
    }
	
	@RequestMapping(value = "/core/orderHeader/submit", method = RequestMethod.POST)
    @ResponseBody
    public ResponseData submitFruit(@RequestBody List<OrderHeaders> orderHeadersList, BindingResult result, HttpServletRequest request)
            throws BaseException {
        getValidator().validate(orderHeadersList, result);
        if (result.hasErrors()) {
            ResponseData rd = new ResponseData(false);
            rd.setMessage(getErrorMessage(result, request));
            return rd;
        }
        IRequest requestContext = createRequestContext(request);
        return new ResponseData(orderHeadersService.batchUpdate(requestContext, orderHeadersList));
    }
}
