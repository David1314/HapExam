package hapExam.core.sales.mapper;

import java.util.List;

import com.hand.hap.mybatis.common.Mapper;

import hapExam.core.sales.dto.InventoryItems;

public interface InventoryItemsMapper extends Mapper<InventoryItems>{
	List<InventoryItems> selectByInventoryItems(InventoryItems inventoryItems);
	
	//通过物料ID来查找物料单位（产品单位），在lines表中要使用到
	String selectByInventoryItemId(Long id);
    
   /* int insertInventoryItems(InventoryItems inventoryItems);
    
    int updateInventoryItems(InventoryItems inventoryItems);
    
    int deleteInventoryItems(InventoryItems inventoryItems);*/
}
