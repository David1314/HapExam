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

import hapExam.core.sales.dto.OrderLines;
import hapExam.core.sales.mapper.InventoryItemsMapper;
import hapExam.core.sales.mapper.OrderHeadersMapper;
import hapExam.core.sales.mapper.OrderLinesMapper;
import hapExam.core.sales.service.IOrderLinesService;

@Service
public class OrderLinesServiceImpl extends BaseServiceImpl<OrderLines> implements IOrderLinesService{

	@Autowired
	private OrderLinesMapper orderLinesMapper;
	
	@Autowired
	private InventoryItemsMapper inventoryItemsMapper;
	
	@Autowired
	private OrderHeadersMapper orderHeadersMapper;

	@Override
	public List<OrderLines> selectByOrderLines(IRequest requestContext, OrderLines orderLines, int page, int pagesize) {
		PageHelper.startPage(page, pagesize);
		return orderLinesMapper.selectByOrderLines(orderLines);
	}
	
	@Override
	@Transactional(propagation = Propagation.SUPPORTS)
	public List<OrderLines> batchUpdate(IRequest requestContext, @StdWho List<OrderLines> orderLinesList){
		for(OrderLines orderLines:orderLinesList){
			if (orderLines.get__status() != null){
				switch (orderLines.get__status()){
					case DTOStatus.ADD:
						//line_id
						Long count = orderLinesMapper.selectLinesCount();
						if(count==0){
							count = 999L;
						}
						Long lineId = count + 1;
						orderLines.setLineId(lineId);
						//行号
						Long lineNumber = orderLinesMapper.selectLineNumber(orderLines);
						orderLines.setLineNumber(lineNumber+1);
						//设置物料单位（产品单位）
						Long inventoryItemId = orderLines.getInventoryItemId();
						String orderQuantityUom = inventoryItemsMapper.selectByInventoryItemId(inventoryItemId);
						orderLines.setOrderQuantityUom(orderQuantityUom);
						//公司ID
						Long headerId = orderLines.getHeaderId();
						Long companyId = orderHeadersMapper.selectByHeaderId(headerId);
						orderLines.setCompanyId(companyId);
						
						orderLinesMapper.insertOrderLines(orderLines);
						break;
					case DTOStatus.UPDATE:
						orderLinesMapper.updateOrderLines(orderLines);
	                    break;
					case DTOStatus.DELETE:
						orderLinesMapper.deleteOrderLines(orderLines);
						break;
					default:
						break;
				}
			}
		}
		return orderLinesList;
	}


}
