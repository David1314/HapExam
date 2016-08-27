package hapExam.core.sales.mapper;

import java.util.List;

import com.hand.hap.mybatis.common.Mapper;

import hapExam.core.sales.dto.Companys;

public interface CompanysMapper extends Mapper<Companys>{
	List<Companys> selectByCompanys(Companys companys);
    
   /* int insertCompanys(Companys companys);
    
    int updateCompanys(Companys companys);
    
    int deleteCompanys(Companys companys);*/
}
