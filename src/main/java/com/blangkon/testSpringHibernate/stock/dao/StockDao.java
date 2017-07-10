package com.blangkon.exampleSpringHibernate.stock.dao;

import com.blangkon.exampleSpringHibernate.stock.model.Stock;

public interface StockDao {

	void save(Stock stock);
	void update(Stock stock);
	void delete(Stock stock);
	Stock findByStockCode(String stockCode);

}