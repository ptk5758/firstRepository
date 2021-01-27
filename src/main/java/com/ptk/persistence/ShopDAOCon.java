package com.ptk.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.ptk.domain.SellerVO;
import com.ptk.domain.ShopVO;
import com.ptk.domain.UserVO;

@Repository
public class ShopDAOCon implements ShopDAO{
	
	@Inject
	private SqlSession sqlSession;
	
	private static final String NAMESPACE = "org.zerock.mapper.ShopMapper";
	
	@Override
	public void insertSeller(SellerVO seller) {
		sqlSession.insert(NAMESPACE+".sellerInsert", seller);	
	}
	
	@Override
	public List<SellerVO> getSeller() {
		return sqlSession.selectList(NAMESPACE+".getSeller");
	}
	@Override
	public UserVO getSellerOne(String sessionID) {
		return sqlSession.selectOne(NAMESPACE+".getSellerOne", sessionID);
	}
	
	@Override
	public SellerVO getSellerVO(String sessionID) {
		return sqlSession.selectOne(NAMESPACE+".getSellerVO", sessionID);
	}
	
	@Override
	public void modifySeller(SellerVO seller) {
		sqlSession.update(NAMESPACE+".modifySeller", seller);
	}
	@Override
	public void itemInsert(ShopVO shop) {
		sqlSession.insert(NAMESPACE+".itemInsert", shop);
	}
	@Override
	public List<String> getCategory() {
		return sqlSession.selectList(NAMESPACE+".getCategory");
	}
	
	@Override
	public void addCategory(String category) {
		sqlSession.insert(NAMESPACE+".addCategory", category);
		
	}
	
	@Override
	public List<ShopVO> getSellerItemList(String sellerID) {
		return sqlSession.selectList(NAMESPACE+".getSellerItem", sellerID);
	}

}
