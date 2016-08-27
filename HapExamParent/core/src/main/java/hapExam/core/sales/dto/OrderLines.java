package hapExam.core.sales.dto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

import com.hand.hap.system.dto.BaseDTO;
import com.sun.istack.NotNull;

@Table(name="hap_om_order_lines")
public class OrderLines extends BaseDTO{


	/**
	 * 
	 */
	private static final long serialVersionUID = -501492664259583510L;

	@Id
    @Column
    @GeneratedValue
    private Long lineId;
	
	@Column
	@NotNull
	private Long headerId;
	
	@Column
	private Long lineNumber;
	
	@Column
	@NotNull
	private Long inventoryItemId;
	
	@Column
	@NotNull
	private Long orderQuantity;
	
	@Column
	private String orderQuantityUom;
	
	@Column
	@NotNull
	private Long unitSellingPrice;
	
	@Column
	@NotEmpty
	private String description;
	
	@Column
	private Long companyId;

	

	public Long getLineId() {
		return lineId;
	}

	public void setLineId(Long lineId) {
		this.lineId = lineId;
	}

	

	public Long getHeaderId() {
		return headerId;
	}

	public void setHeaderId(Long headerId) {
		this.headerId = headerId;
	}

	public Long getLineNumber() {
		return lineNumber;
	}

	public void setLineNumber(Long lineNumber) {
		this.lineNumber = lineNumber;
	}

	public Long getInventoryItemId() {
		return inventoryItemId;
	}

	public void setInventoryItemId(Long inventoryItemId) {
		this.inventoryItemId = inventoryItemId;
	}

	public Long getOrderQuantity() {
		return orderQuantity;
	}

	public void setOrderQuantity(Long orderQuantity) {
		this.orderQuantity = orderQuantity;
	}

	public String getOrderQuantityUom() {
		return orderQuantityUom;
	}

	public void setOrderQuantityUom(String orderQuantityUom) {
		this.orderQuantityUom = orderQuantityUom;
	}

	public Long getUnitSellingPrice() {
		return unitSellingPrice;
	}

	public void setUnitSellingPrice(Long unitSellingPrice) {
		this.unitSellingPrice = unitSellingPrice;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

	
}
