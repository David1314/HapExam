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

import hapExam.core.sales.dto.OrderVo;
import hapExam.core.sales.service.IOrderVoService;

@Controller
public class OrderVoController extends BaseController{
	
	@Autowired
	private IOrderVoService orderVoService;
	
	@RequestMapping(value = "/core/orderVo/query")
    @ResponseBody
    public ResponseData getTasks(OrderVo orderVo, @RequestParam(defaultValue = DEFAULT_PAGE) int page,
            @RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pagesize, HttpServletRequest request) {
        IRequest requestContext = createRequestContext(request);
        return new ResponseData(orderVoService.selectByOrderVo(requestContext, orderVo, page, pagesize));
    }
	
}
