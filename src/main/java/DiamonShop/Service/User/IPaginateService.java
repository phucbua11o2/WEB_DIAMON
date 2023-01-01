package DiamonShop.Service.User;

import org.springframework.stereotype.Service;

import DiamonShop.Dto.PaginatesDto;

@Service
public interface IPaginateService {
	public PaginatesDto GetInfoPaginate(int totalData,int limit,int currentPage);
}
