package com.acorn.baemin.seller.repository;

import java.util.List;

import com.acorn.baemin.domain.AnswerDTO;
import com.acorn.baemin.domain.MenuDTO;
import com.acorn.baemin.domain.ReviewDTO;
import com.acorn.baemin.domain.SellerDTO;
import com.acorn.baemin.domain.StoreDTO;



public interface SellerRepositoryI {
	
	
	// 태민
	// 메뉴관리탭
	// 메뉴 분류 조회(중복제거)
	public List<MenuDTO> selectMenuClassification();
	// 메뉴 전체 내용 조회
	public List<MenuDTO> selectAllMenuInfo(Integer storeCode);
	// 메뉴 분류 수정
	public int updateMenuClassification(String menuClassification);
	// 메뉴 등록
	public int insertMenu(MenuDTO menu);
	// 메뉴 수정
	public int updateMenu(MenuDTO menu);
	// 메뉴 삭제
	public int deleteMenu(Integer menuCode);
	
	
	// 가게정보관리탭
	// 가게정보 조회
	public StoreDTO selectStoreInfo(int storeCode);
	// 사장님정보 조회
	public SellerDTO selectSellerInfo(int sellerCode);
	// 매장정보 일부수정(가게소개, 운영시간, 매장주소)
	public int updateStoreSubInfo(StoreDTO store);
	// 사장님정보 일부수정(이름, 사업자등록번호)
	public int updateSellerSubInfo(SellerDTO seller);
	
	// 리뷰관리탭
	// 리뷰 전체 조회
	public List<ReviewDTO> selectAllReview();
	// 답변 등록
	public int insertAnswer(String answerContent);
	// 답변 수정
	public int updateAnswer(String answerContent);
	// 답변 삭제
	public int deleteAnswer(int answerCode);
	
}
