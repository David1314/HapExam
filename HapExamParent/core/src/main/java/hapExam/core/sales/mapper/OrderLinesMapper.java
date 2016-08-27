package hapExam.core.sales.mapper;

import java.util.List;

import com.hand.hap.mybatis.common.Mapper;

import hapExam.core.sales.dto.InventoryItems;
import hapExam.core.sales.dto.OrderHeaders;
import hapExam.core.sales.dto.OrderLines;

public interface OrderLinesMapper extends Mapper<OrderLines>{
	List<OrderLines> selectByOrderLines(OrderLines orderLines);
	
	Long selectLinesCount();
	
	Long selectLineNumber(OrderLines orderLines);
    
    int insertOrderLines(OrderLines orderLines);
    
    int updateOrderLines(OrderLines orderLines);
    
    int deleteOrderLines(OrderLines orderLines);
}
