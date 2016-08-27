package hapExam.core.sales.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.hand.hap.core.IRequest;
import com.hand.hap.core.annotation.StdWho;
import com.hand.hap.system.dto.DTOStatus;
import com.hand.hap.system.service.impl.BaseServiceImpl;

import hapExam.core.sales.dto.OrderHeaders;
import hapExam.core.sales.mapper.OrderHeadersMapper;
import hapExam.core.sales.service.IOrderHeadersService;

@Service
public class OrderHeadersServiceImpl extends BaseServiceImpl<OrderHeaders> implements IOrderHeadersService{

	@Autowired
	private OrderHeadersMapper orderHeadersMapper;
	
	
	@Override
	public List<OrderHeaders> selectByOrderHeaders(IRequest requestContext, OrderHeaders orderHeaders, int page,
			int pagesize) {
		PageHelper.startPage(page, pagesize);
		return orderHeadersMapper.selectByOrderHeaders(orderHeaders);
	}
	
	@Override
	public List<OrderHeaders> selectOrderStatus(IRequest requestContext, OrderHeaders orderHeaders, int page, int pagesize) {
		return orderHeadersMapper.selectOrderStatus();
	}
	
	@Override
	@Transactional(propagation = Propagation.SUPPORTS)
	public List<OrderHeaders> batchUpdate(IRequest requestContext, @StdWho List<OrderHeaders> orderHeadersList){
		for(OrderHeaders orderHeaders:orderHeadersList){
			if (orderHeaders.get__status() != null){
				switch (orderHeaders.get__status()){
					case DTOStatus.ADD:
						Long count = orderHeadersMapper.selectHeaderCount();
						if(count==0){
							count = 999L;
						}
						Long headerId =  count + 1;
						orderHeaders.setHeaderId(headerId);
						orderHeadersMapper.insertOrderHeaders(orderHeaders);
						break;
					case DTOStatus.UPDATE:
						orderHeadersMapper.updateOrderHeaders(orderHeaders);
	                    break;
					case DTOStatus.DELETE:
						orderHeadersMapper.deleteOrderHeaders(orderHeaders);
						break;
					default:
						break;
				}
			}
		}
		return orderHeadersList;
	}

	

	
	
	

}
