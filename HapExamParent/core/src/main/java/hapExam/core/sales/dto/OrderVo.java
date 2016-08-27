package hapExam.core.sales.dto;

import java.util.Date;

import com.hand.hap.system.dto.BaseDTO;

public class OrderVo extends BaseDTO{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8619494620832175371L;

	private Long customerId;
	
	private Long companyId;
	
	private String orderNumber;
	
	private Long inventoryItemId;
	
	private String orderStatus;
	
	private Long headerId;
	

	private String companyName;
	
	private String customerName;
	
	private Date orderDate;
	
	private Long orderTotal;
	
	

	public Long getHeaderId() {
		return headerId;
	}

	public void setHeaderId(Long headerId) {
		this.headerId = headerId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Long getOrderTotal() {
		return orderTotal;
	}

	public void setOrderTotal(Long orderTotal) {
		this.orderTotal = orderTotal;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public Long getInventoryItemId() {
		return inventoryItemId;
	}

	public void setInventoryItemId(Long inventoryItemId) {
		this.inventoryItemId = inventoryItemId;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	
	
}
