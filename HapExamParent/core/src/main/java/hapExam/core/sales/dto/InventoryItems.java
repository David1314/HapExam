package hapExam.core.sales.dto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

import com.hand.hap.system.dto.BaseDTO;
import com.sun.istack.NotNull;

@Table(name="hap_inv_inventory_items")
public class InventoryItems extends BaseDTO{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6477615649547794488L;

	@Id
    @Column
    @GeneratedValue
    private Long inventoryItemId;
	
	@Column
	@NotEmpty
	private String itemCode;
	
	@Column
	@NotEmpty
	private String itemUom;
	
	@Column
	@NotEmpty
	private String itemDescription;
	
	@Column
	private String orderFlag;

	public Long getInventoryItemId() {
		return inventoryItemId;
	}

	public void setInventoryItemId(Long inventoryItemId) {
		this.inventoryItemId = inventoryItemId;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemUom() {
		return itemUom;
	}

	public void setItemUom(String itemUom) {
		this.itemUom = itemUom;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public String getOrderFlag() {
		return orderFlag;
	}

	public void setOrderFlag(String orderFlag) {
		this.orderFlag = orderFlag;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
}
