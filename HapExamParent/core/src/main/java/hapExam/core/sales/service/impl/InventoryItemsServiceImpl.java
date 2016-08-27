package hapExam.core.sales.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.service.impl.BaseServiceImpl;

import hapExam.core.sales.dto.InventoryItems;
import hapExam.core.sales.mapper.InventoryItemsMapper;
import hapExam.core.sales.service.IInventoryItemsService;

@Service
public class InventoryItemsServiceImpl extends BaseServiceImpl<InventoryItems> implements IInventoryItemsService{

	@Autowired
	private InventoryItemsMapper inventoryItemsMapper;

	@Override
	public List<InventoryItems> selectByInventoryItems(IRequest requestContext, InventoryItems inventoryItems, int page,
			int pagesize) {
		PageHelper.startPage(page, pagesize);
		return inventoryItemsMapper.selectByInventoryItems(inventoryItems);
	}
	
	

}
