package hapExam.core.sales.service;

import java.util.List;

import com.hand.hap.core.IRequest;
import com.hand.hap.core.ProxySelf;
import com.hand.hap.system.service.IBaseService;

import hapExam.core.sales.dto.InventoryItems;

public interface IInventoryItemsService extends IBaseService<InventoryItems>, ProxySelf<IInventoryItemsService>{
	
	List<InventoryItems> selectByInventoryItems(IRequest requestContext, InventoryItems inventoryItems, int page, int pagesize);
}
