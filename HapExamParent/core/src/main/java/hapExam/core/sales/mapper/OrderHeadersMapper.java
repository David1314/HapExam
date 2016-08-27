package hapExam.core.sales.mapper;

import java.util.List;

import com.hand.hap.mybatis.common.Mapper;

import hapExam.core.sales.dto.InventoryItems;
import hapExam.core.sales.dto.OrderHeaders;

public interface OrderHeadersMapper extends Mapper<OrderHeaders>{
	List<OrderHeaders> selectByOrderHeaders(OrderHeaders orderHeaders);
	
	Long selectHeaderCount();
	
	//通过headerId来查找该订单的公司Id
	Long selectByHeaderId(Long headerId);
	
	//查找所有的订单状态
	List<OrderHeaders> selectOrderStatus();
    
    int insertOrderHeaders(OrderHeaders orderHeaders);
    
    int updateOrderHeaders(OrderHeaders orderHeaders);
    
    int deleteOrderHeaders(OrderHeaders orderHeaders);
}
