package hapExam.core.sales.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.service.impl.BaseServiceImpl;

import hapExam.core.sales.dto.Companys;
import hapExam.core.sales.mapper.CompanysMapper;
import hapExam.core.sales.service.ICompanysService;

@Service
public class CompanysServiceImpl extends BaseServiceImpl<Companys> implements ICompanysService{

	@Autowired
	private CompanysMapper companysMapper;
	
	@Override
	public List<Companys> selectByCompanys(IRequest requestContext, Companys companys, int page, int pagesize) {
		PageHelper.startPage(page, pagesize);
		return companysMapper.selectByCompanys(companys);
	}

}
