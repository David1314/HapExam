package hapExam.core.sales.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.service.impl.BaseServiceImpl;

import hapExam.core.sales.dto.OrderVo;
import hapExam.core.sales.mapper.OrderVoMapper;
import hapExam.core.sales.service.IOrderVoService;


@Service
public class OrderVoServiceImpl extends BaseServiceImpl<OrderVo> implements IOrderVoService {

	@Autowired
	OrderVoMapper orderVoMapper;
	
	@Override
	public List<OrderVo> selectByOrderVo(IRequest requestContext, OrderVo orderVo, int page, int pagesize) {
		PageHelper.startPage(page, pagesize);
		return orderVoMapper.selectByOrderVo(orderVo);
	}

	

}
