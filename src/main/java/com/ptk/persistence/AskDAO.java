package com.ptk.persistence;

import java.util.List;

import com.ptk.domain.AskVO;

public interface AskDAO {
	public void insertAsk(AskVO ask);
	public List<AskVO> getAskList();
	public List<AskVO> getAskList(int page);
	public AskVO getAskPage(Integer askUID);
	public void updateAskActive(AskVO ask);
	public int getAskCount();
}
