package org.gmjm.repo.es;

import java.util.List;

import org.gmjm.domain.Card;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface CardRepository extends ElasticsearchRepository<Card, String> {
	
	List<Card> findAll();
	Page<Card> findByColorsIn(List<String> colors, Pageable pageable);
	Page<Card> findByName(String name, Pageable pageable);
	
}
