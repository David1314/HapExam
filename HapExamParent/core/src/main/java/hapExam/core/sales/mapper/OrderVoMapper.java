package hapExam.core.sales.mapper;

import java.util.List;

import com.hand.hap.mybatis.common.Mapper;

import hapExam.core.sales.dto.OrderVo;

public interface OrderVoMapper extends Mapper<OrderVo>{
	List<OrderVo> selectByOrderVo(OrderVo orderVo);
    

}
