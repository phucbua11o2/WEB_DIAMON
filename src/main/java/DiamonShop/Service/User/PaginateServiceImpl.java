package DiamonShop.Service.User;

import org.springframework.stereotype.Service;

import DiamonShop.Dto.PaginatesDto;
@Service
public class PaginateServiceImpl {
	public PaginatesDto GetInfoPaginate(int totalData,int limit,int currentPage)
	{
		PaginatesDto paginate = new PaginatesDto();
		paginate.setLimit(limit);
		paginate.setTotalPage(SetInfoTotalPage(totalData,limit));
		paginate.setCurrentPage(checkCurrentPage(currentPage,paginate.getTotalPage()));	
		paginate.setStart(findStart(paginate.getCurrentPage(),limit));
		paginate.setEnd(findEnd(paginate.getStart(),limit,totalData));
		return paginate;
	}

	private int findEnd(int start, int limit, int totalData) {
		
		return start + limit > totalData ? totalData : (start + limit) - 1;
	}

	private int findStart(int currentPage, int limit) {
		return ((currentPage-1)*limit)+1;
	}

	private int SetInfoTotalPage(int totalData, int limit) {
		int totalPage = 0;
		totalPage = totalData / limit;
		totalPage = totalPage*limit <totalData ? totalPage + 1 : totalPage;
		return totalPage;
	}	
	public int checkCurrentPage(int currentPage,int totalPage)
	{
		if(currentPage < 1)
		{
			return 1;
		}
		if(currentPage > totalPage)
		{
			return totalPage;
		}
		return currentPage;
	}
}
