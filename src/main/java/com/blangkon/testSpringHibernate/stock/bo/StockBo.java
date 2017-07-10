package com.blangkon.exampleSpringHibernate.stock.bo;

import com.blangkon.exampleSpringHibernate.stock.model.Stock;

public interface StockBo {

	void save(Stock stock);
	void update(Stock stock);
	void delete(Stock stock);
	Stock findByStockCode(String stockCode);
}
