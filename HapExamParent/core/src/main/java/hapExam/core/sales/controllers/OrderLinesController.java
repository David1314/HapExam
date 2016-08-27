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

import hapExam.core.sales.dto.OrderLines;
import hapExam.core.sales.service.IOrderLinesService;

@Controller
public class OrderLinesController extends BaseController{
	
	@Autowired
	private IOrderLinesService orderLinesService;
	
	@RequestMapping(value = "/core/orderLines/query")
    @ResponseBody
    public ResponseData getTasks(OrderLines orderLines, @RequestParam(defaultValue = DEFAULT_PAGE) int page,
            @RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pagesize, HttpServletRequest request) {
        IRequest requestContext = createRequestContext(request);
        return new ResponseData(orderLinesService.selectByOrderLines(requestContext, orderLines, page, pagesize));
    }
	
	@RequestMapping(value = "/core/orderLines/submit", method = RequestMethod.POST)
    @ResponseBody
    public ResponseData submitFruit(@RequestBody List<OrderLines> orderLinesList, BindingResult result, HttpServletRequest request)
            throws BaseException {
        getValidator().validate(orderLinesList, result);
        for(OrderLines orderLine:orderLinesList){
        	orderLine.setLineNumber((long) 4);
        }
        if (result.hasErrors()) {
            ResponseData rd = new ResponseData(false);
            rd.setMessage(getErrorMessage(result, request));
            return rd;
        }
        IRequest requestContext = createRequestContext(request);
        return new ResponseData(orderLinesService.batchUpdate(requestContext, orderLinesList));
    }
}
