package hapExam.core.sales.service;

import java.util.List;

import com.hand.hap.core.IRequest;
import com.hand.hap.core.ProxySelf;
import com.hand.hap.system.service.IBaseService;

import hapExam.core.sales.dto.OrderVo;



public interface IOrderVoService extends IBaseService<OrderVo>,ProxySelf<OrderVo>{
	
	List<OrderVo> selectByOrderVo(IRequest requestContext, OrderVo orderVo, int page, int pagesize);

}
