package com.quangnhan.service.impl;

import java.sql.Timestamp;
import java.util.List;

import javax.inject.Inject;

import com.quangnhan.dao.IBaiVietDAO;
import com.quangnhan.dao.impl.BaiVietDAO;
import com.quangnhan.model.BaiVietModel;
import com.quangnhan.service.IBaiVietService;

public class BaiVietService implements IBaiVietService{
	
	/* sử dụng java servlet weld chứ không ai sử dụng basic như thế nửa 
	 * private IBaiVietDAO baiVietDAO;
	public BaiVietService() {
		baiVietDAO = new BaiVietDAO();
	}
	*/
	@Inject
	private IBaiVietDAO baiVietDAO;
	@Override
	public List<BaiVietModel> findAll() {
		return baiVietDAO.findAll();
	}
	@Override
	public BaiVietModel save(BaiVietModel baiVietModel) {
		//baiVietModel.setThoiGianTao(new Timestamp(System.currentTimeMillis()));
		Integer baiVietID = baiVietDAO.save(baiVietModel);
		return baiVietDAO.findOne(baiVietID);
		
	}
	@Override
	public BaiVietModel update(BaiVietModel updateBaiVietModel) {
		BaiVietModel oldBaiViet = baiVietDAO.findOne(updateBaiVietModel.getMa_BaiViet());
		//những  thứ UI trả về không có thì lấy giá trị cũ thế vào để truyền cho thèn update 
		baiVietDAO.update(updateBaiVietModel);
		return baiVietDAO.findOne(updateBaiVietModel.getMa_BaiViet());
	}
	@Override
	public void delete(int[] listMa_BaiViet) {
		for(int ma_BaiViet: listMa_BaiViet) {
			// delete khóa ngoại trước
			baiVietDAO.delete(ma_BaiViet);
		}
		
	}

}
