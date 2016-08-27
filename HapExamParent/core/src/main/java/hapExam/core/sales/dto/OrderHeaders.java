package hapExam.core.sales.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

import com.hand.hap.system.dto.BaseDTO;
import com.sun.istack.NotNull;

@Table(name="hap_om_order_headers")
public class OrderHeaders extends BaseDTO{


	/**
	 * 
	 */
	private static final long serialVersionUID = -8364169621146482396L;

	@Id
    @Column
    private Long headerId;
	
	@Column
	@NotEmpty
	private String orderNumber;
	
	@Column
	@NotNull
	private Long companyId ;
	
	@Column
	@NotEmpty
	private Date orderDate;
	
	@Column
	@NotEmpty
	private String orderStatus;
	
	@Column
	@NotNull
	private Long customerId ;

	

	public Long getHeaderId() {
		return headerId;
	}

	public void setHeaderId(Long headerId) {
		this.headerId = headerId;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
